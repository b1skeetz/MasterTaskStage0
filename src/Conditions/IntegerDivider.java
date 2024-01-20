package Conditions;

/*Create a program that will consume 2 integers from method args (dividend and divider) and will perform integer
division of dividend be divider, save the value, and then will multiply result by divider and will if got value
is equal to dividend will print:"can be divided completely", otherwise "cannot be divided completely"
or "division by zero".*/

public class IntegerDivider {
    public static void printCompletelyDivided(int dividend, int divider) {
        try {
            int result = dividend / divider;
            if (result * divider == dividend) {
                System.out.println("can be divided completely");
                return;
            }
            System.out.println("cannot be divided completely");
        } catch (ArithmeticException e){
            System.out.println("division by zero");
        }
    }
}