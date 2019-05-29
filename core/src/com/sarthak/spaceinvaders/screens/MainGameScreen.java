package com.sarthak.spaceinvaders.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.sarthak.spaceinvaders.SpaceGame;

public class MainGameScreen implements Screen{
	
	SpaceGame game;
	Texture spaceship;
	public static final int SPEED = 240;
	float shipX, shipY;
	float screenWidth = Gdx.graphics.getWidth();
	float screenHeight = Gdx.graphics.getHeight();
	
	public MainGameScreen(SpaceGame game) {
		this.game = game;
	}

	@Override
	public void show() {
		spaceship = new Texture("spaceship.png");
		shipX = (Gdx.graphics.getWidth() - spaceship.getWidth())/2;
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		if(Gdx.input.isKeyPressed(Keys.RIGHT) && (shipX+spaceship.getWidth()) < Gdx.graphics.getWidth()) {
			shipX = shipX + SPEED*Gdx.graphics.getDeltaTime();
		}
		if(Gdx.input.isKeyPressed(Keys.LEFT) && shipX > 0) {
			shipX = shipX - SPEED*Gdx.graphics.getDeltaTime();
		}
		
		game.batch.begin();
		game.batch.draw(spaceship, shipX, shipY, 70, 100);
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
		spaceship.dispose();
		game.batch.dispose();
		
	}

}
