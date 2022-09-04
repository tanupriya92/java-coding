package com.tanu;

public class PrimeYn {

    public static void main(String args[]) {
        int n = 12;
        if (isPrime(n)) {
            System.out.println("number is prime");
        } else {
            System.out.println("number is not a prime");
        }
    }

        public static boolean isPrime(int n) {

            int i, j;
            for (i = 2; i <n; i++) {

                if (n % i == 0) {
                    return false;
                }
            }
                return true;
    }

}


