import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    /*=====================================*/
    //  FUNCTION TO ADD TWO NUMBERS //
    static double Addition(double a, double b) {
        return a + b;
    }
    //  FUNCTION TO SUBTRACT TWO NUMBERS //
    static double Subtraction(double a, double b) {
        return  a - b;
    }
    //  FUNCTION TO MULTIPLY TWO NUMBERS //
    static double Multiplication(double a, double b) {
        return a * b;
    }
    //  FUNCTION TO DIVIDE TWO NUMBERS //
    static double Division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
    /* QUESTION FUNCTION */
    static void question () { System.out.println("""
                Welcome to the Simple Calculator!\
                
                Choose an operation:\
                
                1. Addition\
                
                2. Subtraction\
                
                3. Multiplication\
                
                4. Division""");

        System.out.print("Enter your choice (1-4): ");
    }

    /* ENTRY POINT OF THE PROGRAM */
    public static void main (String[] args) {

        question();
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter two numbers for addition:");
                double add1 = input.nextDouble();
                double add2 = input.nextDouble();
                System.out.println("Result: " + Addition(add1, add2));
                break;
            case 2:
                System.out.println("Enter two numbers for subtraction:");
                double sub1 = input.nextDouble();
                double sub2 = input.nextDouble();
                System.out.println("Result: " + Subtraction(sub1, sub2));
                break;
            case 3:
                System.out.println("Enter two numbers for multiplication:");
                double mul1 = input.nextDouble();
                double mul2 = input.nextDouble();
                System.out.println("Result: " + Multiplication(mul1, mul2));
                break;
            case 4:
                System.out.println("Enter two numbers for division:");
                double div1 = input.nextDouble();
                double div2 = input.nextDouble();
                try {
                    System.out.println("Result: " + Division(div1, div2));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
        }
    }
}