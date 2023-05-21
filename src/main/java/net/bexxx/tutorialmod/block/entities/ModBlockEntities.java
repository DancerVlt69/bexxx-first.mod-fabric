package net.bexxx.tutorialmod.block.entities;

import net.bexxx.tutorialmod.TutorialMod;
import net.bexxx.tutorialmod.block.ModBlocks;
import net.bexxx.tutorialmod.block.entities.custom.GemInfusingBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<GemInfusingBlockEntity> GEM_INFUSING_STATION;

    public static void registerBlockEntities() {
        GEM_INFUSING_STATION = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(TutorialMod.MODID, "gem_infusing_station"),
                FabricBlockEntityTypeBuilder.create(GemInfusingBlockEntity::new,
                        ModBlocks.GEM_INFUSING_STATION).build(null));
    }
}
