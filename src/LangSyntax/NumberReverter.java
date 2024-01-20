package LangSyntax;

/*Revert 3-digit number that will be passed (e.g.: given -> 489, expected -> 984) and print it.
Where number - variable that should be used within the program.*/

public class NumberReverter {
    public static void revert(int number){
        /*if(number > 999 || number < 100) {
            System.out.println("Incorrect number format");
            return;
        }*/
        int numBeginToEnd = number / 100;
        int numCenter = (number / 10) % 10;
        int numEndToBegin = number % 10;
        System.out.println(numEndToBegin * 100 + numCenter * 10 + numBeginToEnd);
    }
}