package day4Assignment;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array Element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max=0;
        for (int i = 0; i < size; i++) {
            if (arr[0] == arr[i]) {
                max = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }


        }
        System.out.println("max element"+max);

    }
}
