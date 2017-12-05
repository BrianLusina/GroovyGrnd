package com.groovyapp.HelloGroovy

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked

/**
 * com.groovyapp.HelloGroovy
 * Created by lusinabrian on 30/12/16.
 * Description:
 TypeChecked and CompileStatic
 Groovy, by nature, is and will always be a dynamic language but it supports
 typechecked and compilestatic
 More info: http://www.infoq.com/articles/new-groovy-20
 * */
class TypeCheck {
    static void main(String[] args) {
        test()
        assert sum(2, 5) == 7
    }

    static void testMethod() {}

    @TypeChecked
    static void test() {
        testMethod()

        def name = "Roberto"
        println name
    }

/*
Un comment me to test
    @TypeChecked
    static Integer testInt() {
        Integer num = "1"

        Integer[] numbers = [1,2,3,4]

        Date date = numbers[1]
        return "Test"
    }
*/

    //CompileStatic example:
    @CompileStatic
    static int sum(int x, int y) {
        x + y
    }

}
