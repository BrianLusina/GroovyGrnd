package main.gigasecond

import groovy.time.TimeCategory

class GigasecondGroovy {

    static Date from(Date date) {
        use ( TimeCategory ) { date + (10**9).seconds }
    }

}
