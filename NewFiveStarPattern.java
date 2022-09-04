package com.tanu;

public class NewFiveStarPattern {

    public static void main(String args[]){
      pattern(5, 5);

    }
    public static void pattern(int a, int b) {

        for (int i = 1; i <= a; i++) {
            for (int j = b; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
