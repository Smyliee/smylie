package com.opps;

import java.util.Scanner;

public class Accounts {
    int balance;
    public void createAccount(String name , int id , int money ){

        balance = money;
        System.out.println(" Account created with name : " +name );
        System.out.println("id : " +id);

        System.out.println(" Current Balance : "+balance);
    }
    double  withdraw (int amount2){

        balance = balance - amount2;
        System.out.println("Your current balance is : "+balance);
        return balance;


    }
    double deposit (int amount){
        balance = balance + amount;
        System.out.println("Your current balance is : "+balance);
        return balance;
    }
    void currentBalance(){
        System.out.println(" Your Current Balance is : " +balance);

    }

}
