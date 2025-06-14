package ex_04_TypeCasting;

//Explicit Typecasting (Narrowing)->Casts a double to an int, cutting off decimals value.

public class Lab_04_2_Explicit_Narrowing {
    public static void main(String[] args){
        /*double value = 1612.063;
        int value1 = (int)value;
        System.out.println(value1);*/

        long value2 = 9790840992l;
        short value3 = (short)value2;
        System.out.println(value3);
    }
}
