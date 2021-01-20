package Numbers311;

public class VariablesValidator {
    public static void validate(double a, double b) throws IllegalArgumentException,
            ArithmeticException, IllegalAccessException, MyException {
        if
            (a < 0 && b < 0) {throw new IllegalArgumentException();
        }
        if  (a == 0 && b != 0) {throw new ArithmeticException();
        }
        if (a == 0 && b == 0){throw new IllegalAccessException();
        }
        if (a > 0 && b > 0) {
            throw new MyException();
        }
    }
}