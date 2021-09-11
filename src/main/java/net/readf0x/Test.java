package net.readf0x;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.readf0x.tool.CustomAxeItem;
import net.readf0x.tool.CustomHoeItem;
import net.readf0x.tool.CustomPickaxeItem;


public class Test implements ModInitializer {

    //Vine Boom
    public static final BineVoom VINE_BOOM = new BineVoom(new BineVoom.Settings().group(ItemGroup.MISC).maxCount(1));
    public static final Identifier VINE_BOOM_SOUND_ID = new Identifier("readfox:vine_boom");
    public static SoundEvent ITEM_VINE_BOOM_ACTIVATE = new SoundEvent(VINE_BOOM_SOUND_ID);

    //Prismarine Tools
    public static ToolItem PRISMARINE_SWORD = new SwordItem(PrismarineToolMaterial.INSTANCE, 3, -2.4f, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem PRISMARINE_PICKAXE = new CustomPickaxeItem(PrismarineToolMaterial.INSTANCE, 1, -2.8f, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem PRISMARINE_SHOVEL = new ShovelItem(PrismarineToolMaterial.INSTANCE, 1.5f, -3f, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem PRISMARINE_AXE = new CustomAxeItem(PrismarineToolMaterial.INSTANCE, 6, -3.2f, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem PRISMARINE_HOE = new CustomHoeItem(HoePrismarine.INSTANCE, 0, 0f, new Item.Settings().group(ItemGroup.TOOLS));

    @Override
    public void onInitialize() {

        System.out.println("It's alive!!!");

        //Vine Boom
        Registry.register(Registry.ITEM, new Identifier("readfox", "vine_boom"), VINE_BOOM);
        Registry.register(Registry.SOUND_EVENT, Test.VINE_BOOM_SOUND_ID, ITEM_VINE_BOOM_ACTIVATE);

        //Prismarine Tools
        Registry.register(Registry.ITEM, new Identifier("readfox", "prismarine_sword"), PRISMARINE_SWORD);
        Registry.register(Registry.ITEM, new Identifier("readfox", "prismarine_pickaxe"), PRISMARINE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("readfox", "prismarine_shovel"), PRISMARINE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("readfox", "prismarine_axe"), PRISMARINE_AXE);
        Registry.register(Registry.ITEM, new Identifier("readfox", "prismarine_hoe"), PRISMARINE_HOE);

    }

}
