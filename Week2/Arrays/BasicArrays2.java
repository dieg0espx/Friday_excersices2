package Week2.Arrays;

public class BasicArrays2 {

    public static void main(String[] args) {
        double num = Math.random() * 100;
        int num2 = (int) num;

        int arr[] = new int[10];

        for (int i = 0; i <10 ; i++) {
            num = Math.random() * 100;
            num2 = (int) num;
            arr[i] = num2;
            System.out.println("Slot " + i + " contains a " + arr[i]);
        }
    }


}
