package Conditions;

/*Create a program that will consume 2 integers from method args as data of a coordinate point in a XY coordinate
system and determine in which quadrant the coordinate point lies(beginning with top right:
"first", "second", "third", "fourth", "zero"):*/

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