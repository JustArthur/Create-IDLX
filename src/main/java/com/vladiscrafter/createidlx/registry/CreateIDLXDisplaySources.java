package com.vladiscrafter.createidlx.registry;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.api.behaviour.display.DisplaySource;
import com.simibubi.create.api.registry.CreateBuiltInRegistries;
import com.vladiscrafter.createidlx.CreateIDLX;
import com.vladiscrafter.createidlx.content.source.CurrentFloorExtendedDisplaySource;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.RegisterEvent;

public class CreateIDLXDisplaySources {

    public static final DisplaySource CURRENT_FLOOR_EXTENDED = new CurrentFloorExtendedDisplaySource();

    public static void register(RegisterEvent event) {
        if (!event.getRegistryKey().equals(CreateBuiltInRegistries.DISPLAY_SOURCE.key())) return;

        registerByBlock(CURRENT_FLOOR_EXTENDED, "current_floor_extended", AllBlocks.ELEVATOR_CONTACT.get());
    }

    private static void registerByBlock(DisplaySource displaySource, String displaySourceId, Block block) {
        ResourceLocation displaySourceIdRL = CreateIDLX.asResource(displaySourceId);
        Registry.register(CreateBuiltInRegistries.DISPLAY_SOURCE, displaySourceIdRL, displaySource);
        DisplaySource.BY_BLOCK.add(block, displaySource);
    }
}
