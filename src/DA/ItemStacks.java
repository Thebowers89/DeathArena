package DA;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class ItemStacks {

    public static ItemStack food() {
        ItemStack food = new ItemStack(Material.BREAD, 32);
        return food;
    }

    public static ItemStack bHead() {
        ItemStack bHead = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        SkullMeta sMeta = (SkullMeta) bHead.getItemMeta();
        sMeta.setOwner("Shia");
        bHead.setItemMeta(sMeta);
        return bHead;
    }

    public static ItemStack bChest() {
        ItemStack bChest = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        bChest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        return bChest;
    }

    public static ItemStack bLeg() {
        ItemStack bLeg = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        bLeg.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        return bLeg;
    }

    public static ItemStack bBoot() {
        ItemStack bBoot = new ItemStack(Material.DIAMOND_BOOTS, 1);
        bBoot.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        return bBoot;
    }

    public static ItemStack bSword() {
        ItemStack bSword = new ItemStack(Material.DIAMOND_SWORD, 1);
        bSword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 7);
        return bSword;
    }

}