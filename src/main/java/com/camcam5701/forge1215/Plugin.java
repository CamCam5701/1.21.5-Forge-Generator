package com.camcam5701.forge1215;

import net.mcreator.plugin.Plugin;
import net.mcreator.plugin.PluginInfo;
import net.mcreator.plugin.PluginLoader;
import net.mcreator.generator.Generator;
import net.mcreator.generator.GeneratorInfo;

@PluginInfo(name = "Forge 1.21.5 Generator", version = "0.0 IN-DEV")
public class Plugin implements PluginLoader {

    @Override
    public void load(Plugin plugin) {
        plugin.registerGenerator(new GeneratorInfo("1.21.5-Forge", Forge1215Generator::new));
    }
}