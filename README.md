# MersennePrimeJava
Computing Mersenne Primes using Java and BigInteger

[Mersenne Primes](https://en.wikipedia.org/wiki/Mersenne_prime) are prime numbers one less than a power of two (2^N - 1).

These numbers get large fast so in order to calculate them with Java you need to use BigInteger, which can hold a whole number as large as the available memory.

Current success with this code running on a Raspberry PI Model A at home:

Number|Power|Value|Time
---|---|---|---
1|2|3|14ms
2|3|7|2ms
3|5|31|1ms
4|7|127|2ms
5|13|8191|4ms
6|17|131071|16ms
7|19|524287|30ms
8|31|2147483647|597ms
9|61|2305843009213693951|n/a on current run

Runtime on my work 2015 Macbook Pro:

Number|Power|Value|Time
---|---|---|---
1|2|3|0ms
2|3|7|0ms
3|5|31|0ms
4|7|127|0ms
5|13|8191|0ms
6|17|131071|0ms
7|19|524287|0ms
8|31|2147483647|11ms
9|61|2305843009213693951|43063ms
