package com.groovyapp.HelloGroovy

/**
 * com.groovyapp.HelloGroovy
 * Created by lusinabrian on 30/12/16.
 * Description:
 Expando

 The Expando class is a dynamic bean so we can add properties and we can add
 closures as methods to an instance of this class

 http://mrhaki.blogspot.mx/2009/10/groovy-goodness-expando-as-dynamic-bean.html
 */
class ExpandoGroovy {
    static void main(String[] args) {
        def user = new Expando(name: "Brian")
        assert "Brian" == user.name

        user.lastName = "Lusina"

        assert "Lusina" == user.lastName
        user.showInfo = { out ->
            out << "Name: $name"
            out << "Last name: $lastName"
        }
        def sw = new StringWriter()
        println user.showInfo(sw)
    }

}
