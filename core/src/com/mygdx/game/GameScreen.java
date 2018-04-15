package com.mygdx.game;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen implements Screen {
    private  RunnerGame runnerGame;
    private SpriteBatch batch ;
    private Texture    texture;

    public  GameScreen (RunnerGame runnerGame,SpriteBatch batch){
        this.runnerGame = runnerGame;
        this.batch      = batch ;

    }

    @Override
    public void show() {
        this.texture = new Texture("badlogic.jpg");

    }

    @Override
    public void render(float delta) {
        batch.begin();
        batch.draw(texture,0,0);
        batch.end();

    }

    @Override
    public void dispose() {

    }

    @Override
    public void resize(int width, int height) {
        //runnerGame.getV

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
}
