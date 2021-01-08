package com.company;

public class Account {
    public String name; // the variables for the objects that can be used
    public static double balance;

    public static void deposit(double depositAmount){
        balance += depositAmount;
    }

    public static void withdraw(double withdrawAmount){
        balance -= withdrawAmount;
        // here you can use a validation check to make sure balance is always more than 0
    }

    public Account() {// the value of the balance when object is initialised
        balance = 0;
    }

}
