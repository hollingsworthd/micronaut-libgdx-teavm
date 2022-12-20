## Example App Using LibGDX, TeaVM, and Micronaut

Full-stack Java demo. Java GUI widgets rendered in HTML5 WebGL/Canvas on the browser. Java 8 through
version 17 bytecode conversion to JavaScript done by TeaVM. Widget/GUI toolkit provided by LibGDX.
Integrated using Gdx-teaVM, spun off from the Dragome project. Served by Micronaut. Built with
Gradle.

This "hello world" example is 1.07 MB in compressed HTTP transfer size (5.43 MB uncompressed). On a modest ~2020 notebook with OpenJDK 17, the server startup time is 950 MS, webpage load time is 350 MS, Java heap size after GC is 16 MB, total process memory size is 350 MB, the runnable uber JAR with embedded Netty/Micronaut is 15.3 MB on disk, and the build time is 45 seconds.

LibGDX apps such as this one can also be built as native, OpenGL-based apps on iOS, Android, Windows, Mac, and Linux, but that's not explored in this example.

PR's contributed under the Apache License Version 2.0 are welcome.

### The World's Most Exquisite Tech Stack

- [Gdx-teaVM](https://github.com/xpenatan/gdx-teavm)
- [LibGDX](https://github.com/libgdx/libgdx)
- [LibGDX Skins](https://github.com/czyzby/gdx-skins)
- [TeaVM](https://github.com/konsoletyper/teavm)
- [Micronaut](https://github.com/micronaut-projects/micronaut-core)

### Getting Started

From the project root, start the server by running `./gradlew run` and then visit http://localhost:8080/.

To build an executable, run `./gradlew clean build` which generates `micronaut-libgdx-teavm/server/build/libs/server-all.jar`. This can be started in production by running `java -jar server-all.jar`.
