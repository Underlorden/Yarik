package com.company;

public class Main {

    public static void main(String[] args) {
        if(args.length<1) {
            System.out.println("No input data...");
            return;
        }
        Integer year = Integer.parseInt(args[0]);
        if (((year % 4 == 0) && (year % 100 != 0))||(year %400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Ordinary Year");
        }
	// write your code here
    }
}
