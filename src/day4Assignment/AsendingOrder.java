package day4Assignment;

public class AsendingOrder {
    public static void main(String[] args) {
        int[] arr = {223, 12, 121, 232, 311};
        order(arr);
    }

    public static void order(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]<arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }

            }

            }
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);}

        }



        }



