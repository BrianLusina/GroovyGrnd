package com.groovyapp.HelloGroovy

class IntroGroovy {
    static void main(String[] args) {
        // Using a simple println statement to print output to the console
        println 'Hello World'
        // defining variables
        def x = 42
        println x.getClass()

        // change the variable type at runtime
        x = "Hello"
        println x.getClass()

        // String implementation using GString
        def str = "Lusina"
        println "Hello, $str"

        // more complex string statements, which allow accessing strings like accessing arrays
        def firstName = "Brian"
        def lastName = "Lusina"
        println "My name is ${firstName[0]}. $lastName"

        //implicit truthy
        if (x) {
            println true
        }

        if (!str) {
            println(true)
        }

        // regular expressions in Groovy start with ~ at the beginning and are enclosed in //
        def pattern = ~/[a-zA-Z]/
        println pattern.getClass()

        def matcher = "The Hitchhiker's Guide to the Galaxy" =~ /Galaxy/
        if (matcher) {
            println "Found the word 'Galaxy'"
        }

    }
}