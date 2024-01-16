package Conditions;

public class IntegerDivider {
    public static void printCompletelyDivided(int dividend, int divider) {
        int result = dividend / divider;
        if (result * divider == dividend) {
            System.out.println("can be divided completely");
            return;
        }
        System.out.println("cannot be divided completely");
    }
}