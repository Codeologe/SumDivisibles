package dev.sinter;

public class SumDivisibles {

    public static void main(String[] args) {
        System.out.println("n = 20: " + sumDivisibleBy5And7BruteForce(20));
        System.out.println("n = 500: " + sumDivisibleBy5And7BruteForce(500));
        System.out.println("n = 1.000.000.000: " + sumDivisibleBy5And7BruteForce(1_000_000_000));
        System.out.println();

        System.out.println("n = 20: " + sumDivisibleBy5And7(20));
        System.out.println("n = 500: " + sumDivisibleBy5And7(500));
        System.out.println("n = 1.000.000.000: " + sumDivisibleBy5And7(1_000_000_000));
        System.out.println();
    }

    // O(n)
    public static int sumDivisibleBy5And7BruteForce(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // O(1)
    public static int sumDivisibleBy5And7(int i) {
        //bestimme größten Multiplikator
        int n5 = (i - 1) / 5;
        int n7 = (i - 1) / 7;
        int n35 = (i - 1) / 35;

        //kleiner Gauß
        int sumMultiplier5 = n5 * (n5 + 1) / 2;
        int sumMultiplier7 = n7 * (n7 + 1) / 2;
        int sumMultiplier35 = n35 * (n35 + 1) / 2;

        return sumMultiplier5 * 5 + sumMultiplier7 * 7 - sumMultiplier35 * 35;
    }
}