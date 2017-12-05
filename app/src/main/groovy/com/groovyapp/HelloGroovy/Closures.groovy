package com.groovyapp.HelloGroovy

/**
 * com.groovyapp.HelloGroovy
 * Created by lusinabrian on 30/12/16.
 * Description:
 Closures
 A Groovy Closure is like a "code block" or a method pointer. It is a piece of
 code that is defined and then executed at a later point.

 More info at: http://www.groovy-lang.org/closures.html
 */

class Closures {
    static void main(String[] args) {
        def clos = { println "Hello World" }
        println "Executing closure"
        clos()

        // passing params to a closure
        def sum = { a, b -> println a + b }
        sum(5, 2)

        // closures may refer to variables not listed in the param list
        def x = 9
        def multiplyBy = { num -> num * x }
        println multiplyBy(5)

        // If you have a Closure that takes a single argument, you may omit the
        // parameter definition of the Closure
        def clos2 = { println it }
        clos2("hi")

        // Groovy can memoize closure results
        def cl = { m, n ->
            sleep(3000) // simulate time consuming process
            m + n
        }

        def mem = cl.memoize()

        def callClosure = { j, l ->
            def start = System.currentTimeMillis()
            mem(j, l)
            println "Inputs(j = $j, l = $l) - took ${System.currentTimeMillis() - start} msecs."
        }

        callClosure(1, 2)
        callClosure(1, 2)
        callClosure(2, 3)
        callClosure(2, 3)
        callClosure(3, 4)
        callClosure(3, 4)
        callClosure(1, 2)
        callClosure(2, 3)
        callClosure(3, 4)


    }
}
