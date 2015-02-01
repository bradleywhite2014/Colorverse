package com.colorverse.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.colorverse.game.ColorVerse;
import com.colorverse.utils.Constants;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		
		config.title = "ColorVerse";
		config.width = Constants.APP_WIDTH;
		config.height = Constants.APP_HEIGHT;
		
		new LwjglApplication(new ColorVerse(), config);
		
		
	}
}
