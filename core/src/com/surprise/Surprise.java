package com.surprise;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Surprise implements ApplicationListener {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private float w;
	private float h;

	public void create(){
		this.w = (float) Gdx.graphics.getWidth();
		this.h = (float) Gdx.graphics.getHeight();
		(this.camera = new OrthographicCamera(this.w, this.h)).setToOrtho(false);
		GameManager.initialize(this.w, this.h);
	}

	public void dispose(){
		this.batch.dispose();
		GameManager.dispose();
	}

	public void render(){
		Gdx.gl.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
		Gdx.gl.glClear(16384);
		this.batch.setProjectionMatrix(this.camera.combined);
		InputManager.handleInput(this.camera);
		this.batch.begin();
		GameManager.renderGame(this.batch);
		this.batch.end();
	}

	public void resize(final int width, final int height){
	}
	public void pause(){
	}
	public void  resume(){

	}
}
//public class Surprise extends ApplicationAdapter {
//	SpriteBatch batch;
//	Texture img;
//
//	@Override
//	public void create () {
//		batch = new SpriteBatch();
//		img = new Texture("badlogic.jpg");
//	}
//
//	@Override
//	public void render () {
//		ScreenUtils.clear(1, 0, 0, 1);
//		batch.begin();
//		batch.draw(img, 0, 0);
//		batch.end();
//	}
//
//	@Override
//	public void dispose () {
//		batch.dispose();
//		img.dispose();
//	}
//}
