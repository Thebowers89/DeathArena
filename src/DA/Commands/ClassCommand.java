package DA.Commands;


import DA.DeathArenaMain;
import DA.ItemStacks;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.UUID;

public class ClassCommand implements CommandExecutor {

    DeathArenaMain plugin;

    public ClassCommand(DeathArenaMain instance) {
        plugin = instance;
    }

    HashMap<UUID, String> playersList = new HashMap<UUID, String>();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
        if (commandLabel.equalsIgnoreCase("class")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (args[0].equalsIgnoreCase("select")) {
                    UUID uuid = player.getUniqueId();
                    String name = player.getName();
                    playersList.put(uuid, name);
                    sender.sendMessage("You may now select your class: Tank, Ranger, Alchemist");
                    return true;
                }
                if (playersList.containsKey(player.getUniqueId())) {
                    if (args[0].equalsIgnoreCase("tank")) {
                        Inventory pi = player.getInventory();

                        World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("Class.Tank.location.World"));
                        Double x = plugin.getConfig().getDouble("Class.Tank.location.X");
                        Double y = plugin.getConfig().getDouble("Class.Tank.location.Y");
                        Double z = plugin.getConfig().getDouble("Class.Tank.location.Z");

                        player.teleport(new Location(w, x, y, z));

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
                        ItemStack food = new ItemStack(Material.COOKED_BEEF, 32);
                        ItemStack gApple = new ItemStack(Material.GOLDEN_APPLE, 16);

                        pi.setItem(2, gApple);
                        pi.setItem(1, food);
                        pi.setItem(39, helmet);
                        pi.setItem(38, chest);
                        pi.setItem(37, leg);
                        pi.setItem(36, boot);
                        pi.setItem(0, sword);

                        sender.sendMessage(ChatColor.DARK_RED + "You have chosen the Tank class.");
                        playersList.remove(player.getUniqueId());
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("ranger")) {
                        Inventory pi = player.getInventory();

                        World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("Class.Ranger.location.World"));
                        Double x = plugin.getConfig().getDouble("Class.Ranger.location.X");
                        Double y = plugin.getConfig().getDouble("Class.Ranger.location.Y");
                        Double z = plugin.getConfig().getDouble("Class.Ranger.location.Z");

                        player.teleport(new Location(w, x, y, z));

                        ItemStack arrow = new ItemStack(Material.ARROW, 1);
                        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET, 1);
                        helmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                        ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
                        chest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                        ItemStack leg = new ItemStack(Material.LEATHER_LEGGINGS, 1);
                        leg.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                        ItemStack boot = new ItemStack(Material.LEATHER_BOOTS);
                        boot.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                        ItemStack bow = new ItemStack(Material.BOW, 1);
                        bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
                        bow.addEnchantment(Enchantment.ARROW_DAMAGE, 5);
                        bow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 1);

                        pi.setItem(0, bow);
                        pi.setItem(1, ItemStacks.food());
                        pi.setItem(27, arrow);
                        pi.setItem(36, boot);
                        pi.setItem(37, leg);
                        pi.setItem(38, chest);
                        pi.setItem(39, helmet);

                        sender.sendMessage(ChatColor.GREEN + "You have chosen the Ranger Class");
                        playersList.remove(player.getUniqueId());
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("alchemist")) {
                        Inventory pi = player.getInventory();

                        World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("Class.Alchemist.location.World"));
                        Double x = plugin.getConfig().getDouble("Class.Alchemist.location.X");
                        Double y = plugin.getConfig().getDouble("Class.Alchemist.location.Y");
                        Double z = plugin.getConfig().getDouble("Class.Alchemist.location.Z");

                        player.teleport(new Location(w, x, y, z));

                        ItemStack helmet = new ItemStack(Material.CHAINMAIL_HELMET, 1);
                        helmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                        helmet.addEnchantment(Enchantment.DURABILITY, 3);
                        ItemStack chest = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
                        chest.addEnchantment(Enchantment.DURABILITY, 3);
                        chest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                        ItemStack leg = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
                        leg.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                        leg.addEnchantment(Enchantment.DURABILITY, 3);
                        ItemStack boot = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
                        boot.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                        boot.addEnchantment(Enchantment.DURABILITY, 3);
                        ItemStack sword = new ItemStack(Material.WOOD_SWORD, 1);
                        sword.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                        ItemStack gapple = new ItemStack(Material.GOLDEN_APPLE, 4, (short) 1);

                        ItemStack feye = new ItemStack(Material.FERMENTED_SPIDER_EYE, 8);
                        ItemStack bottle = new ItemStack(Material.GLASS_BOTTLE, 24);
                        ItemStack eye = new ItemStack(Material.SPIDER_EYE, 4);
                        ItemStack melon = new ItemStack(Material.SPECKLED_MELON, 8);
                        ItemStack feather = new ItemStack(Material.SUGAR, 4);
                        ItemStack cream = new ItemStack(Material.MAGMA_CREAM, 2);
                        ItemStack rstone = new ItemStack(Material.REDSTONE, 24);
                        ItemStack powder = new ItemStack(Material.SULPHUR, 24);
                        ItemStack gcarrot = new ItemStack(Material.GOLDEN_CARROT, 1);
                        ItemStack tear = new ItemStack(Material.GHAST_TEAR, 4);
                        ItemStack bpowder = new ItemStack(Material.BLAZE_POWDER, 2);
                        ItemStack gStone = new ItemStack(Material.GLOWSTONE_DUST, 24);
                        ItemStack nWart = new ItemStack(Material.NETHER_STALK, 8);

                        pi.setItem(9, feye);
                        pi.setItem(10, bottle);
                        pi.setItem(11, eye);
                        pi.setItem(12, melon);
                        pi.setItem(13, feather);
                        pi.setItem(14, cream);
                        pi.setItem(15, rstone);
                        pi.setItem(16, powder);
                        pi.setItem(17, gcarrot);
                        pi.setItem(18, tear);
                        pi.setItem(19, bpowder);
                        pi.setItem(20, gStone);
                        pi.setItem(21, nWart);

                        pi.setItem(2, ItemStacks.food());
                        pi.setItem(1, gapple);
                        pi.setItem(0, sword);
                        pi.setItem(36, boot);
                        pi.setItem(37, leg);
                        pi.setItem(38, chest);
                        pi.setItem(39, helmet);

                        sender.sendMessage(ChatColor.BLUE + "You have chosen the Alchemist class.");
                        playersList.remove(player.getUniqueId());
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("dalek")) {
                        if (sender.isOp()) {
                            Inventory pi = player.getInventory();
                            ItemStack sword = new ItemStack(Material.DIAMOND_SWORD, 1);
                            sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1000);
                            ItemStack bow = new ItemStack(Material.BOW, 1);
                            bow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 1000);
                            bow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
                            ItemStack arrow = new ItemStack(Material.ARROW, 1);
                            pi.addItem(bow);
                            pi.addItem(arrow);
                            pi.addItem(sword);
                            pi.addItem(ItemStacks.trashzom());
                            playersList.remove(player.getUniqueId());
                            return true;
                        }
                        return false;
                    }
                    if (args[0] == null) {
                        sender.sendMessage("You need to enter a valid class.");
                        return true;
                    }
                    sender.sendMessage("Invalid Class");
                    return true;
                }
                sender.sendMessage("You are not on the list.");
                return true;
            }
            sender.sendMessage(ChatColor.RED + "Only Players can execute this command.");
            return true;
        }
        return false;
    }
}