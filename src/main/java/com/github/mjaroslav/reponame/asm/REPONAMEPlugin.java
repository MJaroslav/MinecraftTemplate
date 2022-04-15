package com.github.mjaroslav.reponame.asm;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

import java.util.Map;

// TODO: Rename REPONAME
@IFMLLoadingPlugin.Name("REPONAMEPlugin")
@IFMLLoadingPlugin.MCVersion("1.7.10")
@IFMLLoadingPlugin.SortingIndex(1001)
// TODO: Rename REPONAME
public class REPONAMEPlugin implements IFMLLoadingPlugin {
    public static boolean deobfuscated;

    @Override
    public String[] getASMTransformerClass() {
        // TODO: Set transformer class
        return null;
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
        deobfuscated = ((Boolean) data.get("runtimeDeobfuscationEnabled"));
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
