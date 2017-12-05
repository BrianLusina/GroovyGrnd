package com.groovyapp.WordCount

class PhraseGroovy {
    String input

    def PhraseGroovy(s) {
        input = s
    }

    def wordCount() {
        input.toLowerCase().findAll(/[\w']+/).countBy { it }
    }
}
