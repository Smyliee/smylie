package com.exception;

import java.util.Scanner;

public class DivisionInt {
    public static void  DivisionInt1( int x , int y){
        try {
            if(y==0){
                throw new ArithmeticException();
            }
            else{
                double z = (double)x/y;
                System.out.println("X divide by Y is equal : "+z);
            }
        }
        catch (ArithmeticException E){
            System.out.println(E + " y Can not  be Zero , Give another number ");
        }
    }
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter X  : ");
        int x = scan.nextInt();
        System.out.println("enter y  : ");
        int y = scan.nextInt();
        DivisionInt1(x,y);

    }

}

