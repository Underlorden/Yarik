package com.company;

public class HappyNumber {

    public static void main(String[] args) {
    if(args.length<1) {
        System.out.println("No input data");
        return;
    }
    Integer sum = Integer.parseInt(args[0]);
    int count1 = 0;
    int count2 = 0;
       for (int i = 0; i <= 9; i++) {
           for (int j = 0; j <= 9; j++) {
               int thirdDigit =  sum - i - j;
               if (thirdDigit >= 0 && thirdDigit <=9) {
                   count2 = count2 + 1;
                   if (i != 0) {
                       count1 = count1 + 1;
                   }
               }
           }
       }
        System.out.println("Numbers with sum of "+sum+" is "+count1 * count2);
    }
}