package HomeworkBankArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] MyArray = new int[10];

        int i;
        for(i = 0; i < 10; ++i) {
            System.out.println("Enter a[" + i + "]");
            MyArray[i] = in.nextInt();
            System.out.println("your array is " + i);
        }

        for(i = 10; i > 0; --i) {
            System.out.println("Enter your array num [" + i + "]");
            MyArray[i - 1] = in.nextInt();
        }

        System.out.println("your array is " + Arrays.toString(MyArray));
    }
}
