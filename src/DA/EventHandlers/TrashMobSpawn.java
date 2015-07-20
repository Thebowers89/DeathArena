package DA.EventHandlers;

import DA.DeathArenaMain;
import DA.ItemStacks;
import DA.TrashMobs;
import DA.ZombieBoss;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Random;

public class TrashMobSpawn implements Listener {

    DeathArenaMain plugin;

    public TrashMobSpawn(DeathArenaMain instance) {
        plugin = instance;
    }

    @EventHandler
    public void onEntityDamageEventByEntityEvent(EntityDamageByEntityEvent e) {
        if (e.getEntity().getCustomName() != null) {
            if (e.getEntity().getCustomName().equals(ChatColor.RED + "Shia Labeouf") || e.getEntity().getCustomName().equals(ChatColor.RED + "Baby Labeouf")) {
                Random rand = new Random();
                int integer;
                for (int counter = 1; counter <= 1; counter++) {
                    integer = 1 + rand.nextInt(4);
                    if (integer == 1) {
                        for (counter = 1; counter <= 1; counter++) {
                            integer = 1 + rand.nextInt(5);
                            if (integer == 1 || integer == 2) {
                                World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("Class.Boss.location.World"));
                                Double x = plugin.getConfig().getDouble("Class.Boss.location.X");
                                Double y = plugin.getConfig().getDouble("Class.Boss.location.Y");
                                Double z = plugin.getConfig().getDouble("Class.Boss.location.Z");
                                Location loc = new Location(w, x, y, z);

                                TrashMobs.zTrash(loc);
                            }
                        }
                    } else {
                        if (integer == 2) {
                            for (counter = 1; counter <= 1; counter++) {
                                integer = 1 + rand.nextInt(5);
                                if (integer == 1 || integer == 2) {
                                    World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("Class.Boss.location.World"));
                                    Double x = plugin.getConfig().getDouble("Class.Boss.location.X");
                                    Double y = plugin.getConfig().getDouble("Class.Boss.location.Y");
                                    Double z = plugin.getConfig().getDouble("Class.Boss.location.Z");
                                    Location loc = new Location(w, x, y, z);

                                    TrashMobs.sTrash(loc);
                                }
                            }
                        } else {
                            if (integer == 3) {
                                for (counter = 1; counter <= 1; counter++) {
                                    integer = 1 + rand.nextInt(5);
                                    if (integer == 1 || integer == 2) {
                                        World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("Class.Boss.location.World"));
                                        Double x = plugin.getConfig().getDouble("Class.Boss.location.X");
                                        Double y = plugin.getConfig().getDouble("Class.Boss.location.Y");
                                        Double z = plugin.getConfig().getDouble("Class.Boss.location.Z");
                                        Location loc = new Location(w, x, y, z);

                                        TrashMobs.spTrash(loc);
                                    }
                                }
                            } else {
                                if (integer == 4) {
                                    for (counter = 1; counter <= 1; counter++) {
                                        integer = 1 + rand.nextInt(5);
                                        if (integer == 1 || integer == 2) {
                                            World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("Class.Boss.location.World"));
                                            Double x = plugin.getConfig().getDouble("Class.Boss.location.X");
                                            Double y = plugin.getConfig().getDouble("Class.Boss.location.Y");
                                            Double z = plugin.getConfig().getDouble("Class.Boss.location.Z");
                                            Location loc = new Location(w, x, y, z);

                                            TrashMobs.wTrash(loc);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onEntityDeathEvent(EntityDeathEvent e) {
        Random rand = new Random();
        int integer;
        if (e.getEntity().getCustomName() != null) {
            if (e.getEntity().getCustomName().equals(ChatColor.RED + "Zombie") || e.getEntity().getCustomName().equals(ChatColor.RED + "Skeleton") || e.getEntity().getCustomName().equals(ChatColor.RED + "Spider")) {
                e.getDrops().clear();
            }

            if (e.getEntity().getCustomName().equals(ChatColor.RED + "Zombie") || e.getEntity().getCustomName().equals(ChatColor.RED + "Skeleton") || e.getEntity().getCustomName().equals(ChatColor.RED + "Spider")) {
                for (int counter = 1; counter <= 1; counter++) {
                    integer = 1 + rand.nextInt(20);
                    if (integer == 1) {
                        for (counter = 1; counter <= 1; counter++) {
                            integer = 1 + rand.nextInt(27);
                            if (integer == 1) {
                                e.getDrops().add(ItemStacks.Alchchainboot());
                            } else {
                                if (integer == 2) {
                                    e.getDrops().add(ItemStacks.Alchchainhchest());
                                } else {
                                    if (integer == 3) {
                                        e.getDrops().add(ItemStacks.Alchchainleg());
                                    } else {
                                        if (integer == 4) {
                                            e.getDrops().add(ItemStacks.Alchchainhelm());
                                        } else {
                                            if (integer == 5) {
                                                e.getDrops().add(ItemStacks.arrows());
                                            } else {
                                                if (integer == 6) {
                                                    e.getDrops().add(ItemStacks.milk());
                                                } else {
                                                    if (integer == 7) {
                                                        e.getDrops().add(ItemStacks.milk());
                                                    } else {
                                                        if (integer == 8) {
                                                            e.getDrops().add(ItemStacks.milk());
                                                        } else {
                                                            if (integer == 9) {
                                                                e.getDrops().add(ItemStacks.milk());
                                                            } else {
                                                                if (integer == 10) {
                                                                    e.getDrops().add(ItemStacks.bow());
                                                                } else {
                                                                    if (integer == 11) {
                                                                        e.getDrops().add(ItemStacks.milk());
                                                                    } else {
                                                                        if (integer == 12) {
                                                                            e.getDrops().add(ItemStacks.dChestplate());
                                                                        } else {
                                                                            if (integer == 13) {
                                                                                e.getDrops().add(ItemStacks.eiSword());
                                                                            } else {
                                                                                if (integer == 14) {
                                                                                    e.getDrops().add(ItemStacks.godApple());
                                                                                } else {
                                                                                    if (integer == 15) {
                                                                                        e.getDrops().add(ItemStacks.iChestplate());
                                                                                    } else {
                                                                                        if (integer == 16) {
                                                                                            e.getDrops().add(ItemStacks.netherWart());
                                                                                        } else {
                                                                                            if (integer == 17) {
                                                                                                e.getDrops().add(ItemStacks.RangerBow());
                                                                                            } else {
                                                                                                if (integer == 18) {
                                                                                                    e.getDrops().add(ItemStacks.iEchestplate());
                                                                                                } else {
                                                                                                    if (integer == 19) {
                                                                                                        e.getDrops().add(ItemStacks.Rangerleatherchest());
                                                                                                    } else {
                                                                                                        if (integer == 20) {
                                                                                                            e.getDrops().add(ItemStacks.TankedSword());
                                                                                                        } else {
                                                                                                            if (integer == 21) {
                                                                                                                e.getDrops().add(ItemStacks.Rangerleatherboot());
                                                                                                            } else {
                                                                                                                if (integer == 22) {
                                                                                                                    e.getDrops().add(ItemStacks.Rangerleatherhelmet());
                                                                                                                } else {
                                                                                                                    if (integer == 23) {
                                                                                                                        e.getDrops().add(ItemStacks.Rangerleatherleg());
                                                                                                                    } else {
                                                                                                                        if (integer == 24) {
                                                                                                                            e.getDrops().add(ItemStacks.TankdChestplate());
                                                                                                                        } else {
                                                                                                                            if (integer == 25) {
                                                                                                                                e.getDrops().add(ItemStacks.milk());
                                                                                                                            } else {
                                                                                                                                if (integer == 26) {
                                                                                                                                    e.getDrops().add(ItemStacks.dSword());
                                                                                                                                } else {
                                                                                                                                    if (integer == 27) {
                                                                                                                                        e.getDrops().add(ItemStacks.iSword());
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}