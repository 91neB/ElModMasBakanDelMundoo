package net.ben19.emmbdm.item;

import net.ben19.emmbdm.ElModMasBakanDelMundo;
import net.ben19.emmbdm.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ENCHANTED_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ElModMasBakanDelMundo.MOD_ID, "enchanted"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.enchanted"))
                    .icon(() -> new ItemStack(ModItems.ENCHANTED_COBBLE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ENCHANTED_COBBLE);
                        entries.add(ModItems.ENCHANTED_DIAMOND);
                        entries.add(ModBlocks.MITHRIL_ORE_PURE);
                        entries.add(ModItems.DIAMOND_SPREADING);

                    }).build());

    public static void RegisterItemGroups(){

        ElModMasBakanDelMundo.LOGGER.info("Registering Item Groups for " + ElModMasBakanDelMundo.MOD_ID);

    }

}
