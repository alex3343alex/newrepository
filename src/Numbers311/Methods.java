package Numbers311;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Methods {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Start yes/no");
        while (DoYWontToContinue()) {
            System.out.println("select operation: 1.Add 2.Minus 3. Divide 4. Multiply ");
            int operation = scanner.nextInt();

            System.out.println("Enter variables a and b");
            double b;
            double a;
            try {
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                if (validateVariables(a, b)) {
                    switch (operation) {
                        case 1:
                            add(a, b);
                            break;
                        case 2:
                            minus(a, b);
                            break;
                        case 3:
                            divide(a, b);
                            break;

                        case 4:
                            multiply(a, b);
                            break;
                        default:
                            System.out.println("Incorrect input");
                            System.out.println();
                            break;
                    }
                }
                System.out.println("Continue? (YES/NO)");
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("You should enter double only");
            }
        }
    }
    public static boolean validateVariables(double a, double b) {
        boolean valid = false;

        try {
            VariablesValidator.validate(a, b);
            valid = true;
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка : a < 0 і b < 0");
        } catch (ArithmeticException e) {
            System.out.println("Помилка : a = 0 і b != 0 або a != 0 і b = 0");
        } catch (IllegalAccessException e) {
            System.out.println("Помилка : a = 0 i b = 0");
        } catch (MyException e) {
            System.out.println("Помилка : a > 0 i b > 0");
        }

        System.out.println();

        return valid;
    }
    public static boolean DoYWontToContinue() {
        String s = scanner.nextLine();
        System.out.println();
        boolean yes = true;
        while (!s.equalsIgnoreCase("no") && !s.equalsIgnoreCase("yes")) {
            System.out.println("Incorrect input, you can only say yes or no.\nContinue? (YES/NO)");
            s = scanner.nextLine();
            System.out.println();
        }
        if (s.equalsIgnoreCase("no")) {
            yes = false;
        }
        return yes;
    }
    public static void add(double a, double b) {
        System.out.println("a + b = " + (a + b));
    }

    public static void minus(double a, double b) { System.out.println("a - b = " + (a - b));
    }

    public static void multiply(double a, double b) {
        System.out.println("a * b = " + (a * b));
    }

    public static void divide(double a, double b) {
                System.out.println("a / b = " + (a / b));
    }
}