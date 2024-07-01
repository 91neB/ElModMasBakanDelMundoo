package net.ben19.emmbdm.block;

import net.ben19.emmbdm.ElModMasBakanDelMundo;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block MITHRIL_ORE_PURE = registerBlock("mithrilpure",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COAL_ORE).strength(9.0F, 9.0F)));

    private static Block registerBlock(String name, Block block){

        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ElModMasBakanDelMundo.MOD_ID, name), block);

    }

    private static Item registerBlockItem(String name, Block block){

        return Registry.register(Registries.ITEM, new Identifier(ElModMasBakanDelMundo.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

    }

    public static void RegisterModBlocks(){

        ElModMasBakanDelMundo.LOGGER.info("Registering Mod Blocks for " + ElModMasBakanDelMundo.MOD_ID);

    }

}
