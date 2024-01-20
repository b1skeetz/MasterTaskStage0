package Conditions;

/*Create a program that will consume a year and a month (validation is required) and will print amount of days in this
month considering also if a year is leap or not.(prints amount of days or else "invalid date", negative years are not
accepted)*/

public class DaysInMonth {
    public static void printDays(int year, int month) {
        if(month > 12 || month < 1 || year <= 0){
            System.out.println("invalid date");
            return;
        }
        int daysInMonth = switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
            default -> 31;
        };
        System.out.println("Days amount = " + daysInMonth);
    }
}