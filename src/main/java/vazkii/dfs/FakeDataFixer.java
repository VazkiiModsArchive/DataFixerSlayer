package vazkii.dfs;

import java.util.Map;
import java.util.function.Supplier;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.serialization.Dynamic;

import net.minecraft.util.SharedConstants;

public class FakeDataFixer implements DataFixer {

	private static FakeSchema FAKE_SCHEMA = new FakeSchema();
	
	@Override
	public <T> Dynamic<T> update(TypeReference type, Dynamic<T> input, int version, int newVersion) {
		return input;
	}

	@Override
	public Schema getSchema(int key) {
		return FAKE_SCHEMA;
	}
	
	private static class FakeSchema extends Schema {

		public FakeSchema() {
			super(SharedConstants.getVersion().getWorldVersion(), null);
		}
		
		@Override
		public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
			return ImmutableMap.of();
		}
		
		@Override
		public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema schema) {
			return ImmutableMap.of();
		}
		
		@Override
		public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> entityTypes, Map<String, Supplier<TypeTemplate>> blockEntityTypes) {
			// NO-OP
		}
		
		@Override
		protected Map<String, Type<?>> buildTypes() {
			return ImmutableMap.of();
		}
		
		@Override
		public Type<?> getType(TypeReference type) {
			return null;
		}
		
		@Override
		public Type<?> getChoiceType(TypeReference type, String choiceName) {
			return null;
		}
		
		@Override
		public Type<?> getTypeRaw(TypeReference type) {
			return null;
		}
		
		@Override
		public TaggedChoiceType<?> findChoiceType(TypeReference type) {
			return null;
		}
		
	}
	
}