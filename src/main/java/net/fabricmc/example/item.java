public class sus implements ModInitializer {
 
    // an instance of our new item
    public static final Item FABRIC_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));
 
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("tutorial", "fabric_item"), FABRIC_ITEM);
    } 
}
