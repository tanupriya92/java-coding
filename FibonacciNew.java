package com.tanu;

public class FibonacciNew {

    public static void main(String args[]) {


            int n1 = 0, n2 = 1;

            fibo(n1, n2 );

    }

        public static void fibo(int n1, int n2){
        int n=50, n3;
        for(int i=0;i<n;i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}


