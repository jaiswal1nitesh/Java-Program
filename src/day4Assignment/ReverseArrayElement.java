package day4Assignment;

import java.util.Scanner;

public class ReverseArrayElement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size= sc.nextInt();
        String [] name =new String[size];
        System.out.println("Enter Array Element in String Type");
        for (int i=0;i<size;i++){
            name[i]=sc.next();

        }

        System.out.println("Your  Array Element ");
        for (int j=0,i=0;i<size;i++,j++){
            System.out.println("Your Array is name["+j+"] have value = "+name[i]);
        }
        System.out.println("Reverse The Array Value");
        for (int i= name.length-1;i>=0;i--){
            System.out.println(name[i]);
        }
    }}