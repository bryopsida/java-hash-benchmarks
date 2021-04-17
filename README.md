### How To Run
`./gradlew run`

### Results
```
Average duration for AC_MD5 is 2138 nanoseconds
Average duration for SEC_MD5 is 1182 nanoseconds

Average duration for AC_SHA-256 is 2720 nanoseconds
Average duration for SEC_SHA-256 is 2573 nanoseconds

Average duration for AC_MD2 is 36032 nanoseconds
Average duration for SEC_MD2 is 35294 nanoseconds

Average duration for AC_SHA-512 is 2581 nanoseconds
Average duration for SEC_SHA-512 is 2366 nanoseconds

Average duration for AC_SHA-1 is 2371 nanoseconds
Average duration for SEC_SHA-1 is 1637 nanoseconds

Average duration for AC_SHA-512/256 is 2244 nanoseconds
Average duration for SEC_SHA-512/256 is 2430 nanoseconds

Average duration for AC_SHA-512/224 is 2342 nanoseconds
Average duration for SEC_SHA-512/224 is 2497 nanoseconds

Average duration for AC_SHA-384 is 2480 nanoseconds
Average duration for SEC_SHA-384 is 2646 nanoseconds

Average duration for AC_SHA-224 is 2485 nanoseconds
Average duration for SEC_SHA-224 is 2430 nanoseconds


Average duration for AC_SHA3-256 is 3935 nanoseconds
Average duration for AC_SHA3-384 is 3919 nanoseconds
Average duration for AC_SHA3-224 is 3152 nanoseconds
Average duration for AC_SHA3-512 is 5061 nanoseconds
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