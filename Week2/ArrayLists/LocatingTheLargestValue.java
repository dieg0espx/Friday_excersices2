package Week2.ArrayLists;

import java.util.ArrayList;

public class LocatingTheLargestValue {

    public static void main(String[] args) {
        int max = 0;
        int place =0;

        ArrayList<Integer> arr = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            double num = Math.random() * 100;
            int num2 = (int) num;
            arr.add(i, num2);

        }

        System.out.println();

        for (int i = 0; i <10 ; i++) {
            if(arr.get(i) > max){
                max = arr.get(i);
                place = i;
            }
        }


        System.out.println("ArrayList: " + arr);

        System.out.println("The largest value is " + max + ", which is in slot " + place);


    }

}
