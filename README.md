# Coding_Assessment

How to clone this project
=====================================================================================================
To clone the repository, go to public repository on GITHUB coding_assessment(https://github.com/zubairkhatri/coding_assessment)


coding_assessment project has two modules gpio-sc and sim-sc
1. sim-sc is just a tester or simulator
2. gpio-sc is using the ready-made pi4j api for GPIO to control appliances

SIM-SC Module
=========================
The whole project is maven project, so main parent pom.xml is under coding_assessment directory, where the build and installation of project jar is possible

1. After cloning the repository in intellij (I have used IntelliJ as an IDE).
2. Use Install Maven Lifecycle to generate the .jar file, which will sit individually in target folder of this module
3. i.e sim-sc/target
4. From target folder, you can give the command ../sim-sc/target/java -jar sim-sc-0.0.1-SNAPSHOT.jar, and then program will run and follow the prompts


GPIO-SC Module
==========================
1. This module requires native library which will be generated using C programming language, which will help create header file also
2. 