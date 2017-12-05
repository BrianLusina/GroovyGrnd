package com.groovyapp.HelloGroovy

/**
 * com.groovyapp.HelloGroovy
 * Created by lusinabrian on 30/12/16.
 * Description:
 */
class MetaProgramming {
    static void main(String[] args) {
        //Using ExpandoMetaClass to add behaviour
        String.metaClass.testAdd = {
            println "we added this"
        }

        String x = "test"
        x?.testAdd()

        def test = new TestMeta()
        test?.sum(2, 3)
        test?.multiply(2, 3)
    }

    //Intercepting method calls
    static class TestMeta implements GroovyInterceptable {
        static sum(Integer x, Integer y) { x + y }

        def invokeMethod(String name, args) {
            System.out.println "Invoke method $name with args: $args"
        }
    }

}
