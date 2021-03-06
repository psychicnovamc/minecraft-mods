package psychicnova.matches;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class NeedleItem extends Item {
    public NeedleItem() {
        setMaxStackSize(64);
        setCreativeTab(MatchesMod.tabMatchesSurgical);
        setTextureName("matches:Needle");
        setUnlocalizedName("needle");
    }
    /*
    Makes it fully 3D
    */
    @Override
    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }
}