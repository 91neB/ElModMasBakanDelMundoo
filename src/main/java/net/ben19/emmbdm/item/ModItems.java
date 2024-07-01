package net.ben19.emmbdm.item;

import net.ben19.emmbdm.ElModMasBakanDelMundo;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ENCHANTED_COBBLE = registerItem("enchantedcobblestone", new Item(new FabricItemSettings()));
    public static final Item ENCHANTED_DIAMOND = registerItem("enchanteddiamond", new Item(new FabricItemSettings()));
    public static final Item DIAMOND_SPREADING = registerItem("diamondspreading", new Item(new FabricItemSettings()));
    public static final Item MITHRIL = registerItem("mithril", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){

        entries.add(ENCHANTED_COBBLE);
        entries.add(ENCHANTED_DIAMOND);
        entries.add(MITHRIL);

    }

    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(ElModMasBakanDelMundo.MOD_ID, name), item);

    }

    public static void registerModItems() {
        ElModMasBakanDelMundo.LOGGER.info("Registering Mod Items for" + ElModMasBakanDelMundo.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }

}
