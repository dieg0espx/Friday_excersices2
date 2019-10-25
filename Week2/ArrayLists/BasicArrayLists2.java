package Week2.ArrayLists;
import java.util.ArrayList;


public class BasicArrayLists2 {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>(10);


        for (int i = 0; i <10 ; i++) {
            double num = Math.random() * 100;
            int num2 = (int) num;
            arr.add(i, num2);
        }

        System.out.println("ArrayList: " + arr);
    }
}
