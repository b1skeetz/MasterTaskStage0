package AlgorithmsAndArrays;

public class ArraysTask {

    // seasonsArray - return a String[] array that will list all the seasons of the year, starting with winter.
    public static String[] seasonsArray() {
        return new String[]{"Winter", "Spring", "Summer", "Autumn"};
    }

    // generateNumbers - generate an int[] array of consecutive positive integers starting at 1 of the given length
    // (length parameter > 0)
    public static int[] generateNumbers(int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }

    // totalSum - find the sum of all elements of the int[] array.
    public static int totalSum(int[] arr) {
        int result = 0;
        for (int el : arr) {
            result += el;
        }
        return result;
    }

    // findIndexOfNumber - return the index of the first occurrence of number in the arr array. If there is no such
    // element in the array, return -1.
    public static int findIndexOfNumber(int[] arr, int elem) {
        for (int i = 0; i < arr.length; i++) {
            if (elem == arr[i]) {
                return i; // returns index (by counting from 0), not actual position (by counting from 1)
            }
        }
        return -1;
    }

    // reverseArray - return the new String[] array obtained from the arr array by reversing the order of the elements.
    public static String[] reverseArray(String[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    // getOnlyPositiveNumbers - return new int[] array obtained from arr int[] array by choosing positive numbers only.
    // P.S. 0 is not a positive number
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