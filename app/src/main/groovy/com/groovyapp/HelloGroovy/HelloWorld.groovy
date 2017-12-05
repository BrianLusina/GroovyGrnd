package com.groovyapp.HelloGroovy


class HelloWorld {
    static hello(name) {
        if (name == "" || name == null) {
            return "Hello, World!"
        } else {
            return "Hello, $name!"
        }
    }
}
