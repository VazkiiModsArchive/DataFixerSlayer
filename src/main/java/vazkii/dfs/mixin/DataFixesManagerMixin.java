package vazkii.dfs.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import com.mojang.datafixers.DataFixer;

import net.minecraft.util.datafix.DataFixesManager;
import vazkii.dfs.FakeDataFixer;

@Mixin(DataFixesManager.class)
public class DataFixesManagerMixin {

//	@Overwrite
//	private static DataFixer createFixer() {
//		return new FakeDataFixer();
//	}
	
}
