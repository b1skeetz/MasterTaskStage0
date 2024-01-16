package Loops;

public class Pyramid {
    //Write a program that will print a pyramid(n):
    //    1
    //   212
    //  32123
    // 4321234
    //543212345
    //...n
    public static void printPyramid(int cathetusLength) {
        StringBuilder level = new StringBuilder();
        for(int i = 1; i <= cathetusLength; i++){
            int spacesCountBeforeNum = cathetusLength - i;
            for(int j = 1; j <= spacesCountBeforeNum; j++){
                level.append(" ");
            }
            for(int k = i; k >= 1; k--){
                level.append(k);
            }
            for(int k = 2; k <= i; k++){
                level.append(k);
            }
            System.out.println(level);
            level = new StringBuilder();
        }
    }
}