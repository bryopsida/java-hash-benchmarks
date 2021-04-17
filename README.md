### How To Run
`./gradlew run`

### Results
```
Average duration for AC_MD2 is 35859 nanoseconds
Average duration for AC_MD5 is 2138 nanoseconds
Average duration for AC_SHA-1 is 2461 nanoseconds
Average duration for AC_SHA-224 is 2678 nanoseconds
Average duration for AC_SHA-256 is 2582 nanoseconds
Average duration for AC_SHA-384 is 2647 nanoseconds
Average duration for AC_SHA-512 is 2528 nanoseconds
Average duration for AC_SHA-512/224 is 2392 nanoseconds
Average duration for AC_SHA-512/256 is 2746 nanoseconds
Average duration for AC_SHA3-224 is 3543 nanoseconds
Average duration for AC_SHA3-256 is 4495 nanoseconds
Average duration for AC_SHA3-384 is 3822 nanoseconds
Average duration for AC_SHA3-512 is 5639 nanoseconds
Average duration for GUA_ADLER32 is 366 nanoseconds
Average duration for GUA_CRC32 is 301 nanoseconds
Average duration for GUA_CRC32C is 1206 nanoseconds
Average duration for GUA_FARMHASHFINGERPRINT64 is 42 nanoseconds
Average duration for GUA_GOODFASTHASH is 383 nanoseconds
Average duration for GUA_MD5 is 1286 nanoseconds
Average duration for GUA_MURMER3_128 is 1007 nanoseconds
Average duration for GUA_MURMER3_32 is 276 nanoseconds
Average duration for GUA_SHA1 is 1981 nanoseconds
Average duration for GUA_SHA256 is 3314 nanoseconds
Average duration for GUA_SHA384 is 4232 nanoseconds
Average duration for GUA_SHA512 is 3105 nanoseconds
Average duration for GUA_SIPHASH24 is 1433 nanoseconds
Average duration for SEC_MD2 is 34814 nanoseconds
Average duration for SEC_MD5 is 1212 nanoseconds
Average duration for SEC_SHA-1 is 1969 nanoseconds
Average duration for SEC_SHA-224 is 2499 nanoseconds
Average duration for SEC_SHA-256 is 2298 nanoseconds
Average duration for SEC_SHA-384 is 2356 nanoseconds
Average duration for SEC_SHA-512 is 2429 nanoseconds
Average duration for SEC_SHA-512/224 is 2964 nanoseconds
Average duration for SEC_SHA-512/256 is 2325 nanoseconds
```

### Hardware
Above benchmarks were run on 
```
java -version
openjdk version "15.0.2" 2021-01-19
OpenJDK Runtime Environment AdoptOpenJDK (build 15.0.2+7)
OpenJDK 64-Bit Server VM AdoptOpenJDK (build 15.0.2+7, mixed mode, sharing)
```

```
Intel(R) Core(TM) i7-3720QM CPU @ 2.60GHz
```

### TODO
- Test against more runtimes
- Create a graph