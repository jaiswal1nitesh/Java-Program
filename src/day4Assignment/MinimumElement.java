package day4Assignment;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int size=input.nextInt();
        int []arr1=new int[size];
        System.out.println("Enter the array Element");
        for (int i=0;i<size;i++){
            arr1[i]=input.nextInt();
        }
        int min =arr1[0];
        for (int i=1;i<size;i++){
            if(min>arr1[i])
                min=arr1[i];

    }
        System.out.println("Minimum Value of Array  is "+min);
}}
