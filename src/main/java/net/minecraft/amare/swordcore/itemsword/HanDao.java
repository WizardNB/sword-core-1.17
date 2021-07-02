package net.minecraft.amare.swordcore.itemsword;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.amare.swordcore.SwordCoreMod;
import net.minecraft.util.Rarity;

public class HanDao extends ItemSword {

    public HanDao() {
        super(new FabricItemSettings().fireproof().maxCount(1).rarity(Rarity.RARE).group(SwordCoreMod.SWORD_GROUP));
    }



}

