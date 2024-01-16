package Loops;

public class HalfPyramid {
    public static void printHalfPyramid(int cathetusLength) {
        StringBuilder level = new StringBuilder();
        for(int i = 1; i <= cathetusLength; i++){
            int spacesCountBeforeNum = cathetusLength - i;
            for(int j = 1; j <= spacesCountBeforeNum; j++){
                level.append(" ");
            }
            for(int k = i; k >= 1; k--){
                level.append("*");
            }
            System.out.println(level);
            level = new StringBuilder();
        }
    }
}