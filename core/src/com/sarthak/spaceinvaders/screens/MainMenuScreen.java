package com.sarthak.spaceinvaders.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.sarthak.spaceinvaders.SpaceGame;

public class MainMenuScreen implements Screen{
	SpaceGame game;
	Texture playButton;
	float playButtonX, playButtonY;
	
	public MainMenuScreen(SpaceGame game) {
		this.game = game;
	}
	
	@Override
	public void show() {
		playButton = new Texture("playbutton.png");
		playButtonX = (Gdx.graphics.getWidth()-playButton.getWidth())/2;
		playButtonY = Gdx.graphics.getHeight()/2;
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		game.batch.begin();
		game.batch.draw(playButton, playButtonX, playButtonY);
		game.batch.end();
	}

	@Override
	public void resize(int width, int height) {

		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void dispose() {
		game.batch.dispose();
	}

}
