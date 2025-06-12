package ex_03_Ternary_Operators;

public class Lab_064_TernaryOperator {
    public static void main(String[] args) {
        //Finding Max number
        int a = 10;
        int b = 20;
        // int max = (Math.max(A,B));
        int max = a > b ? a : b;
        System.out.println(max);
    }
}
