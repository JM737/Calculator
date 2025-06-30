public class Main {
    static int Addition(int a, int b) {
        return a + b;
    }

    static int Subtraction(int a, int b) {
        return a - b;
    }
    static int Multiplication(int a, int b) {
        return a * b;
    }
    static int Division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
    //  ENTRY POINT OF THE PROGRAM //
    public static void main(String[] args) {

    }
}