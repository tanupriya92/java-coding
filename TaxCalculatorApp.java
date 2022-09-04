package com.tanu;

import java.util.Scanner;

public class TaxCalculatorApp {
    public static void main(String args[]) {
        int i = 0;
        int person_count;
        long a;
        System.out.println("Tax Calculator App");
        System.out.println("-----WELCOME-----");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total person count:");
        person_count = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[person_count];
        long[] incomes = new long[person_count];

        // Take input for person_count
        for (i = 0; i < person_count; i++) {
            System.out.println("Enter name " + (i + 1) + ":");
            names[i] = scanner.nextLine();
            System.out.println("Enter " + names[i] + "'s" + " Annual income");
            incomes[i] = scanner.nextLong();
            scanner.nextLine();
        }

        // Call calculateTax Method for all persons
        for(int j=0;j< person_count;j++) {
            calculateTax(names[j],incomes[j]);
        }
    }
        public static void calculateTax(String name ,long income)
        {
            double tax = 0;
            if(income>=300000) {
                tax = income * 0.20;
            }
            else if(income>=100000 && income < 300000) {
                tax = income*0.10;
            }
            else {
                tax = 0;
            }
            System.out.println(name +" : " + tax);
        }
}









