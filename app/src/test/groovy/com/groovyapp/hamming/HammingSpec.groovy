package com.groovyapp.hamming

import spock.lang.Specification

class HammingSpec extends Specification {

    def 'computes zero distance for identical strands'() {
        expect:
        new HammingGroovy().compute('A', 'A') == 0
    }

    def 'computes the distance for a single nucleotide strand'() {
        expect:
        new HammingGroovy().compute('A', 'G') == 1
    }

    def 'computes the distance for a small strand'() {
        expect:
        new HammingGroovy().compute('AG', 'CT') == 2
    }

    def 'computes a small HammingGroovy distance'() {
        expect:
        new HammingGroovy().compute('AT', 'CT') == 1
    }

    def 'computes a small HammingGroovy distance in a longer strand'() {
        expect:
        new HammingGroovy().compute('GGACG', 'GGTCG') == 1
    }

    def 'ignores additional nucleotides when the first strand is longer'() {
        expect:
        new HammingGroovy().compute('AGAGACTTA', 'AAA') == 1
    }


    def 'ignores additional nucleotides when the second strand is longer'() {
        expect:
        new HammingGroovy().compute('AGG', 'AAAACTGACCCACCCCAGG') == 2
    }


    def 'computes a large HammingGroovy distance'() {
        expect:
        new HammingGroovy().compute('GATACA', 'GCATAA') == 4
    }


    def 'computes a very long HammingGroovy distance'() {
        expect:
        new HammingGroovy().compute('GGACGGATTCTG', 'AGGACGGATTCT') == 9
    }

}
