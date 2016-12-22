package NthPrime


import groovy.transform.CompileStatic

@CompileStatic
class NthPrime {

  private def isPrime(int n) {
    def sqrt = Math.ceil(Math.sqrt(n))
    for (int i = 3; i <= sqrt; i += 1 ) {
      if ( n % i == 0 ) {
        return false
      }  
    }
    return true
  }

  def nth(int n) {
    // handle stuff that doesn't need
    // additional calculations
    if ( n < 1 ) throw new ArithmeticException()
    if ( n == 1 ) return 2

    def lastValue = 0
    def count = 1
    def i = 3

    while ( count < n ) {
      if ( isPrime(i) ) {
        lastValue = i
        count += 1
      }
      i += 2
    }
    return lastValue
  }
}
