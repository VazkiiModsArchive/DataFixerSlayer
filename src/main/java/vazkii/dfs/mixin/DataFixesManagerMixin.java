package vazkii.dfs.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import com.mojang.datafixers.DataFixer;

import net.minecraft.util.datafix.DataFixers;
import vazkii.dfs.FakeDataFixer;

@Mixin(DataFixers.class)
public class DataFixesManagerMixin {

    /**
     * @reason Disable DFU for faster startup and lower memory usage
     * @author Vazkii
     */
	@Overwrite
	private static DataFixer createFixerUpper() {
		return new FakeDataFixer();
	}
	
}
