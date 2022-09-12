# MinecraftTemplate

Forge mod template for Minecraft 1.7.10.

## Features

- Uses [anatawa12/ForgeGradle-1.2](https://github.com/anatawa12/ForgeGradle-1.2).
- Uses Gradle Wrapper 7.5.1.
- Uses [tox1cozZ/mixin-booter-legacy](https://github.com/tox1cozZ/mixin-booter-legacy/) (optional).
- Uses [MJaroslav/MCInGameTester](https://github.com/MJaroslav/MCInGameTester/) (optional).
- Uses [bsideup/jabel](https://github.com/bsideup/jabel) (optional).
- Uses [JUnit4](https://junit.org/junit4/) in tests (optional).
- Uses [Lombok](https://projectlombok.org/).
- Uses [JetBrains/java-annotations](https://github.com/JetBrains/java-annotations).
- Configured for building additional `dev` (deobf) and `sources` artifacts.
- Configured maven-publish for additional `dev` (deobf) and `sources` artifacts (optional).
- Shading gradle configuration: `shade` (optional).
- Configured `FMLCorePlugin` manifest property: `group.projectNameInCamelCase.asm.ProjectNamePlugin` without spaces in
  project name (optional).
- Uses [GregTech](https://gregtech.overminddl1.com) maven repository.
- Uses CodeChickenLib (no curse link),  [CodeChickenCore](https://www.curseforge.com/minecraft/mc-mods/codechickencore)
  and [NotEnoughItems](https://www.curseforge.com/minecraft/mc-mods/notenoughitems) as dependencies from GregTech
  repository.
- Contains base mod structure.
- Contains configuration for [JitPack.io](https://jitpack.io) (you can not use it).
- Contains configured GitHub Actions for CI with MCInGameTester (you can not use it).
- Uses [WTFPL](LICENSE) as license (you can change it, LOL).
- Uses this [.gitignore](https://gist.github.com/dedunumax/54e82214715e35439227) with additions.
- Uses `run` as minecraft run directory (can be changed).

All optional things can be changed in [build.properties](build.properties) file.

## After cloning

- Change group and package.
- Change project name in [settings.gradle](settings.gradle).
- Rename `reponame` in package to match the project name.
- Rename [REPONAMEMod](src/main/java/com/github/mjaroslav/reponame/REPONAMEMod.java) class to match the project name.
- Change values in [ModInfo](src/main/java/com/github/mjaroslav/reponame/lib/ModInfo.java).
- Rename (or delete if is not
  used) [REPONAMEPlugin](src/main/java/com/github/mjaroslav/reponame/asm/REPONAMEPlugin.java).
- Change values in [mcmod.info](src/main/resources/mcmod.info).
- Don't forget change content of this [README.md](README.md) to your.
