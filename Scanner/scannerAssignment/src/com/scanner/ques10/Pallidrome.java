package com.scanner.ques10;

import java.util.Scanner;

public class Pallidrome {
        static void checkPallidrome(String str){
            int z = str.length();
            boolean count=true;
            int i =0;
            int j =z-1;
            while(i<=j)
            {
                if(str.charAt(i)!=str.charAt(j)) {
                    count=false;
                }
                i++;
                j--;

            }
            if(count==true){
                System.out.println(str+" is PALLIDROME");
            }
            else{
                System.out.println(str+" not pallidrome");
            }
        }
        public static void main (String[] args) {
            Scanner xi = new Scanner(System.in);
            System.out.print("Enter your String : ");
            String str = xi.nextLine();
            System.out.println("YOUR String is  : " + str);
            checkPallidrome(str);
        }
    }

