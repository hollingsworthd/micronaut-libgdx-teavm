### Example app using LibGDX, TeaVM, and Micronaut

Full-stack Java demo. Traditional desktop widgets rendered in HTML5 WebGL/Canvas. Java 8 through
version 17 bytecode conversion to JavaScript done by TeaVM. Widget/GUI toolkit provided by LibGDX.
Integrated using Gdx-teaVM, spun off from the Dragome project. Served by Micronaut. Built with
Gradle.

This "hello world" example is 1.20 MB in compressed HTTP transfer size (6.14 MB uncompressed). On a modest ~2020 notebook with OpenJDK 17, the server startup time is 950 MS, page load time is 400 MS, Java heap size after GC is 20 MB, total process memory size is 350 MB, the runnable uber JAR with embedded Netty/Micronaut is 15.4 MB, and the build time is 50 seconds.

*The world's most exquisite tech stack:*

- [Gdx-teaVM](https://github.com/xpenatan/gdx-teavm)
- [LibGDX](https://github.com/libgdx/libgdx)
- [LibGDX Skins](https://github.com/czyzby/gdx-skins)
- [TeaVM](https://github.com/konsoletyper/teavm)
- [Micronaut](https://github.com/micronaut-projects/micronaut-core)
