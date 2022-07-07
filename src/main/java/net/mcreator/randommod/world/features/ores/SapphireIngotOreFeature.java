
package net.mcreator.randommod.world.features.ores;

public class SapphireIngotOreFeature extends OreFeature {

	public static SapphireIngotOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new SapphireIngotOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("random_mod:sapphire_ingot_ore", FEATURE,
				new OreConfiguration(SapphireIngotOreFeatureRuleTest.INSTANCE, RandomModModBlocks.SAPPHIRE_INGOT_ORE.get().defaultBlockState(), 7));
		PLACED_FEATURE = PlacementUtils.register("random_mod:sapphire_ingot_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(11), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(1), VerticalAnchor.absolute(63)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public SapphireIngotOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class SapphireIngotOreFeatureRuleTest extends RuleTest {

		static final SapphireIngotOreFeatureRuleTest INSTANCE = new SapphireIngotOreFeatureRuleTest();

		private static final com.mojang.serialization.Codec<SapphireIngotOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec
				.unit(() -> INSTANCE);
		private static final RuleTestType<SapphireIngotOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("random_mod:sapphire_ingot_ore_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(Blocks.STONE);
			}

			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
