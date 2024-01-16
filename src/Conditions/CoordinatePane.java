package Conditions;

public class CoordinatePane {
    public static void printQuadrant(int x, int y) {
        if(x == 0 && y == 0){
            System.out.println("zero");
        }
        else if(x > 0 && y > 0){
            System.out.println("first");
        }
        else if(x < 0 && y > 0){
            System.out.println("second");
        }
        else if(x < 0 && y < 0){
            System.out.println("third");
        }
        else if(x > 0 && y < 0){
            System.out.println("fourth");
        }
        else {
            System.out.println("on the border of somewhere");
            // There is no description in a problem about border cases
            // when either x or y equals 0
        }
    }
}