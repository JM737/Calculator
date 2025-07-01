import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    static boolean exit = true;
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
                
                4. Division\
                
                5. Exit""");

        System.out.print("Enter your choice (1-5): ");
    }
    static void exitQuestion() {
        System.out.println("Do you want to exit? (yes/no)");
        String response = input.next();
        if (response.equalsIgnoreCase("yes")) {
            exit();
        } else {
            exit = true; // Continue the loop
        }
    }
    /* EXIT FUNCTION */
    static void exit() {
        System.out.println("Exiting the calculator. Goodbye!");
        input.close();
        exit = false; // Set exit too false to stop the loop
    }

    /* ENTRY POINT OF THE PROGRAM */
    public static void main (String[] args) {



        do {
            question();
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter two numbers for addition:");
                    double add1 = input.nextDouble();
                    double add2 = input.nextDouble();
                    System.out.println("Result: " + Addition(add1, add2));
                    exitQuestion(); // Ask if the user wants to exit after addition
                    break;
                case 2:
                    System.out.println("Enter two numbers for subtraction:");
                    double sub1 = input.nextDouble();
                    double sub2 = input.nextDouble();
                    System.out.println("Result: " + Subtraction(sub1, sub2));
                    exitQuestion();
                    break;
                case 3:
                    System.out.println("Enter two numbers for multiplication:");
                    double mul1 = input.nextDouble();
                    double mul2 = input.nextDouble();
                    System.out.println("Result: " + Multiplication(mul1, mul2));
                    exitQuestion();
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
                    exitQuestion();
                    break;
                case 5:
                    exit(); // Call exit function to terminate the program
                    break;
            }
        } while (exit); // Loop indefinitely to allow multiple calculations
    }
}