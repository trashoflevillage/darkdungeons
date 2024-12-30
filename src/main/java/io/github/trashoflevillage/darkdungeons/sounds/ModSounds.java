package io.github.trashoflevillage.darkdungeons.sounds;

import io.github.trashoflevillage.darkdungeons.DarkDungeons;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent ENCHANTER_AMBIENT = registerSoundEvent("enchanter_ambient");
    public static final SoundEvent ENCHANTER_HURT = registerSoundEvent("enchanter_hurt");
    public static final SoundEvent ENCHANTER_DEATH = registerSoundEvent("enchanter_death");

    public static RegistryKey<JukeboxSong> of(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(DarkDungeons.MOD_ID, id));
    }

    public static void registerSounds() {
        DarkDungeons.LOGGER.info(("Registering sounds for " + DarkDungeons.MOD_ID));
    }

    private static void registerReference(String name) {
        Identifier ID = Identifier.of(DarkDungeons.MOD_ID, name);
        Registry.registerReference(Registries.SOUND_EVENT, ID, SoundEvent.of(ID));
    }

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(DarkDungeons.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}
