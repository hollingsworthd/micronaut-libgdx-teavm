package com.example;

import com.github.xpenatan.gdx.backends.teavm.TeaApplicationConfiguration;
import com.github.xpenatan.gdx.backends.web.WebApplication;
import com.github.xpenatan.gdx.backends.web.WebApplicationConfiguration;

public class Main {
  public static void main(String[] args) {
    WebApplicationConfiguration config = new TeaApplicationConfiguration("canvas");
    new WebApplication(new View(), config);
  }
}