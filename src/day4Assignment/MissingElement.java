package day4Assignment;

public class MissingElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8};

        for (int i = arr[0]; i < arr[arr.length - 1]; i++) {
            boolean flag = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    flag = true;
                }

            }

            if (flag!= true){

                System.out.println(i);
            }
        }
    }
}
