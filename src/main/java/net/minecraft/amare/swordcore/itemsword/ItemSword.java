package net.minecraft.amare.swordcore.itemsword;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.amare.swordcore.SwordCoreMod;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ItemSword extends Item{

    public ItemSword(Settings settings){
        super(settings);
    }
    public ItemSword() {
        super(new FabricItemSettings().fireproof().maxDamage(8).group(SwordCoreMod.SWORD_GROUP));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(SoundEvents.ITEM_SHIELD_BLOCK, 1.0F, 1.0F);
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }

}
