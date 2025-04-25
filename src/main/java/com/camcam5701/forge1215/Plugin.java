package com.camcam5701.forge1215;

import net.mcreator.generator.Generator;
import net.mcreator.generator.GeneratorSetup;

public class Forge1215Generator implements Generator {

    @Override
    public void start(GeneratorSetup setup) {
        setup.getGenerator().setBuiltin(false); // ✅ This is the correct way!
    }

    @Override
    public String getGeneratorName() {
        return "1.21.5-Forge";
    }
}