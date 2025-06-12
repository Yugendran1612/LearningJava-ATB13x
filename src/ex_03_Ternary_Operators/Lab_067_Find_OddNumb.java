package ex_03_Ternary_Operators;

public class Lab_067_Find_OddNumb {
    public static void main (String[] arg){
        //we need to find odd number
        int num = 176567;
        String Result = (num%2 ==0) ? "Even" : "Odd";
        System.out.println (Result);
    }
}
