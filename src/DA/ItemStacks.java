package DA;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;

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

    public static ItemStack testpotato() {
        ItemStack tp = new ItemStack(Material.POTATO_ITEM, 1);
        ItemMeta mtp = tp.getItemMeta();
        mtp.setDisplayName("This is a test");
        tp.setItemMeta(mtp);
        return tp;
    }

    public static ItemStack netherWart() {
        ItemStack nWart = new ItemStack(Material.NETHER_STALK, 1);
        ItemMeta mnWart = nWart.getItemMeta();
        ArrayList<String> nWartLore = new ArrayList<String>();
        nWartLore.add("Alchemist Drop");
        mnWart.setLore(nWartLore);
        nWart.setItemMeta(mnWart);
        return nWart;
    }

    public static ItemStack dChestplate() {
        ItemStack dChest = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        return dChest;
    }

    public static ItemStack iChestplate() {
        ItemStack iChest = new ItemStack(Material.IRON_CHESTPLATE, 1);
        return iChest;
    }

    public static ItemStack TankdChestplate() {
        ItemStack tDChest = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        tDChest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        ItemMeta mtdchest = tDChest.getItemMeta();
        ArrayList<String> tankchestlore = new ArrayList<String>();
        tankchestlore.add("Tank Drop");
        mtdchest.setLore(tankchestlore);
        tDChest.setItemMeta(mtdchest);
        return tDChest;
    }

    public static ItemStack iEchestplate() {
        ItemStack iec = new ItemStack(Material.IRON_CHESTPLATE, 1);
        iec.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        return iec;
    }

    public static ItemStack iSword() {
        ItemStack iSword = new ItemStack(Material.IRON_SWORD, 1);
        return iSword;
    }

    public static ItemStack dSword() {
        ItemStack dSword = new ItemStack(Material.DIAMOND_SWORD, 1);
        return dSword;
    }

    public static ItemStack eiSword() {
        ItemStack eiSword = new ItemStack(Material.IRON_SWORD, 1);
        eiSword.addEnchantment(Enchantment.DAMAGE_ALL, 5);
        short rd = (short) ((short) eiSword.getDurability() / 4);
        eiSword.setDurability(rd);
        return eiSword;
    }

    public static ItemStack TankedSword() {
        ItemStack tedsword = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta mtedsword = tedsword.getItemMeta();
        tedsword.addEnchantment(Enchantment.DAMAGE_ALL, 5);
        ArrayList<String> tankSwordLore = new ArrayList<String>();
        tankSwordLore.add("Tank Drop");
        short rd = (short) ((short) tedsword.getDurability() / 4);
        tedsword.setDurability(rd);
        mtedsword.setLore(tankSwordLore);
        tedsword.setItemMeta(mtedsword);
        return tedsword;
    }

    public static ItemStack bow() {
        ItemStack bow = new ItemStack(Material.BOW, 1);
        return bow;
    }

    public static ItemStack RangerBow() {
        ItemStack rbow = new ItemStack(Material.BOW, 1);
        rbow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 5);
        rbow.addEnchantment(Enchantment.ARROW_FIRE, 1);
        rbow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
        ItemMeta mrbow = rbow.getItemMeta();
        ArrayList<String> RangerBowLore = new ArrayList<String>();
        RangerBowLore.add("Ranger Drop");
        mrbow.setDisplayName("Bane of Ghasts");
        mrbow.setLore(RangerBowLore);
        rbow.setItemMeta(mrbow);
        short rd = (short) ((short) rbow.getDurability() / 2);
        rbow.setDurability(rd);
        return rbow;
    }

    public static ItemStack arrows() {
        ItemStack a = new ItemStack(Material.ARROW, 16);
        return a;
    }

    public static ItemStack godApple() {
        ItemStack gapple = new ItemStack(Material.GOLDEN_APPLE, 1, (short) 3);
        return gapple;
    }

    public static ItemStack milk() {
        ItemStack m = new ItemStack(Material.MILK_BUCKET, 1);
        return m;
    }

    public static ItemStack Alchchainhelm() {
        ItemStack ach = new ItemStack(Material.CHAINMAIL_HELMET, 1);
        ach.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 8);
        ItemMeta mach = ach.getItemMeta();
        ArrayList<String> AlchemistLore = new ArrayList<String>();
        AlchemistLore.add("Alchemist Drop");
        mach.setLore(AlchemistLore);
        ach.setItemMeta(mach);
        return ach;
    }

    public static ItemStack Alchchainhchest() {
        ItemStack ach = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
        ach.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 8);
        ItemMeta mach = ach.getItemMeta();
        ArrayList<String> AlchemistLore = new ArrayList<String>();
        AlchemistLore.add("Alchemist Drop");
        mach.setLore(AlchemistLore);
        ach.setItemMeta(mach);
        return ach;
    }

    public static ItemStack Alchchainleg() {
        ItemStack ach = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
        ach.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 8);
        ItemMeta mach = ach.getItemMeta();
        ArrayList<String> AlchemistLore = new ArrayList<String>();
        AlchemistLore.add("Alchemist Drop");
        mach.setLore(AlchemistLore);
        ach.setItemMeta(mach);
        return ach;
    }

    public static ItemStack Alchchainboot() {
        ItemStack ach = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
        ach.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 8);
        ItemMeta mach = ach.getItemMeta();
        ArrayList<String> AlchemistLore = new ArrayList<String>();
        AlchemistLore.add("Alchemist Drop");
        mach.setLore(AlchemistLore);
        ach.setItemMeta(mach);
        return ach;
    }

    public static ItemStack Rangerleatherhelmet() {
        ItemStack ran = new ItemStack(Material.LEATHER_HELMET, 1);
        ran.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 8);
        ItemMeta mran = ran.getItemMeta();
        ArrayList<String> RangerLore = new ArrayList<String>();
        RangerLore.add("Ranger Drop");
        mran.setLore(RangerLore);
        ran.setItemMeta(mran);
        return ran;
    }

    public static ItemStack Rangerleatherchest() {
        ItemStack ran = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        ran.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 8);
        ItemMeta mran = ran.getItemMeta();
        ArrayList<String> RangerLore = new ArrayList<String>();
        RangerLore.add("Ranger Drop");
        mran.setLore(RangerLore);
        ran.setItemMeta(mran);
        return ran;
    }

    public static ItemStack Rangerleatherleg() {
        ItemStack ran = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        ran.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 8);
        ItemMeta mran = ran.getItemMeta();
        ArrayList<String> RangerLore = new ArrayList<String>();
        RangerLore.add("Ranger Drop");
        mran.setLore(RangerLore);
        ran.setItemMeta(mran);
        return ran;
    }

    public static ItemStack Rangerleatherboot() {
        ItemStack ran = new ItemStack(Material.LEATHER_BOOTS, 1);
        ran.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 8);
        ItemMeta mran = ran.getItemMeta();
        ArrayList<String> RangerLore = new ArrayList<String>();
        RangerLore.add("Ranger Drop");
        mran.setLore(RangerLore);
        ran.setItemMeta(mran);
        return ran;
    }

    public static ItemStack trashzom() {
        ItemStack tz = new ItemStack(Material.MONSTER_EGG, 1, (short) 54);
        ItemMeta mtz = tz.getItemMeta();
        mtz.setDisplayName(ChatColor.RED + "Zombie");
        tz.setItemMeta(mtz);
        return tz;
    }

}