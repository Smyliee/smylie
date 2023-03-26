package com.opps;

import java.util.Scanner;


public class BankSystem extends Accounts{

    public static void main (String[] args ) {
        int var1;
        System.out.println(" Welcome to Your Banking System");
        System.out.println(" * Press '1' to Create Account");
        System.out.println("* Press '2' to deposit money ");
        System.out.println("* Press '3' to withdraw money ");
        System.out.println("* Press '4' to check balance");
        System.out.println("* Press '5' to exit ");
        BankSystem ac1 = new BankSystem();
        Scanner SC = new Scanner(System.in);

        do{
            System.out.println("Enter your option : ");
            var1 = SC.nextInt();

            switch (var1)
            {
                case 1:
                    System.out.println("Enter Name : ");
                    String name = SC.next();
                    System.out.println("Enter id ");
                    int id = SC.nextInt();
                    System.out.println("Enter money");
                    int money = SC.nextInt();
                    ac1.createAccount(name, id, money);
                    break;
                case 2:
                    System.out.println("Enter Amount: ");
                    int amount = SC.nextInt();
                    System.out.println("Amount deposited");
                    ac1.deposit(amount);
                    break;
                case 3:
                    System.out.println("Enter Amount: ");
                    int amount2 = SC.nextInt();
                    System.out.println("Amount withdrawn");
                    ac1.withdraw(amount2);
                    break;
                case 4:
                    ac1.currentBalance();
                    break;
                case 5:
                    System.out.println(" You have Exited");
                default:
                    System.out.println("Invalid key ");

            }
        }while( var1!='5');


    }



}

