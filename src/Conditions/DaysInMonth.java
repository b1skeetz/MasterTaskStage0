package Conditions;

public class DaysInMonth {
    public static void printDays(int year, int month) {
        if(month > 12 || month < 1 || year <= 0){
            System.out.println("invalid date");
            return;
        }
        int daysInMonth;
        switch (month) {
            case 4:case 6:case 9:case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
                break;
            default:
                daysInMonth = 31;
        }
        System.out.println("Days amount = " + daysInMonth);
    }
}