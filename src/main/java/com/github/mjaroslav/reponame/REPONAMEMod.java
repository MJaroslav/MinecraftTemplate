package com.github.mjaroslav.reponame;

import com.github.mjaroslav.reponame.common.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.jetbrains.annotations.NotNull;

import static com.github.mjaroslav.reponame.lib.ModInfo.*;

@Mod(modid = MOD_ID, name = NAME, version = VERSION)
// TODO: Rename REPONAME
public class REPONAMEMod {
    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.Instance(MOD_ID)
    public static REPONAMEMod instance;

    @Mod.EventHandler
    public void preInit(@NotNull FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(@NotNull FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(@NotNull FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
