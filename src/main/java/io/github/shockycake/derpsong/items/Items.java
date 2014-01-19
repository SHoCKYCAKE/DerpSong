package io.github.shockycake.derpsong.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import io.github.shockycake.derpsong.util.Config;
import io.github.shockycake.derpsong.util.recordRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Items {

    public static Item recordCrispy;
    public static Item crispyPop;

    public static void init() {
        addItems();
        addNames();
        registerRecipies();
    }

    public static void addItems() {
        recordCrispy = new ItemRecordCore(Config.recordCrispy_ID, "derpsong:crispy", "CRISPY").setTextureName("derpsong:record_crispy");
        crispyPop = new ItemCrispyPops(Config.crispyPop_ID, 11, 10, true);
    }

    public static void addNames() {
        recordRegistry.addItemName(recordCrispy, "Music Disc");
        LanguageRegistry.addName(crispyPop, "Crispy Pops");
    }

    public static void registerRecipies() {
        GameRegistry.addRecipe(new ItemStack(recordCrispy, 1),
                new Object[]{" I ",
                        "ICI",
                        " I ",

                        'I', Item.ingotIron,
                        'C', crispyPop,


                });
        GameRegistry.addRecipe(new ItemStack(crispyPop, 1),
                new Object[]{"WWW",
                        "BMB",
                        "WAW",

                        'W', Item.wheat,
                        'M', Item.bucketMilk,
                        'B', Item.bucketWater,
                        'A', Item.bowlEmpty,
                });
    }

}
