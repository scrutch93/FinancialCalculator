package com.pluralsight;
import java.util.Scanner;
public class FinancialCalculator {

    public static void main (String[] args){
        MortgageCalculator();
        FutureValue();

    }

    public static void MortgageCalculator(){
        Scanner answer = new Scanner(System.in);

        System.out.println("You have selected to calculate your mortgage.");
        System.out.println("How much have you borrowed?: ");
        double principle = answer.nextDouble();

        System.out.println("What is your interest rate?: ");
        int rate = answer.nextInt();

        System.out.println("How long is the term of your loan?: ");
        int loanLength = answer.nextInt();


        double mortgage = principle * rate / (1 - Math.pow((1 + rate), (-1 * (loanLength * 12))));

        System.out.println("Your mortgage will be: " + mortgage);
        //return mortgage;
    }
    public static void FutureValue(){
        Scanner answer = new Scanner(System.in);

        System.out.println("You have selected to calculate a future value.");
        System.out.println("How much is the deposit?: ");
        double principle = answer.nextDouble();

        System.out.println("What is your interest rate?: ");
        int rate = answer.nextInt();

        System.out.println("How many years?: ");
        int time = answer.nextInt();


        // FV = D * (1+r/n)
        // F = P X I^R
        double futureValue = principle * rate * time;


        //return mortgage;
    }

}
