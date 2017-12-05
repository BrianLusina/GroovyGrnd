package com.groovyapp.HelloGroovy

import spock.lang.Shared
import spock.lang.Specification

class HelloWorldTest extends Specification {

    @Shared
    def hello = new HelloWorld()

    def 'outputs "Hello, World!"'() {
        expect:
        hello.hello() == 'Hello, World!'
    }

    def 'outputs "Hello, Alice!" when given the name "Alice"'() {
        expect:
        hello.hello('Alice') == 'Hello, Alice!'
    }

    def 'outputs "Hello, Bob!" when given the name "Bob"'() {
        expect:
        hello.hello('Bob') == 'Hello, Bob!'
    }
}
