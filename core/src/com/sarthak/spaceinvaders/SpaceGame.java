package com.sarthak.spaceinvaders;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.sarthak.spaceinvaders.screens.MainGameScreen;
import com.sarthak.spaceinvaders.screens.MainMenuScreen;

public class SpaceGame extends Game {
	public SpriteBatch batch;
	
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		this.setScreen(new MainGameScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
}
