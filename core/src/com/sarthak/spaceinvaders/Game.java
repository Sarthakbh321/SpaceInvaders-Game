package com.sarthak.spaceinvaders;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Game extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	public static final int SPEED = 240;
	float shipX, shipY;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
			shipX = shipX + SPEED*Gdx.graphics.getDeltaTime();
		}
		if(Gdx.input.isKeyPressed(Keys.LEFT)) {
			shipX = shipX - SPEED*Gdx.graphics.getDeltaTime();
		}
		if(Gdx.input.isKeyPressed(Keys.UP)) {
			shipY = shipY + SPEED*Gdx.graphics.getDeltaTime();
		}
		if(Gdx.input.isKeyPressed(Keys.DOWN)) {
			shipY = shipY - SPEED*Gdx.graphics.getDeltaTime();
		}
		
		batch.begin();
		batch.draw(img, shipX, shipY);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
