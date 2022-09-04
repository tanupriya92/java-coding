package com.tanu;

public class SwappingNewWithout3 {
    public static void main(String[] args)
    {
        int m = 3, n = 1;

        swapValue(m, n);
    }

    static void swapValue(int m, int n)
    {
        m = m - n;
        n = m + n;
        m = n - m;
        System.out.println("Value of m is " + m + " and Value of n is " + n);
    }

}



