package dev.sinter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumDivisiblesTest {

    @Test
    void sumDivisibleBy5And7BruteForce() {
        Assertions.assertEquals(51, SumDivisibles.sumDivisibleBy5And7(20));

        Assertions.assertEquals(38967, SumDivisibles.sumDivisibleBy5And7(500));

        Assertions.assertEquals(1680367949, SumDivisibles.sumDivisibleBy5And7(1_000_000_000));
    }

    @Test
    void sumDivisibleBy5And7() {
        Assertions.assertEquals(51, SumDivisibles.sumDivisibleBy5And7BruteForce(20));

        Assertions.assertEquals(38967, SumDivisibles.sumDivisibleBy5And7BruteForce(500));

        Assertions.assertEquals(1680367949, SumDivisibles.sumDivisibleBy5And7BruteForce(1_000_000_000));
    }
}