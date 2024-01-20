package Conditions;

//Implement the program that will swap 2 variables without creating new variables or objects, using bitwise operators:

public class BitwiseValuesSwap {
    public static void swap(int first, int second) {
        System.out.println(first);
        System.out.println(second);
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        System.out.println(first);
        System.out.println(second);
    }
}