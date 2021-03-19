package dev.sinter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SumDivisiblesLongTest {

    @Test
    void sumDivisibleBy5And7() {
        Assertions.assertEquals(51, SumDivisiblesLong.sumDivisibleBy5And7(20));

        Assertions.assertEquals(38967, SumDivisiblesLong.sumDivisibleBy5And7(500));

        Assertions.assertEquals(9223372035359780235L, SumDivisiblesLong.sumDivisibleBy5And7(7661213070L));
    }

    @Test
    void sumDivisibleBy5And7BruteForce() {
        Assertions.assertEquals(51, SumDivisiblesLong.sumDivisibleBy5And7BruteForce(20));

        Assertions.assertEquals(38967, SumDivisiblesLong.sumDivisibleBy5And7BruteForce(500));

        Assertions.assertEquals(9223372035359780235L, SumDivisiblesLong.sumDivisibleBy5And7BruteForce(7661213070L));
    }
}