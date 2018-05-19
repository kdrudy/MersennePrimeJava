# MersennePrimeJava
Computing Mersenne Primes using Java and BigInteger

[Mersenne Primes](https://en.wikipedia.org/wiki/Mersenne_prime) are prime numbers one less than a power of two (2^N - 1).

These numbers get large fast so in order to calculate them with Java you need to use BigInteger, which can hold a whole number as large as the available memory.

Current success with this code running on a Raspberry PI Model A at home:

Number|Power|Value|Time
---|---|---|---
1|2|3|16ms
2|3|7|1ms
3|5|31|2ms
4|7|127|1ms
5|13|8191|6ms
6|17|131071|24ms
7|19|524287|49ms
8|31|2147483647|540ms
9|61|2305843009213693951|8410997ms

