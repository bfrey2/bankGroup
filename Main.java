package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean quit = false;
        double answer, depositAmount, withdrawAmount, quitAnswer;
        String name;
        Scanner scan = new Scanner(System.in);
        Account myAccount = new Account();
        System.out.println("Enter your name");
        name = scan.nextLine();
        System.out.println("Welcome " + name);
        while (quit == false){
            System.out.println("Would you like to deposit(1) or withdraw(2)");
            answer = scan.nextInt();
            while ((answer < 1) || (answer >2)) {
                System.out.println("Enter a valid number");
                answer = scan.nextInt();
            }
            if (answer == 1){
                System.out.println("How much would you like to deposit");
                depositAmount = scan.nextDouble();
                myAccount.deposit(depositAmount);
            }
            if(answer == 2){
                System.out.println("How much would you like to withdraw");
                withdrawAmount = scan.nextDouble();
                myAccount.withdraw(withdrawAmount);
            }
            System.out.println("Would you like to continue (1)yes or no(2)?");
            quitAnswer = scan.nextDouble();
            if (quitAnswer == 2) {
                System.out.println("Your balance is " + myAccount.balance);
                break;
        }

        }

    }
}
