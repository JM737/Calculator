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
    static void exitQuestion() {
        System.out.print("Do you want to exit? (yes/no): ");
        String response = input.next();
        System.out.println();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Thank you for using the Calculator!");
            exit = false; // Exit the loop
        } else {
            exit = true; // Continue the loop
        }
    }
    static double getValidDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (input.hasNextDouble()) {
                return input.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next(); // Clear invalid input
            }
        }
    }
    /* SWITCH CASE FUNCTION */
    //NEED TO CATCH ALL THE INVALID INPUT//
    // NEED TO ADD A FUNCTION TO CHECK IF THE INPUT IS A NUMBER OR NOT //
    static void switchCase(String switchChoice) {
        switch (switchChoice) {
            case "1":
                System.out.println("[ Addition selected ]");
                double addNum1 = getValidDouble("Enter first number: ");
                double addNum2 = getValidDouble("Enter second number: ");
                double addResult = Addition(addNum1, addNum2);

                System.out.println(addNum1 + " + " + addNum2 + " = " + addResult);
                while (true) {
                    System.out.print("Do you want to add another number to the current result? (yes/no): ");
                    String more = input.next();
                    if (!more.equalsIgnoreCase("yes")) {
                        break;
                    }
                    System.out.println("Current Result: " + addResult);
                    double addNumNext = getValidDouble("Enter another number: ");
                    addResult += addNumNext;
                    System.out.println("Updated Result: " + addResult);
                }
                exitQuestion();
                break;

            case "2":
                System.out.println("[ Subtraction selected ]");
                double subNum1 = getValidDouble("Enter first number: ");
                double subNum2 = getValidDouble("Enter second number: ");
                double subResult = Subtraction(subNum1, subNum2);
                System.out.println(subNum1 + " - " + subNum2 + " = " + subResult);

                while (true) {
                    System.out.print("Do you want to subtract another number from the current result? (yes/no): ");
                    String more = input.next();
                    if (!more.equalsIgnoreCase("yes")) {
                        break;
                    }
                    System.out.println("Current Result: " + subResult);
                    System.out.print("Enter another number: ");
                    double subNumNext = input.nextDouble();
                    subResult -= subNumNext;
                    System.out.println(subResult + " - " + subNumNext + " = "  + subResult);
                }
                exitQuestion();
                break;

            case "3":
                System.out.println("[ Multiplication selected ]");
                System.out.print("Enter first number: ");
                double prodNum1 = input.nextDouble();
                System.out.print("Enter second number: ");
                double prodNum2 = input.nextDouble();
                double prodResult = Multiplication(prodNum1, prodNum2);
                System.out.println(prodNum1 + " x " + prodNum2 + " = " + prodResult);

                while (true) {
                    System.out.print("Do you want to multiply another number with the current result? (yes/no): ");
                    String more = input.next();
                    if (!more.equalsIgnoreCase("yes")) {
                        break;
                    }
                    System.out.println("Current Result: " + prodResult);
                    System.out.print("Enter another number: ");
                    double prodNumNext = input.nextDouble();
                    prodResult *= prodNumNext;
                    System.out.println(prodResult + " x " + prodNumNext + " = " + prodResult);
                }
                exitQuestion();
                break;

            case "4":
                System.out.println("[ Division selected ]");
                System.out.print("Enter first number: ");
                double divNum1 = input.nextDouble();
                System.out.print("Enter second number: ");
                double divNum2 = input.nextDouble();
                double divResult = Division(divNum1, divNum2);
                System.out.println(divNum1 + " / " + divNum2 + " = " + divResult);

                while (true) {
                    System.out.print("Do you want to divide the current result by another number? (yes/no): ");
                    String more = input.next();
                    if (!more.equalsIgnoreCase("yes")) {
                        break;
                    }
                    System.out.println("Current Result: " + divResult);
                    System.out.print("Enter another number: ");
                    double divNumNext = input.nextDouble();
                    divResult = Division(divResult, divNumNext);
                    System.out.println(divResult + " / " + divNumNext + " = "  + divResult);
                }
                exitQuestion();
                break;
            case "5":
                System.out.println("Thank you for using the Calculator!");
                exit = false; // Exit the loop
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                System.out.println();
        }
    }

    /* QUESTION FUNCTION */
    static void question () { System.out.println("""
                Choose an operation:\
                
                1. Addition\
                
                2. Subtraction\
                
                3. Multiplication\
                
                4. Division\
                
                5. Exit""");

        System.out.print("Enter your choice (1-5): ");
    }

    /* ENTRY POINT OF THE PROGRAM */
    public static void main (String[] args) {
        System.out.println("Welcome to the Calculator!");
        do {
            question();
            String choice = input.next();
            switchCase(choice);
        } while (exit); // Loop indefinitely to allow multiple calculations
    }
}