package io.github.shockycake.derpsong.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemCrispyPops extends ItemFood {
    String texture_LOC = "derpsong";
    String crispyPops_ICON = "crispy_pops";

    public ItemCrispyPops(int id, int healAmount, float saturation, boolean isWolfFood) {
        super(id, healAmount, saturation, isWolfFood);
        setCreativeTab(CreativeTabs.tabFood);
        setMaxStackSize(64);
        setUnlocalizedName("crispyPops");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        itemIcon = register.registerIcon(texture_LOC + ":" + crispyPops_ICON)
        ;
    }
}
