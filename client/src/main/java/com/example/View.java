package com.example;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class View implements ApplicationListener {

  private Skin skin;
  private Stage stage;

  @Override
  public void create() {
    skin = new Skin(Gdx.files.internal("skin-holo-dark-hdpi/Holo-dark-hdpi.json"));

    stage = new Stage(new ScreenViewport());
    Gdx.input.setInputProcessor(stage);

    TextButton textButton = new TextButton("Hello", skin);
    stage.addActor(textButton);
  }

  @Override
  public void render() {
    Gdx.gl.glClearColor(.9f, .9f, .9f, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    stage.act();
    stage.draw();
  }

  @Override
  public void pause() {

  }

  @Override
  public void resume() {

  }

  @Override
  public void resize(int width, int height) {
    stage.getViewport().update(width, height, true);
  }

  @Override
  public void dispose() {
    skin.dispose();
    stage.dispose();
  }
}