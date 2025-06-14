package ex_04_TypeCasting;

//Typecasting in Division-> int a = 10, int b = 3; now divide 10/3 and store the decimal value
// in the Result variable and print it.

public class Lab_04_4_Division {
    public static void main (String[] args){
        int a = 10;
        int b = 3;
        int divide = a/b;
        float DecimalVal = (float) divide;
        System.out.println("The Decimal Value is " +DecimalVal);
    }
}
