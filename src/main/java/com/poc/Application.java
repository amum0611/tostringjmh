package com.poc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.poc.model.Customer;
import com.poc.service.CustomerService;
import com.poc.util.CustomerUtil;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(1)
@Warmup(iterations = 4)
@Measurement(iterations = 15)
@BenchmarkMode(Mode.Throughput)
public class Application {

    private static final CustomerService CUSTOMER_SERVICE = new CustomerService();

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(Application.class.getSimpleName())
                .output("logs.txt")
                .result("results.txt")
                .resultFormat(ResultFormatType.TEXT)
                .build();

        new Runner(opt).run();
    }

    @Benchmark
    public void stringConcatenation(ThreadState state, Blackhole blackhole) {
        blackhole.consume(CUSTOMER_SERVICE.stringConcatenation(state.customer));
    }

    @Benchmark
    public void apacheToStringBuilder(ThreadState state, Blackhole blackhole) {
        blackhole.consume(CUSTOMER_SERVICE.apacheToStringBuilder(state.customer));
    }

    @Benchmark
    public void stringBuilder(ThreadState state, Blackhole blackhole) {
        blackhole.consume(CUSTOMER_SERVICE.stringBuilder(state.customer));
    }

    @Benchmark
    public void jackson(ThreadState state, Blackhole blackhole) throws JsonProcessingException {
        blackhole.consume(CUSTOMER_SERVICE.jackson(state.customer));
    }

    @State(Scope.Thread)
    public static class ThreadState {
        Customer customer = CustomerUtil.createCustomer(UUID.randomUUID().toString());
    }
}
