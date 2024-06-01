package potionstudios.byg.common.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public final class Material {
    public static final Material AIR = new Material.Builder(MapColor.NONE).noCollider().notSolidBlocking().nonSolid().replaceable().build();
    public static final Material STRUCTURAL_AIR = new Material.Builder(MapColor.NONE).noCollider().notSolidBlocking().nonSolid().replaceable().build();
    public static final Material PORTAL = new Material.Builder(MapColor.NONE).noCollider().notSolidBlocking().nonSolid().notPushable().build();
    public static final Material CLOTH_DECORATION = new Material.Builder(MapColor.WOOL).noCollider().notSolidBlocking().nonSolid().flammable().build();
    public static final Material PLANT = new Material.Builder(MapColor.PLANT).noCollider().notSolidBlocking().nonSolid().destroyOnPush().build();
    public static final Material WATER_PLANT = new Material.Builder(MapColor.WATER).noCollider().notSolidBlocking().nonSolid().destroyOnPush().build();
    public static final Material REPLACEABLE_PLANT = new Material.Builder(MapColor.PLANT)
            .noCollider()
            .notSolidBlocking()
            .nonSolid()
            .destroyOnPush()
            .replaceable()
            .flammable()
            .build();
    public static final Material REPLACEABLE_FIREPROOF_PLANT = new Material.Builder(MapColor.PLANT)
            .noCollider()
            .notSolidBlocking()
            .nonSolid()
            .destroyOnPush()
            .replaceable()
            .build();
    public static final Material REPLACEABLE_WATER_PLANT = new Material.Builder(MapColor.WATER)
            .noCollider()
            .notSolidBlocking()
            .nonSolid()
            .destroyOnPush()
            .replaceable()
            .build();
    public static final Material WATER = new Material.Builder(MapColor.WATER)
            .noCollider()
            .notSolidBlocking()
            .nonSolid()
            .destroyOnPush()
            .replaceable()
            .liquid()
            .build();
    public static final Material BUBBLE_COLUMN = new Material.Builder(MapColor.WATER)
            .noCollider()
            .notSolidBlocking()
            .nonSolid()
            .destroyOnPush()
            .replaceable()
            .liquid()
            .build();
    public static final Material LAVA = new Material.Builder(MapColor.FIRE)
            .noCollider()
            .notSolidBlocking()
            .nonSolid()
            .destroyOnPush()
            .replaceable()
            .liquid()
            .build();
    public static final Material TOP_SNOW = new Material.Builder(MapColor.SNOW)
            .noCollider()
            .notSolidBlocking()
            .nonSolid()
            .destroyOnPush()
            .replaceable()
            .build();
    public static final Material FIRE = new Material.Builder(MapColor.NONE)
            .noCollider()
            .notSolidBlocking()
            .nonSolid()
            .destroyOnPush()
            .replaceable()
            .build();
    public static final Material DECORATION = new Material.Builder(MapColor.NONE).noCollider().notSolidBlocking().nonSolid().destroyOnPush().build();
    public static final Material WEB = new Material.Builder(MapColor.WOOL).noCollider().notSolidBlocking().destroyOnPush().build();
    public static final Material SCULK = new Material.Builder(MapColor.COLOR_BLACK).build();
    public static final Material BUILDABLE_GLASS = new Material.Builder(MapColor.NONE).build();
    public static final Material CLAY = new Material.Builder(MapColor.CLAY).build();
    public static final Material DIRT = new Material.Builder(MapColor.DIRT).build();
    public static final Material GRASS = new Material.Builder(MapColor.GRASS).build();
    public static final Material ICE_SOLID = new Material.Builder(MapColor.ICE).build();
    public static final Material SAND = new Material.Builder(MapColor.SAND).build();
    public static final Material SPONGE = new Material.Builder(MapColor.COLOR_YELLOW).build();
    public static final Material SHULKER_SHELL = new Material.Builder(MapColor.COLOR_PURPLE).build();
    public static final Material WOOD = new Material.Builder(MapColor.WOOD).flammable().build();
    public static final Material NETHER_WOOD = new Material.Builder(MapColor.WOOD).build();
    public static final Material BAMBOO_SAPLING = new Material.Builder(MapColor.WOOD).flammable().destroyOnPush().noCollider().build();
    public static final Material BAMBOO = new Material.Builder(MapColor.WOOD).flammable().destroyOnPush().build();
    public static final Material WOOL = new Material.Builder(MapColor.WOOL).flammable().build();
    public static final Material EXPLOSIVE = new Material.Builder(MapColor.FIRE).flammable().notSolidBlocking().build();
    public static final Material LEAVES = new Material.Builder(MapColor.PLANT).flammable().notSolidBlocking().destroyOnPush().build();
    public static final Material GLASS = new Material.Builder(MapColor.NONE).notSolidBlocking().build();
    public static final Material ICE = new Material.Builder(MapColor.ICE).notSolidBlocking().build();
    public static final Material CACTUS = new Material.Builder(MapColor.PLANT).notSolidBlocking().destroyOnPush().build();
    public static final Material STONE = new Material.Builder(MapColor.STONE).build();
    public static final Material METAL = new Material.Builder(MapColor.METAL).build();
    public static final Material SNOW = new Material.Builder(MapColor.SNOW).build();
    public static final Material HEAVY_METAL = new Material.Builder(MapColor.METAL).notPushable().build();
    public static final Material BARRIER = new Material.Builder(MapColor.NONE).notPushable().build();
    public static final Material PISTON = new Material.Builder(MapColor.STONE).notPushable().build();
    public static final Material MOSS = new Material.Builder(MapColor.PLANT).destroyOnPush().build();
    public static final Material VEGETABLE = new Material.Builder(MapColor.PLANT).destroyOnPush().build();
    public static final Material EGG = new Material.Builder(MapColor.PLANT).destroyOnPush().build();
    public static final Material CAKE = new Material.Builder(MapColor.NONE).destroyOnPush().build();
    public static final Material AMETHYST = new Material.Builder(MapColor.COLOR_PURPLE).build();
    public static final Material POWDER_SNOW = new Material.Builder(MapColor.SNOW).nonSolid().noCollider().build();
    public static final Material FROGSPAWN = new Material.Builder(MapColor.WATER).noCollider().notSolidBlocking().nonSolid().destroyOnPush().build();
    public static final Material FROGLIGHT = new Material.Builder(MapColor.NONE).build();
    public static final Material DECORATED_POT = new Material.Builder(MapColor.TERRACOTTA_RED).destroyOnPush().build();
    private final MapColor color;
    private final PushReaction pushReaction;
    private final boolean blocksMotion;
    private final boolean flammable;
    private final boolean liquid;
    private final boolean solidBlocking;
    private final boolean replaceable;
    private final boolean solid;

    public Material(MapColor $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, PushReaction $$7) {
        this.color = $$0;
        this.liquid = $$1;
        this.solid = $$2;
        this.blocksMotion = $$3;
        this.solidBlocking = $$4;
        this.flammable = $$5;
        this.replaceable = $$6;
        this.pushReaction = $$7;
    }

    public Builder toBuilder() {
        return new Builder(this, color);
    }

    public Builder toBuilder(MapColor color) {
        return new Builder(this, color);
    }

    public BlockBehaviour.Properties toProperties() {
        var base = BlockBehaviour.Properties.of()
                .mapColor(color)
                .pushReaction(pushReaction)
                .isViewBlocking((state, world, pos) -> solidBlocking)
                .isSuffocating((state, world, pos) -> state.isCollisionShapeFullBlock(world, pos) && blocksMotion)
                .isViewBlocking((state, world, pos) -> state.isCollisionShapeFullBlock(world, pos) && solidBlocking);
        var baseAccess = (BlockBehaviorPropertiesAccess) base;
        baseAccess.byg$setFlammable(flammable);
        baseAccess.byg$setMaterial(this);
        if (!blocksMotion) {
            base = base.noCollission();
        }
        if (!solid) {
            base = base.noOcclusion();
        }
        if (replaceable) {
            base = base.replaceable();
        }
        if (liquid) {
            base = base.liquid();
        }
        return base;
    }

    public boolean isLiquid() {
        return this.liquid;
    }

    public boolean isSolid() {
        return this.solid;
    }

    public boolean blocksMotion() {
        return this.blocksMotion;
    }

    public boolean isFlammable() {
        return this.flammable;
    }

    public boolean isReplaceable() {
        return this.replaceable;
    }

    public boolean isSolidBlocking() {
        return this.solidBlocking;
    }

    public PushReaction getPushReaction() {
        return this.pushReaction;
    }

    public MapColor getColor() {
        return this.color;
    }

    public static class Builder {
        private PushReaction pushReaction = PushReaction.NORMAL;
        private boolean blocksMotion = true;
        private boolean flammable;
        private boolean liquid;
        private boolean replaceable;
        private boolean solid = true;
        private final MapColor color;
        private boolean solidBlocking = true;

        public Builder(Material $$0, MapColor color) {
            this.color = color;
            this.liquid = $$0.liquid;
            this.solid = $$0.solid;
            this.blocksMotion = $$0.blocksMotion;
            this.solidBlocking = $$0.solidBlocking;
            this.flammable = $$0.flammable;
            this.replaceable = $$0.replaceable;
            this.pushReaction = $$0.pushReaction;
        }

        public Builder(MapColor $$0) {
            this.color = $$0;
        }

        public Material.Builder liquid() {
            this.liquid = true;
            return this;
        }

        public Material.Builder nonSolid() {
            this.solid = false;
            return this;
        }

        public Material.Builder noCollider() {
            this.blocksMotion = false;
            return this;
        }

        Material.Builder notSolidBlocking() {
            this.solidBlocking = false;
            return this;
        }

        protected Material.Builder flammable() {
            this.flammable = true;
            return this;
        }

        public Material.Builder replaceable() {
            this.replaceable = true;
            return this;
        }

        protected Material.Builder destroyOnPush() {
            this.pushReaction = PushReaction.DESTROY;
            return this;
        }

        protected Material.Builder notPushable() {
            this.pushReaction = PushReaction.BLOCK;
            return this;
        }

        public Material build() {
            return new Material(this.color, this.liquid, this.solid, this.blocksMotion, this.solidBlocking, this.flammable, this.replaceable, this.pushReaction);
        }
    }
}
