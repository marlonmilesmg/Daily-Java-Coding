package za.co.marlonmagonjo;

import java.util.Scanner;

/**
 *  Yearly Savings Calculator
 *      - Calculate the amount of savings one has in their savings account
 *      given they save R1 more every day from the previous day
 *      - Hint: the user enters the day of the year and program calculates
 */

public class YearlySavingsCalculator {
    public static void main(String[] args) {
        int dayOfTheYear;
        int savingsAmount = 0;
        System.out.println("Please enter the day of the year: ");
        Scanner s = new Scanner(System.in);
        dayOfTheYear = s.nextInt();

        for (int i = 0; i <= dayOfTheYear; i++){
            savingsAmount += i;
        }

        System.out.println("Today You Saved: R" + dayOfTheYear + ".00");
        System.out.println("Your Total Savings Account Balance is R" + savingsAmount +".00");
        System.out.println("=========================== Happy Savings =============================");
    }
}
