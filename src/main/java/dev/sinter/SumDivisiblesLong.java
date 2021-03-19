package dev.sinter;

public class SumDivisiblesLong {

    public static void main(String[] args) {
        System.out.println("n = 20: " + sumDivisibleBy5And7BruteForce(20));
        System.out.println("n = 500: " + sumDivisibleBy5And7BruteForce(500));
        System.out.println();

        System.out.println("n = 20: " + sumDivisibleBy5And7(20));
        System.out.println("n = 500: " + sumDivisibleBy5And7(500));
        System.out.println();

        long startTime = System.currentTimeMillis();
        System.out.print("n = 7661213070L: " + sumDivisibleBy5And7(7661213070L));
        long endTime = System.currentTimeMillis();
        System.out.printf(" (Total execution time: %1$TSs %1$TLms)\n", (endTime-startTime));
        startTime = System.currentTimeMillis();
        System.out.print("n = 7661213070L: " + sumDivisibleBy5And7BruteForce(7661213070L));
        endTime = System.currentTimeMillis();
        System.out.printf(" (Total execution time: %1$TSs %1$TLms)\n", (endTime-startTime));
    }

    // O(n)
    public static long sumDivisibleBy5And7BruteForce(long n) {
        long sum = 0;
        for (long i = 0; i < n; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // O(1)
    // max input before overflow: 7661213070L
    public static long sumDivisibleBy5And7(long i) {
        //bestimme größten Multiplikator
        long n5 = (i - 1) / 5;
        long n7 = (i - 1) / 7;
        long n35 = (i - 1) / 35;

        //kleiner Gauß
        long sumMultiplier5 = n5 * (n5 + 1) / 2;
        long sumMultiplier7 = n7 * (n7 + 1) / 2;
        long sumMultiplier35 = n35 * (n35 + 1) / 2;

        return sumMultiplier5 * 5 + sumMultiplier7 * 7 - sumMultiplier35 * 35;
    }
}