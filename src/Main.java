import LangSyntax.DigitsSumCalculator;
import LangSyntax.NumberReverter;
import OOP.Animal;
import OOP.Bird;
import OOP.Dog;

public class Main {
    public static void main(String[] args) {
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

        NumberReverter.revert(489);
        DigitsSumCalculator.calculateSum(4835);
    }
}