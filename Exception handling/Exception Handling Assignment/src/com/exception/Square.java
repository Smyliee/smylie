package com.exception;
import java.util.Scanner;

public class Square {

    public static void Square1(int x) {
        try {
                if (x < 0)
                    throw new ArithmeticException();
                else {
                    double z  = Math.sqrt(x);
                    System.out.println(" Square root of x is : " +z);
                    }
                }
        catch (ArithmeticException e){
            System.out.println(e +" X can't be less than 0");
        }

        }

        public static void main (String[] args)
        {

            Scanner scan = new Scanner(System.in);
            System.out.println("enter NUMBER : ");
            int i = scan.nextInt();
            Square1(i);

        }
    }

