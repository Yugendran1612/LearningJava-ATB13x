package ex_03_Ternary_Operators;

public class Lab_03_5_NestedOper {
    public static void main (String[] args){
//Grade Calculation Using Nested Ternary ->
// Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.
        int marks = 40;
        String grade = (marks >= 90) ? "A+":
                (marks >=75) ? "A":
                        (marks >= 60) ? "B":
                                (marks >= 40) ? "C": "F";
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
