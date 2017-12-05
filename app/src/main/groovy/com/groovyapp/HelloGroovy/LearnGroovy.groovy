package com.groovyapp.HelloGroovy

/**
 * com.groovyapp.HelloGroovy
 * Created by lusinabrian on 29/12/16.
 * Description: A quick fire course in Groovy
 */
class LearnGroovy {
    static void main(String[] args) {
        // single line comment
        /*
        * Multi line comments*/
        // printing
        println "Hello Groovy"

        // assigning variables
        def x = 1
        println x

        x = new Date()
        println "Date object $x"

        /*Collections, maps*/
        // empty list
        def technologies = []

        // adding elements
        technologies.add("Java")

        // left shift adds and returns the list
        technologies << "Groovy"

        // add multiple elements
        technologies.addAll(["Gradle", "Spring"])

        /**Removing elements*/
        technologies.remove("Gradle")

        //subtraction works
        technologies -= "Spring"

        println "Technologies: $technologies"

        /**Iteration*/
        technologies.each { println "Technology: $it" }
        technologies.eachWithIndex { it, i -> println "$i: $it" }

        // checking list contents

        //evaluate it a list contains an item
        def hasGriffon = technologies.contains("Griffon")
        //or
        def hasSpring = "Spring" in technologies

        println "Has spring?> $hasSpring, Griffon?> $hasGriffon"

        // Check for multiple contents
        technologies.containsAll(["Spring", "Griffon"])

        /**java.Sorting lists*/
        // mutates original list
        technologies.sort()

        //sort without mutating original
        def sortedTech = technologies.sort(false)

        /**Manipulating lists*/

        // replace all elements in the list
        Collections.replaceAll(technologies, "Gradle", "Android")

        // shuffle
        Collections.shuffle(technologies, new Random())

        // clear list
        technologies.clear()

        // MAPS
        // empty map

        def devMap = [:]
        // add values
        devMap = ["name"     : "Brian", "lastName": "Lusina", "frameworks": ["Android", "Flask", "Gradle", "React"],
                  "Languages": ["Java", "Python", "JavaScript"]]

        devMap.put("age", "23")
        println "DevMap: $devMap"

        //iterate over elements of a map
        devMap.each { println "$it.key: $it.value" }
        devMap.eachWithIndex { it, i -> println "$i: $it" }

        //evaluate a map contains a key
        assert devMap.containsKey("name")

        //evaluate a map contains a value
        assert devMap.containsValue("23")

        // print the keys of a map
        println devMap.keySet()

        // print the values of a map
        println devMap.values()

        /*Logical branching*/
        def m = 3

        if (m == 1) {
            println "One"
        } else if (m == 2) {
            println "Two"
        } else {
            println "X greater than Two"
        }

        //Groovy also supports the ternary operator
        def y = 10
        def z = (y > 1) ? "worked" : "failed"
        assert z == "worked"

        //Groovy supports 'The Elvis Operator' too! Instead of using the ternary operator:
        // def displayName = user.name ? user.name : 'Anonymous'

        //We can write it:
        // displayName = user.name ?: 'Anonymous'

        // for loop
        // iterate over a range
        def n = 0
        for (i in 0..30) {
            n += i
        }
        println "Sum range $n"

        // iterate over a list
        for (i in [5, 4, 3, 2, 1]) {
            n += i
        }
        println "Sum of list:$n"

        // iterate over an array
        def array = (0..20).toArray()
        def b = 0
        for (a in array) {
            b += a
        }

        //Iterate over a map
        def map = ['name': 'Roberto', 'framework': 'Grails', 'language': 'Groovy']
        x = 0
        for (e in map) {
            x += e.value
        }
        println "Map iteration: $x"


    }
}
