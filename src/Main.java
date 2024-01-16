import Conditions.*;
import LangSyntax.DigitsSumCalculator;
import LangSyntax.NumberReverter;
import Loops.HalfPyramid;
import Loops.MultiplicationTable;
import Loops.Power;
import Loops.Pyramid;
import OOP.Animal;
import OOP.Bird;
import OOP.Dog;

import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // OOP
        Animal animal1 = new Animal("yellow", 1, true); // with fur and only 1 paw
        Animal animal2 = new Animal("greed", 4, false); // without fur but with 4 paws
        System.out.println(animal1.getDescription());
        System.out.println(animal2.getDescription());

        Dog dog = new Dog();
        System.out.println(dog.getDescription()); // This class just inherits the version of method getDescription from
        // parent class, so there are no changes

        Bird bird = new Bird();
        System.out.println(bird.getDescription()); // Within this class getDescription method is overridden so that it
        // can show additional information

        // Lang Syntax
        NumberReverter.revert(489);
        DigitsSumCalculator.calculateSum(4835);

        // Conditions
        SeasonDeterminer.tellTheSeason(1);
        TriangleValidator.validate(3, 4, 5);
        DaysInMonth.printDays(2024, 2);
        IntegerDivider.printCompletelyDivided(10, 5);
        CoordinatePane.printQuadrant(5, -3);
        BitwiseValuesSwap.swap(7, 12);

        //Loops
        MultiplicationTable.printTable(7);
        Pyramid.printPyramid(9);
        Power.printPower(3, 3);
        HalfPyramid.printHalfPyramid(8);
    }
}