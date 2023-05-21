package day4Assignment;

public class PrintArray {
    static int[] arr = {22, 33, 44, 55, 33};
    public static void main(String[] args) {

        displayArray(arr);
    }

    public static void displayArray(int[] array) {
        for (int j = 0, i = 0; i < array.length; i++, j++) {
            System.out.println("Array[" + j + "]  =  " + array[i]);

        }
    }
}
