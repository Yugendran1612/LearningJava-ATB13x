package Excersice;

public class ex_04_Implicit_Explicit {

    public static void main(String[] arg){
        //implicit widneing
        int in = 100;
        byte bt = (byte)in;
        System.out.println("Implicit Value is "+ bt);

        //Explicit widening
        long ln = 23523489l;
        short sh = (short)ln;
        System.out.println("Explicit value is "+ sh);

        float fl = 3.65f;
        double dl = (double) fl;
        System.out.println("Implicit widnening is "+ dl);

        double d = 3.65E4d;
        float f = (float) d;
        System.out.println("Explicit value is "+ f);
    }
}
