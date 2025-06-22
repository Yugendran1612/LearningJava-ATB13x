package ex_05_SwitchCases;

import java.util.Scanner;

public class Lab_05_1_Display_Week {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Display the weekday which user enters the value");
        int day = scanner.nextInt();
        switch(day) {

            case 1:
                  System.out.println("Monday");
                  break;
            case 2:
                  System.out.println("Tuesday");
                  break;
            case 3:
                  System.out.println("Wednesday");
                  break;
            case 4:
                  System.out.println("Thursday");
                  break;
            case 5:
                  System.out.println("Friday");
                  break;
            case 6:
                  System.out.println("Saturday");
                  break;
            case 7:
                  System.out.println("Sunday");
                  break;

            default:
                    System.out.println("Please enter only valid weekday number");
                    break;
        }
    }
}

