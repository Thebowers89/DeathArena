package DA.Commands;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public class ClassCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
        if (commandLabel.equalsIgnoreCase("class")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (args[0].equalsIgnoreCase("tank")) {
                    Inventory pi = player.getInventory();

                    ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET, 1);
                    helmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                    ItemStack chest = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
                    chest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                    ItemStack leg = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
                    leg.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                    ItemStack boot = new ItemStack(Material.DIAMOND_BOOTS);
                    boot.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                    ItemStack sword = new ItemStack(Material.DIAMOND_SWORD, 1);
                    sword.addEnchantment(Enchantment.DAMAGE_UNDEAD, 2);
                    sword.addEnchantment(Enchantment.DAMAGE_ALL, 4);

                    pi.setItem(39, helmet);
                    pi.setItem(38, chest);
                    pi.setItem(37, leg);
                    pi.setItem(36, boot);
                    pi.setItem(0, sword);

                    sender.sendMessage(ChatColor.DARK_RED + "You have chosen the Tank class.");
                    return true;
                }
                if (args[0].equalsIgnoreCase("ranger")) {
                    Inventory pi = player.getInventory();

                    ItemStack arrow = new ItemStack(Material.ARROW, 1);
                    ItemStack helmet = new ItemStack(Material.LEATHER_HELMET, 1);
                    helmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
                    ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
                    chest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
                    ItemStack leg = new ItemStack(Material.LEATHER_LEGGINGS, 1);
                    leg.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
                    ItemStack boot = new ItemStack(Material.LEATHER_BOOTS);
                    boot.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
                    ItemStack bow = new ItemStack(Material.BOW, 1);
                    bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
                    bow.addEnchantment(Enchantment.ARROW_DAMAGE, 5);
                    bow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 1);

                    pi.setItem(0, bow);
                    pi.setItem(27, arrow);
                    pi.setItem(36, boot);
                    pi.setItem(37, leg);
                    pi.setItem(38, chest);
                    pi.setItem(39, helmet);

                    sender.sendMessage(ChatColor.GREEN + "You have chosen the Ranger Class");
                    return true;
                }
                if (args[0].equalsIgnoreCase("dalek")) {
                    if (sender.isOp()) {
                        Inventory pi = player.getInventory();
                        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD, 1);
                        sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 15);
                        ItemStack bow = new ItemStack(Material.BOW, 1);
                        bow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 20);
                        bow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
                        ItemStack arrow = new ItemStack(Material.ARROW, 1);
                        pi.addItem(bow);
                        pi.addItem(arrow);
                        pi.addItem(sword);
                        return true;
                    }
                    return false;
                }
                if (args[0] == null) {
                    sender.sendMessage("You need to enter a valid class.");
                    return true;
                }
                sender.sendMessage("Invaid Class");
                return false;
            }
            sender.sendMessage(ChatColor.RED + "Only Players can execute this command.");
            return true;
        }
        return false;
    }
}