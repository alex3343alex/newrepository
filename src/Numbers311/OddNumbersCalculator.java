package Numbers311;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddNumbersCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Enter num a");
            int a = s.nextInt();
            System.out.println("Enter num b");
            int b = s.nextInt();
            int sum = a + b;
            System.out.println(sum);
        } catch (InputMismatchException e) {
            System.out.println("You should enter integer only");
        }
    }
}