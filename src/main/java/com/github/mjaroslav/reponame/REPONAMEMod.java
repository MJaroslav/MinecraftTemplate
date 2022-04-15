package com.github.mjaroslav.reponame;

import com.github.mjaroslav.reponame.common.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
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
    public void constr(@NotNull FMLConstructionEvent event) {
        proxy.constr(event);
    }

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

    @Mod.EventHandler
    public void interModComms(@NotNull FMLInterModComms.IMCEvent event) {
        proxy.interModComms(event);
    }

    @Mod.EventHandler
    public void loadComplete(@NotNull FMLLoadCompleteEvent event) {
        proxy.loadComplete(event);
    }

    @Mod.EventHandler
    public void serverAboutToStart(@NotNull FMLServerAboutToStartEvent event) {
        proxy.serverAboutToStart(event);
    }

    @Mod.EventHandler
    public void serverStarting(@NotNull FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }

    @Mod.EventHandler
    public void serverStarted(@NotNull FMLServerStartedEvent event) {
        proxy.serverStarted(event);
    }

    @Mod.EventHandler
    public void serverStopping(@NotNull FMLServerStoppingEvent event) {
        proxy.serverStopping(event);
    }

    @Mod.EventHandler
    public void serverStopped(@NotNull FMLServerStoppedEvent event) {
        proxy.serverStopped(event);
    }
}
