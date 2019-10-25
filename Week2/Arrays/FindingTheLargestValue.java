package Week2.Arrays;

public class FindingTheLargestValue {

    public static void main(String[] args) {

        double num = Math.random() * 100;
        int num2 = (int) num;
        int max = 0;

        int arr[] = new int[10];

        System.out.print("Array: ");
        for (int i = 0; i <10 ; i++) {
            num = Math.random() * 100;
            num2 = (int) num;
            arr[i] = num2;
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i <9 ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The largest value is : " + max);
    }
}
