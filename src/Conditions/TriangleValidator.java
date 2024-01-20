package Conditions;

/*Create a program that will consume 3 points as method arguments and will print to the console if those points can
build up a valid triangle or not. (output when correct: "this is a valid triangle", otherwise : "it's not a triangle")*/

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
        System.out.println("this is a valid triangle");
    }
}