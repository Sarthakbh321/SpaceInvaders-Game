package com.sarthak.spaceinvaders.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.sarthak.spaceinvaders.SpaceGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Space Invaders";
		config.foregroundFPS = 60;
		config.resizable = false;
		config.width = 480;
		config.height = 720;
		new LwjglApplication(new SpaceGame(), config);
	}
}
