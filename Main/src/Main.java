import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    /*=====================================*/
    //  FUNCTION TO ADD TWO NUMBERS //
    static int Addition(int a, int b) {
        return a + b;
    }
    //  FUNCTION TO SUBTRACT TWO NUMBERS //
    static int Subtraction(int a, int b) {
        return a - b;
    }
    //  FUNCTION TO MULTIPLY TWO NUMBERS //
    static int Multiplication(int a, int b) {
        return a * b;
    }
    //  FUNCTION TO DIVIDE TWO NUMBERS //
    static int Division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    //  ENTRY POINT OF THE PROGRAM //
    public static void main(String[] args) {
        System.out.println("Welcome to the Simple Calculator!" +
                            "\nChoose an operation:" +
                           "\n1. Addition" +
                           "\n2. Subtraction" +
                           "\n3. Multiplication" +
                           "\n4. Division");
        int choice = input.nextInt();
    }
}