package com.scanner.ques10;

import java.util.Scanner;

public class Amazon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of item to be added in cart");
        int num = sc.nextInt();
        Item[] arr = new Item[num];
        for(int i=0;i<num; i++){
            Item it2 = new Item();
            System.out.println("Enter the item");
            String item_payment = sc.next();
            System.out.println("______________________________________________________");
            //String[] item = item_payment.split();
            System.out.println("This is payment info ");
            String paymentInfo = sc.next();
            it2.setItem(item_payment);
            it2.setPaymentInformation(paymentInfo);
            arr[i]= it2;
        }

        for (int j=0; j<num;j++){
            System.out.println(arr[j]);
        }


    }
}
