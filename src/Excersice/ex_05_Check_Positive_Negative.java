package Excersice;

import java.util.Scanner;

public class ex_05_Check_Positive_Negative {

    public static void  main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        double num = scanner.nextDouble();   // handling double and decimal number.
        if (num >0) {
            System.out.println("This is Positive Number");
        }
        else if (num < 0){
            System.out.println("This is Negative Number");
        } else{
            System.out.println("This is Zero");
        }
    }
}