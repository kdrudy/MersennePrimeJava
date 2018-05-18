# MersennePrimeJava
Computing Mersenne Primes using Java and BigInteger

[Mersenne Primes](https://en.wikipedia.org/wiki/Mersenne_prime) are prime numbers one less than a power of two (2^N - 1).

These numbers get large fast so in order to calculate them with Java you need to use BigInteger, which can hold a whole number as large the available memory.

Current success with this code:

Number|Power|Value|Time
---|---|---|---
1|2|3|1ms
2|3|7|0ms
3|5|31|0ms
4|7|127|0ms
5|13|8191|1ms
6|17|131071|1ms
7|19|524287|1ms
8|31|2147483647|16ms
9|61|2305843009213693951|111887ms

## Todo
- Update isPrime for BigInteger to limit at square root instead of half the value.  No built in square root method for BigInteger.
