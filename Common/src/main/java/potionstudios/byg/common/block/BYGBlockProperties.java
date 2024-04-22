package potionstudios.byg.common.block;

import net.minecraft.core.Direction;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import org.jetbrains.annotations.NotNull;
import potionstudios.byg.common.block.nether.DoubleNetherPlantBlock;
import potionstudios.byg.common.block.nether.embur.EmburPlantBlock;
import potionstudios.byg.common.block.nether.glowstonegardens.HangingVinesBlock;
import potionstudios.byg.common.block.nether.glowstonegardens.HangingVinesPlantBlock;
import potionstudios.byg.common.block.nether.glowstonegardens.SoulShroomSporeBlock;
import potionstudios.byg.common.block.nether.glowstonegardens.SoulShroomSporeEndBlock;
import potionstudios.byg.common.block.nether.scorched.ScorchedPlantBlock;
import potionstudios.byg.common.block.nether.subzerohypogeal.SubzeroAshBlock;
import potionstudios.byg.common.block.nether.sythian.*;
import potionstudios.byg.common.block.nether.wailing.HangingBonesBlock;
import potionstudios.byg.common.block.nether.warped.BYGWarpedBushBlock;
import potionstudios.byg.common.block.nether.warped.BYGWarpedCoralPlantBlock;
import potionstudios.byg.common.block.nether.warped.BYGWarpedCoralWallFanBlock;
import potionstudios.byg.common.block.nether.weepingmire.LamentVineBlock;
import potionstudios.byg.common.block.nether.weepingmire.LamentVinePlantBlock;

import java.util.function.Supplier;

