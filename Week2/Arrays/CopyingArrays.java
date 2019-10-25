package Week2.Arrays;

import java.util.Arrays;

public class CopyingArrays {

    public static void main(String[] args) {
        double num = Math.random() * 100;
        int num2 = (int) num;

        int arr[] = new int[10];
        int arr2[] = new int[10];


        for (int i = 0; i <10 ; i++) {
            num = Math.random() * 100;
            num2 = (int) num;
            arr[i] = num2;
            arr2[i] = arr[i];
        }

        arr[9] = -7;

        System.out.print("Array 1: ");
        for (int i = 0; i <10 ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("Array 2: ");
        for (int i = 0; i <10 ; i++) {
            System.out.print(arr2[i] + " ");
        }


    }

}
