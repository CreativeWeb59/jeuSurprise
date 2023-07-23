package com.surprise;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.surprise.Surprise;
public class Main {
    public static void main(String[] args) {
        Lwjgl3ApplicationConfiguration cfg = new Lwjgl3ApplicationConfiguration();

        cfg.setTitle("Surprise");
        cfg.setWindowedMode(800, 600);

        new Lwjgl3Application(new Surprise(), cfg);
    }
}
