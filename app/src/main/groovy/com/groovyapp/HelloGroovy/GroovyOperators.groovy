package com.groovyapp.HelloGroovy

/**
 * com.groovyapp.HelloGroovy
 * Created by lusinabrian on 30/12/16.
 * Description:
 Operators
 Operator Overloading for a list of the common operators that Groovy supports:
 http://www.groovy-lang.org/operators.html#Operator-Overloading
 Helpful groovy operators
 */
class GroovyOperators {
    static void main(String[] args) {
        // spread operator
        def techIKnow = ["React", "Android", "Flask", "Django"]
        def langIKnow = ["JavaScript", "Java", "Python", "Groovy"]

        techIKnow*.toUpperCase() // = to techIKnow.collect { it?.toUpperCase() }
        println "Some tech I know $techIKnow"

        //Safe navigation operator: used to avoid a NullPointerException.
        //def lang = langIKnow.get(1)
        // def language = langIKnow?.language

    }
}
