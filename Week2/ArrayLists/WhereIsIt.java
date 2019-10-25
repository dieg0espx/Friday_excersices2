package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class WhereIsIt {

        public static void main(String[] args) {

            int find;
            Scanner in = new Scanner(System.in);
            ArrayList<Integer> arr = new ArrayList<Integer>(10);

            for (int i = 0; i <10 ; i++) {
                double num = Math.random() * 50;
                int num2 = (int) num;
                arr.add(num2);
            }
            System.out.println("ArrayList: " + arr);
            System.out.println();
            System.out.print("Value to find :");

            find = in.nextInt();
            boolean ok = false;
            for (int i = 0; i <10 ; i++) {
                if(arr.get(i) == find){
                    System.out.println(find + " is in slot " + i );
                    ok = true;
                }
            }
            if(!ok){
                System.out.println(find + " is not on the array");
            }
        }
    }

