package AlgorithmsAndArrays;

public class ArraysTask {
    public static String[] seasonsArray() {
        return new String[]{"Winter", "Spring", "Summer", "Autumn"};
    }

    public static int[] generateNumbers(int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }

    public static int totalSum(int[] arr) {
        int result = 0;
        for (int el : arr) {
            result += el;
        }
        return result;
    }

    public static int findIndexOfNumber(int[] arr, int elem) {
        for (int i = 0; i < arr.length; i++) {
            if (elem == arr[i]) {
                return i; // returns index (by counting from 0), not actual position (by counting from 1)
            }
        }
        return -1;
    }
    public static String[] reverseArray(String[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
    public static int[] getOnlyPositiveNumbers(int[] arr){
        int newSize = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                newSize++;
            }
        }
        int[] onlyPosArr = new int[newSize];
        int index = 0;
        for (int num : arr) {
            if (num > 0) {
                onlyPosArr[index++] = num;
            }
        }
        return onlyPosArr;
    }
}
