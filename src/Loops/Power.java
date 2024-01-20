package Loops;

public class Power {
    // Write a program that will find power of any number using for loop
    public static void printPower(int numberToPrint, int power) {
        int result = 1;
        for(int i = 0; i < power; i++){
            result *= numberToPrint;
        }
        System.out.println(result);
    }
}