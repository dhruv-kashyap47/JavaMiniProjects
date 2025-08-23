import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char runAgain = 'y';
        while (runAgain == 'y' || runAgain == 'Y') {
            System.out.println("Enter first number: ");
            double a = sc.nextDouble();
            System.out.println("Enter the operation: (+,-,*,/");
            char op = sc.next().trim().charAt(0);
            System.out.println("Enter second number: ");
            double b = sc.nextDouble();


            switch (op) {
                case '+' -> System.out.println(a + b);
                case '-' -> System.out.println(a - b);
                case '*' -> System.out.println(a * b);
                case '/' -> {
                    if (b == 0) {
                        System.out.println("invalid");
                    } else {
                        System.out.println(a / b);
                    }
                }
                default -> System.out.println("invalid operation");

            }
            System.out.print("\nPerform another calculation? (y/n): ");
            runAgain = sc.next().trim().charAt(0);

        }
    }
    }

