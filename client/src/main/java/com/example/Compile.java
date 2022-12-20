package com.example;

import com.github.xpenatan.gdx.backends.teavm.TeaBuildConfiguration;
import com.github.xpenatan.gdx.backends.teavm.TeaBuilder;
import com.github.xpenatan.gdx.backends.web.gen.SkipClass;
import java.io.File;
import org.teavm.tooling.TeaVMTool;
import org.teavm.vm.TeaVMOptimizationLevel;

@SkipClass
public class Compile {

  public static void main(String[] args) {
    deleteDir(new File("../server/src/main/resources/webapp"));

    TeaBuildConfiguration conf = new TeaBuildConfiguration();
    conf.assetsPath.add(new File("./src/main/resources"));
    conf.webappPath = new File("../server/src/main/resources").getAbsolutePath();
    conf.obfuscate = true;

    TeaVMTool tool = TeaBuilder.config(conf);
    tool.setMainClass(Main.class.getName());
    tool.setOptimizationLevel(TeaVMOptimizationLevel.FULL);
    tool.setObfuscated(true);
    tool.setSourceMapsFileGenerated(false);
    TeaBuilder.build(tool);
  }

  private static void deleteDir(File dir) {
    File[] files = dir.listFiles();
    if (files != null) {
      for (File file : files) {
        deleteDir(file);
      }
    }
    dir.delete();
  }
}
