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
        System.out.println("""
                Welcome to the Simple Calculator!\
                
                Choose an operation:\
                
                1. Addition\
                
                2. Subtraction\
                
                3. Multiplication\
                
                4. Division""");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter two numbers for addition:");
                int add1 = input.nextInt();
                int add2 = input.nextInt();
                System.out.println("Result: " + Addition(add1, add2));
                break;
            case 2:
                System.out.println("Enter two numbers for subtraction:");
                int sub1 = input.nextInt();
                int sub2 = input.nextInt();
                System.out.println("Result: " + Subtraction(sub1, sub2));
                break;
            case 3:
                System.out.println("Enter two numbers for multiplication:");
                int mul1 = input.nextInt();
                int mul2 = input.nextInt();
                System.out.println("Result: " + Multiplication(mul1, mul2));
                break;
            case 4:
                System.out.println("Enter two numbers for division:");
                int div1 = input.nextInt();
                int div2 = input.nextInt();
                try {
                    System.out.println("Result: " + Division(div1, div2));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
        }
    }
}