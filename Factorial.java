package com.tanu;

public class


Factorial {
    public static void main(String args[]) {
        //int i = 1;
        //long fact = 1;

       int fact =  facto(5);
        System.out.println(fact);
    }

    public static int facto(int n) {
        int i = 1;
        int fact = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        return fact;
        //System.out.println(fact);

    }
}


