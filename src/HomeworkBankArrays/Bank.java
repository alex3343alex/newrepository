package HomeworkBankArrays;

import java.util.Scanner;

public class Bank {

    public static class BankDeposit {
        public BankDeposit() {
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println(" How much money do you wanna invest? ");
            double principle = input.nextDouble();
            System.out.println("\n What is APR?  (4.9 = 4.9%)");
            double rate = input.nextDouble();
            rate /= 100.0D;
            System.out.println("\n How long do you want to invest this money for?");
            int Time = input.nextInt();
            double total = principle * (1.0D + rate * (double)Time);
            System.out.println("\n The total amount of money you will get after -  " + Time + " years is " + total);
        }
    }
}
