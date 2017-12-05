package com.groovyapp.Phonenumber

import spock.lang.Specification

class PhoneNumberSpec extends Specification {

    def 'a phone number is valid'() {
        expect:
        new PhoneNumber('(123) 456-7890').number == '1234567890'
    }


    def 'a different phone number is valid'() {
        expect:
        new PhoneNumber('(987) 654-3210').number == '9876543210'
    }


    def 'a phone nubmer separated by dots is valid'() {
        expect:
        new PhoneNumber('456.123.7890').number == '4561237890'
    }


    def 'a letter-containing phone number is invalid'() {
        expect:
        new PhoneNumber('123-abc-1234').number == '0000000000'
    }


    def 'a 9-digit number is invalid'() {
        expect:
        new PhoneNumber('123456789').number == '0000000000'
    }


    def 'an 11-digit number starting with a 1 is valid'() {
        expect:
        new PhoneNumber('19876543210').number == '9876543210'
    }


    def 'a 10-digit number, with an area code starting with 1, is valid'() {
        expect:
        new PhoneNumber('1234567890').number == '1234567890'
    }


    def 'an 11-digit number, not beginning with a 1, is invalid'() {
        expect:
        new PhoneNumber('21234567890').number == '0000000000'
    }


    def 'a 12-digit number, even one beginning with a 1, is invalid'() {
        expect:
        new PhoneNumber('112345678901').number == '0000000000'
    }


    def 'a 10-digit number containing letters is inavlid'() {
        expect:
        new PhoneNumber('1a2a3a4a5a6a7a8a9a0a').number == '0000000000'
    }


    def 'can extract area code from a phone number'() {
        expect:
        new PhoneNumber('1234567890').areaCode == '123'
    }


    def 'can extract an area code from a different phone number'() {
        expect:
        new PhoneNumber('9876543210').areaCode == '987'
    }


    def 'can pretty print a phone number'() {
        expect:
        new PhoneNumber('5551234567').toString() == '(555) 123-4567'
    }


    def 'can pretty print a full U.S. phone number'() {
        expect:
        new PhoneNumber('11234567890').toString() == '(123) 456-7890'
    }

}
