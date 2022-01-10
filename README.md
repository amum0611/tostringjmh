# How-To Benchmarking in Java
# Intro
This sample project describes how to benchmark your Java program using JMH, which is a Java harness for building, running, and analysing nano/micro/milli/macro benchmarks written in Java and other languages targetting the JVM. 

Therefore, the project uses JMH to demonstrate the most optimal implementation of `toString()` in Java class with the lowest latency.

Disclaimer: The result of this benchmark may change depending on your business use-cases

# Build
Open terminal at the project root and execute `./gradlew build`

# Run
Open terminal at the project root and execute
```shell script
java -jar build/libs/tostringjmh-1.0.0.jar
```