package net.minecraft.amare.swordcore.blocksword;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricMaterialBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class KeyBlock extends Block {


    public KeyBlock() {
        super(FabricBlockSettings.of(new FabricMaterialBuilder(MapColor.GOLD).lightPassesThrough()/* .allowsMovement() */.pistonBehavior(PistonBehavior.NORMAL).burnable().build())
        .luminance(18).dropsNothing().nonOpaque().hardness(50));
    }

    public KeyBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean shouldDropItemsOnExplosion(Explosion explosion) {
        // TODO Auto-generated method stub
        return super.shouldDropItemsOnExplosion(explosion);
    }

    @Override
    public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
        // TODO Auto-generated method stub
        return super.isTranslucent(state, world, pos);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand,
            BlockHitResult hit) {
        // TODO Auto-generated method stub
        return super.onUse(state, world, pos, player, hand, hit);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        // TODO Auto-generated method stub
        RenderLayer.getCutout();
        return super.getRenderType(state);
    }







}