@SuppressWarnings("deprecation")
public class BYGBlockProperties {
    public static Supplier<BlockBehaviour.Properties> FIREPROOF_PLANT = () -> BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).forceSolidOff().noCollission().isViewBlocking((a, b, c) -> false).pushReaction(PushReaction.DESTROY);
    public static Supplier<BlockBehaviour.Properties> FIREPROOF_LEAVES = () -> BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).forceSolidOn().isViewBlocking((a, b, c) -> false).pushReaction(PushReaction.DESTROY);

    public static class BYGDoubleNetherPlant extends DoubleNetherPlantBlock {
        public BYGDoubleNetherPlant() {
            super(BlockBehaviour.Properties.copy(Blocks.CRIMSON_ROOTS)
                    .sound(SoundType.ROOTS)
                    .strength(0.0f)
                    .noCollission()
                    .noOcclusion()
            );
        }
    }

    public static class BYGSnowyPlant extends BYGSnowyPlants {
        public BYGSnowyPlant() {
            super(BlockBehaviour.Properties.copy(Blocks.GRASS)
                    .sound(SoundType.GRASS)
                    .strength(0.0f)
                    .noCollission()
                    .noOcclusion()
            );
        }
    }

    public static class BYGEmburLily extends BYGLilyBlock {
        public BYGEmburLily() {
            super(FIREPROOF_PLANT.get()
                            .sound(SoundType.LILY_PAD)
                            .instabreak()
                            .noOcclusion(),
                    Fluids.LAVA
            );
        }
    }

    public static class BYGEnderLily extends BYGLilyBlock {
        public BYGEnderLily() {
            super(BlockBehaviour.Properties.copy(Blocks.LILY_PAD),
                    Fluids.WATER
            );
        }
    }

    public static class BYGFrostMagma extends BYGFrostMagmaBlock {
        public BYGFrostMagma() {
            super(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .sound(SoundType.STONE)
                    .strength(0.2f)
                    .friction(0.98F)
                    .lightLevel((state) -> 10)
                    .requiresCorrectToolForDrops()

            );
        }
    }

    public static class BYGMagma extends MagmaBlock {
        public BYGMagma() {
            super(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .sound(SoundType.STONE)
                    .strength(0.2f)
                    .randomTicks()
                    .lightLevel((state) -> 10)
                    .requiresCorrectToolForDrops()
            );
        }
    }

    public static class BYGSubzeroAsh extends SubzeroAshBlock {
        public BYGSubzeroAsh() {
            super(BlockBehaviour.Properties.copy(Blocks.SNOW)
                    .sound(SoundType.SAND)
                    .strength(0.1f)
                    .speedFactor(0.6F)
            );
        }
    }

    public static class BYGSubzeroAshBlock extends Block {
        public BYGSubzeroAshBlock() {
            super(BlockBehaviour.Properties.copy(Blocks.SNOW)
                    .sound(SoundType.SAND)
                    .strength(0.2f)
            );
        }
    }

    public static class BYGMud extends Block {
        public BYGMud() {
            super(BlockBehaviour.Properties.copy(Blocks.DIRT)
                    .sound(SoundType.GRAVEL)
                    .strength(0.2f)
                    .speedFactor(0.4F)
            );
        }
    }

    public static class BYGNyliumSoulSand extends Block {
        public BYGNyliumSoulSand() {
            super(BlockBehaviour.Properties.copy(Blocks.SAND)
                    .sound(SoundType.SOUL_SAND)
                    .strength(0.5f)
                    .speedFactor(0.6F)

            );
        }
    }

    public static class BYGNyliumSoulSoil extends Block {
        public BYGNyliumSoulSoil() {
            super(BlockBehaviour.Properties.copy(Blocks.SAND)
                    .sound(SoundType.SOUL_SOIL)
                    .strength(0.5f)
            );
        }
    }

    public static class BYGQuartziteSand extends Block {
        public BYGQuartziteSand() {
            super(BlockBehaviour.Properties.copy(Blocks.SAND)
                    .sound(SoundType.SAND)
                    .strength(0.2f)
            );
        }
    }

    public static class HangingBones extends HangingBonesBlock {
        public HangingBones() {
            super(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .sound(SoundType.BONE_BLOCK)
                    .strength(0.0F)
                    .noCollission()
            );

        }
    }

    public static class ScorchedPlant extends ScorchedPlantBlock {
        public ScorchedPlant() {
            super(BlockBehaviour.Properties.copy(Blocks.GRASS)
                    .sound(SoundType.GRASS)
                    .strength(0.0F)
                    .noCollission()
                    .noOcclusion()
            );
        }
    }

    public static class BYGWarpedCoral extends BYGWarpedCoralPlantBlock {
        public BYGWarpedCoral() {
            super(BlockBehaviour.Properties.copy(Blocks.KELP)
                    .sound(SoundType.WET_GRASS)
                    .strength(0.0F)
                    .noCollission()
                    .noOcclusion()
                    .lightLevel((state) -> 8)
            );
        }
    }

    public static class BYGWarpedWallFanCoral extends BYGWarpedCoralWallFanBlock {
        public BYGWarpedWallFanCoral() {
            super(BlockBehaviour.Properties.copy(Blocks.CRIMSON_ROOTS)
                    .sound(SoundType.WET_GRASS)
                    .strength(0.0F)
                    .noCollission()
                    .noOcclusion()
                    .dropsLike(BYGBlocks.WARPED_CORAL.get())
                    .lightLevel((state) -> 8)
            );
        }
    }

    public static class BYGWarpedBush extends BYGWarpedBushBlock {
        public BYGWarpedBush() {
            super(BlockBehaviour.Properties.copy(Blocks.CRIMSON_ROOTS)
                    .sound(SoundType.GRASS)
                    .strength(0.0f)
                    .noCollission()
                    .noOcclusion()
                    .lightLevel((state) -> 8)
            );


        }
    }

    public static class SythianStalk extends SythianStalkBlock {
        public SythianStalk() {
            super(BlockBehaviour.Properties.copy(Blocks.BAMBOO)
                    .sound(SoundType.BAMBOO)
                    .strength(0.2f)
                    .noOcclusion()
                    .randomTicks()
                    .lightLevel((state) -> 8).dynamicShape()
            );
        }
    }

    public static class BYGWartBlock extends Block {
        public BYGWartBlock() {
            super(BlockBehaviour.Properties.copy(Blocks.GRASS)
                    .sound(SoundType.WART_BLOCK)
                    .strength(1.0F)
            );
        }
    }

    public static class BYGLamentPlant extends NetherSproutsBlock {
        public BYGLamentPlant() {
            super(FIREPROOF_PLANT.get()
                    .sound(SoundType.ROOTS)
                    .strength(0.0F)
                    .noCollission()
                    .noOcclusion()
            );
        }
    }

    public static class BYGLamentVinePlant extends LamentVinePlantBlock {
        public BYGLamentVinePlant() {
            super(FIREPROOF_LEAVES.get()
                    .sound(SoundType.WEEPING_VINES)
                    .strength(0.2f)
                    .randomTicks()
                    .noCollission()
            );
        }
    }

    public static class BYGLamentVine extends LamentVineBlock {
        public BYGLamentVine() {
            super(FIREPROOF_LEAVES.get()
                    .sound(SoundType.WEEPING_VINES)
                    .strength(0.2f)
                    .randomTicks()
                    .noCollission()
            );
        }
    }

    public static class BYGEmburPlant extends EmburPlantBlock {
        public BYGEmburPlant() {
            super(BlockBehaviour.Properties.copy(Blocks.CRIMSON_ROOTS)
                    .sound(SoundType.ROOTS)
                    .strength(0.0F)
                    .noCollission()
                    .noOcclusion()
            );
        }
    }

    public static class SythianSapling extends SythianSaplingBlock {
        public SythianSapling() {
            super(BlockBehaviour.Properties.copy(Blocks.BAMBOO_SAPLING)
                    .sound(SoundType.BAMBOO_SAPLING)
                    .strength(0.0f)
                    .noCollission()
                    .noOcclusion()
                    .randomTicks()
            );
        }
    }

    public static class SythianPlant extends BYGSythianPlantBlock {
        public SythianPlant() {
            super(BlockBehaviour.Properties.copy(Blocks.CRIMSON_ROOTS)
                    .sound(SoundType.ROOTS)
                    .strength(0.0f)
                    .noCollission()
                    .noOcclusion()
            );
        }
    }

    public static class BYGWarpedCoralBlock extends Block {
        public BYGWarpedCoralBlock() {
            super(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .sound(SoundType.CORAL_BLOCK)
                    .strength(0.2f)
                    .lightLevel((state) -> 8)
            );

        }
    }

    public static class BYGPollen extends BYGPollenBlock {
        public BYGPollen() {
            super(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .sound(SoundType.CORAL_BLOCK)
                    .strength(0.2f)
                    .randomTicks()
                    .noOcclusion()
                    .noCollission()
                    .lightLevel((state) -> 9)
            );
        }
    }

    public static class BYGThatch extends HayBlock {
        public BYGThatch() {
            super(BlockBehaviour.Properties.copy(Blocks.GRASS)
                    .sound(SoundType.GRASS)
                    .strength(0.5f)
            );
        }
    }

    public static class ThatchCarpet extends WoolCarpetBlock {
        public ThatchCarpet() {
            super(DyeColor.BROWN, BlockBehaviour.Properties.copy(Blocks.GRASS)
                    .sound(SoundType.GRASS)
                    .strength(0.5f)
            );
        }
    }

    public static class ThatchStairs extends StairBlock {
        public ThatchStairs() {
            super(BYGBlocks.CATTAIL_THATCH.defaultBlockState(), Properties.copy(BYGBlocks.CATTAIL_THATCH.get())
                    .sound(SoundType.GRASS)
                    .strength(0.5f)
            );

        }
    }

    public static class ThatchSlab extends SlabBlock {
        public ThatchSlab() {
            super(BlockBehaviour.Properties.copy(Blocks.GRASS)
                    .sound(SoundType.GRASS)
                    .strength(0.5f)
            );

        }
    }

    public static class BYGPoisonIvy extends PoisonIvyBlock {
        public BYGPoisonIvy() {
            super(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)
                    .sound(SoundType.GRASS)
                    .strength(0.2f)
                    .randomTicks()
                    .noCollission()
            );

        }
    }

    public static class BYGSkyrisVine extends VineBlock {
        public BYGSkyrisVine() {
            super(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)
                    .sound(SoundType.GRASS)
                    .strength(0.2f)
                    .randomTicks()
                    .noCollission()
            );

        }
    }

    public static class BYGHangingVine extends HangingVinesBlock {
        public BYGHangingVine() {
            super(BlockBehaviour.Properties.copy(Blocks.CRIMSON_ROOTS)
                    .sound(SoundType.WEEPING_VINES)
                    .strength(0.2f)
                    .randomTicks()
                    .noCollission()
                    .lightLevel((state) -> 14)

            );

        }
    }

    public static class BYGHangingVinePlant extends HangingVinesPlantBlock {
        public BYGHangingVinePlant() {
            super(BlockBehaviour.Properties.copy(Blocks.CRIMSON_ROOTS)
                    .sound(SoundType.WEEPING_VINES)
                    .strength(0.2f)
                    .randomTicks()
                    .noCollission()
            );

        }
    }

    public static class BYGSoulShroomSporeEnd extends SoulShroomSporeEndBlock {
        public BYGSoulShroomSporeEnd() {
            super(BlockBehaviour.Properties.copy(Blocks.CRIMSON_ROOTS)
                    .sound(SoundType.FUNGUS)
                    .strength(0.2f)
                    .randomTicks()
                    .noCollission()
                    .lightLevel((state) -> 14)

            );

        }
    }

    public static class BYGSoulShroomSpore extends SoulShroomSporeBlock {
        public BYGSoulShroomSpore() {
            super(BlockBehaviour.Properties.copy(Blocks.CRIMSON_ROOTS)
                    .sound(SoundType.FUNGUS)
                    .strength(0.2f)
                    .randomTicks()
                    .noCollission()
            );

        }
    }

    public static class BYGSythianHangingRootsPlant extends HangingSythanRootsPlantBlock {
        public BYGSythianHangingRootsPlant() {
            super(BlockBehaviour.Properties.copy(Blocks.CRIMSON_ROOTS)
                    .sound(SoundType.WEEPING_VINES)
                    .strength(0.2f)
                    .randomTicks()
                    .noCollission()
            );

        }
    }

    public static class BYGSythianHangingRoots extends HangingSythanRootsBlock {
        public BYGSythianHangingRoots() {
            super(BlockBehaviour.Properties.copy(Blocks.CRIMSON_ROOTS)
                    .sound(SoundType.WEEPING_VINES)
                    .strength(0.2f)
                    .randomTicks()
                    .noCollission()
            );

        }
    }

    public static class LogBlock extends RotatedPillarBlock {
        public LogBlock(Properties properties) {
            super(properties);
        }
    }

    public static class BYGNetherLog extends LogBlock {
        public BYGNetherLog() {
            super(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM)
                    .sound(SoundType.STEM)
                    .strength(2.0f)
            );

        }
    }

    public static class BYGNetherWood extends RotatedPillarBlock {
        public BYGNetherWood() {
            super(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM)
                    .sound(SoundType.STEM)
                    .strength(2.0f)
            );

        }
    }

    //Saving this for later do not touch
