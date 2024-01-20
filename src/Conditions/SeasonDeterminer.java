package Conditions;

/*Implement the program that will print the season name to the console by the number of the month.
If month is incorrect -> print "Wrong month number". Month will be passed as the method argument.
(Example: "1" -> "Winter", 0 -> "Wrong month number")*/

public class SeasonDeterminer {
    public static void tellTheSeason(int monthNumber) {
        switch (monthNumber) {
            case 1, 2, 12 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("Wrong month number");
        }
    }
}