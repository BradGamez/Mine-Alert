package io.github.dougcodez.minealert.file;

import org.bukkit.configuration.file.FileConfiguration;

import java.util.Arrays;
import java.util.List;

public class WorldsFile extends AbstractFile{
    @Override
    public void registerFile() {
        createFile("worlds.yml");
        setData();
        saveFile();
    }

    @Override
    public void setData() {
        if (isFileNotEmpty()) return;
        final FileConfiguration config = getFileConfiguration();
        config.set("worlds", List.of("example_world"));
        config.setComments("worlds", List.of("Enter the worlds where you want the alerts to be disabled"));
    }
}
