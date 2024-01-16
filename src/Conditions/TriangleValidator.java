package Conditions;

public class TriangleValidator {
    public static void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            System.out.println("it's not a triangle");
            return;
        }
        if ((firstSide + secondSide < thirdSide) || (firstSide + thirdSide < secondSide) || (secondSide + thirdSide < firstSide)){
            System.out.println("it's not a triangle");
            return;
        }
        System.out.println("this is valid triangle");
    }
}