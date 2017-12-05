# GroovyGrnd

A series of code snippets written in Groovy. This is used as a learning tool into the [Groovy](http://groovy-lang.org/) programming language.

## Getting Started

Simply clone the repository and run any code snippet. All the code snippets, or 90% that count have tests backing them. The structure 
of the tests directory directly matches the structure of the app directory, which houses all the code snippets.

```sh
$ git clone https://github.com/BrianLusina/GroovyGrnd.git
$ cd GroovyGrnd
$ ./gradlew test
```

It is preferrable that you run tests and any other task with the Gradle Wrapper, as this will ensure you are using the correct version of gradle.

## Pre-requisites

Kotlin Compiler and gradle are the main pre-requisites you will need when using this repository. Downloading them is easy using [sdkman](http://sdkman.io/install.html). Follow the instructions to get a copy of sdkman and then install kotlin and gradle as follows:

```sh
$ sdk install groovy
...
$ sdk install gradle
```

Enjoy!

