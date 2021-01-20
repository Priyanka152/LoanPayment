/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loadpyment;

import java.util.Scanner;

/**
 *
 * @author Priyanka
 */
public class LoadPyment {
    
    public static void main(String[] args) {
        
//1.Prompt the user to enter the annual interest rate, number of years, and loan amount. 
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value of yearly Intrest Rate:" );
          Double YearlyintrestRate = scanner.nextDouble();
        System.out.println("Enter number of Years:");
          Double years=scanner.nextDouble();
        System.out.println("Enter Loan Amount:");
          int loanAmount=scanner.nextInt();
        System.out.println("rate :" + YearlyintrestRate + " " + "Year :" +years + " " + "LoanAmount :" +loanAmount);
          
 //2.Obtain the monthly interest rate from the annual interest rate.
          double   monthlyInterestRate = YearlyintrestRate /   1200 ;
          System.out.println("Monthly Intrest rate is :" +monthlyInterestRate);
 //3. Compute the monthly payment using the preceding formula.
          double   monthlyPayment = loanAmount * monthlyInterestRate/ ( 1 / Math.pow(1 + monthlyInterestRate, years * 12   ));
         // System.out.println("MonthlyPayment is :" + monthlyPayment);
 //4. Compute the total payment, which is the monthly payment multiplied by 12 and multiplied by the number of years.
           double   totalPayment = monthlyPayment * years *   12   ; 
           System.out.println("MonthlyPayment is :" + monthlyPayment +  "  " +  "TotalPayment is:" + totalPayment);
    
 }

}