//
//    public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
//        return adjacentBlockState.getBlock() == this ? true : super.isSideInvisible(state, adjacentBlockState, side);
//    }

    public static class BYGPervadedNetherrack extends DropExperienceBlock {
        public BYGPervadedNetherrack() {
            super(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .sound(SoundType.NETHER_GOLD_ORE)
                    .strength(0.4F, 0.4F)
                    .lightLevel((state) -> 13)
                    .requiresCorrectToolForDrops()

            );

        }
    }

    public static class AnthraciteOre extends DropExperienceBlock {
        public AnthraciteOre() {
            super(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .sound(SoundType.NETHER_ORE)
                    .strength(0.4F, 0.4F)
                    .requiresCorrectToolForDrops()

            );

        }
    }


    public static class BlockHugeMushroom extends HugeMushroomBlock {
        public BlockHugeMushroom() {
            super(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.DIRT)
                    .sound(SoundType.STEM)
                    .strength(0.2F)
            );

            this.registerDefaultState(this.stateDefinition.any().setValue(NORTH, true).setValue(EAST, true).setValue(SOUTH, true).setValue(WEST, true).setValue(UP, true).setValue(DOWN, true));
        }
    }

    public static class BlockHugeNetherMushroom extends HugeMushroomBlock {
        public BlockHugeNetherMushroom() {
            super(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM).mapColor(MapColor.DIRT)
                    .sound(SoundType.STEM)
                    .strength(0.2F)
                    .lightLevel((state) -> 12)
            );

            this.registerDefaultState(this.stateDefinition.any().setValue(NORTH, true).setValue(EAST, true).setValue(SOUTH, true).setValue(WEST, true).setValue(UP, true).setValue(DOWN, true));
        }


        public boolean skipRendering(@NotNull BlockState state, BlockState adjacentBlockState, @NotNull Direction side) {
            return adjacentBlockState.getBlock() == this || super.skipRendering(state, adjacentBlockState, side);
        }
    }

    public static class BlockHugeNetherMushroomStem extends HugeMushroomBlock {
        public BlockHugeNetherMushroomStem() {
            super(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM).mapColor(MapColor.DIRT)
                    .sound(SoundType.STEM)
                    .strength(0.2F)
            );

            this.registerDefaultState(this.stateDefinition.any().setValue(NORTH, true).setValue(EAST, true).setValue(SOUTH, true).setValue(WEST, true).setValue(UP, true).setValue(DOWN, true));
        }


        public boolean skipRendering(@NotNull BlockState state, BlockState adjacentBlockState, @NotNull Direction side) {
            return adjacentBlockState.getBlock() == this || super.skipRendering(state, adjacentBlockState, side);
        }
    }

    public static class BulbisShell extends HugeMushroomBlock {
        public BulbisShell() {
            super(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(MapColor.COLOR_CYAN)
                    .sound(SoundType.SHROOMLIGHT)
                    .strength(0.2F)
                    .noOcclusion()
                    .lightLevel((state) -> 12)
            );

            this.registerDefaultState(this.stateDefinition.any().setValue(NORTH, true).setValue(EAST, true).setValue(SOUTH, true).setValue(WEST, true).setValue(UP, true).setValue(DOWN, true));
        }

        public boolean skipRendering(@NotNull BlockState state, BlockState adjacentBlockState, @NotNull Direction side) {
            return adjacentBlockState.getBlock() == this || super.skipRendering(state, adjacentBlockState, side);
        }
    }

    public static class BYGStoneStairs extends StairBlock {
        public BYGStoneStairs() {
            super(Blocks.COBBLESTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)

                    .sound(SoundType.STONE)
                    .strength(2.0f, 6.0f)
                    .requiresCorrectToolForDrops()
            );
        }
    }

    public static class BYGGlowCaneBlock extends Block {
        public BYGGlowCaneBlock() {
            super(BlockBehaviour.Properties.copy(Blocks.GRASS)
                    .sound(SoundType.SHROOMLIGHT)
                    .strength(0.3F)
                    .lightLevel((state) -> 15)
            );
        }
    }

    public static class BYGStone extends Block {
        public BYGStone() {
            super(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.5f, 6.0f)
                    .requiresCorrectToolForDrops()
            );
        }
    }

    public static class BYGNetherrack extends Block {
        public BYGNetherrack() {
            super(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLUE)
                    .sound(SoundType.NETHERRACK)
                    .strength(0.4F, 0.4F)
                    .requiresCorrectToolForDrops()
            );
        }
    }

    public static class BygNetherBricks extends Block {
        public BygNetherBricks(MapColor color) {
            super(BlockBehaviour.Properties.of()
                    .mapColor(color)
                    .sound(SoundType.NETHER_BRICKS)
                    .strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops()
            );
        }
    }

    public static class BYGPillar extends RotatedPillarBlock {
        public BYGPillar() {
            super(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.5f, 6.0f)
                    .requiresCorrectToolForDrops()
            );
        }
    }

    public static class BYGLantern extends LanternBlock {
        public BYGLantern() {
            super(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .sound(SoundType.LANTERN)
                    .strength(3.5F)
                    .lightLevel((state) -> 15)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
            );
        }
    }
}
