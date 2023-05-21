package day4Assignment;

import java.util.Scanner;

public class PrintArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inputArray();



    }
    public static void inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Array Element");
        for(int i =0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        dispArray(arr);

    }
public  static void  dispArray(int[] arr){
        for(int i :arr){
            System.out.println(i);
        }
}
    }

