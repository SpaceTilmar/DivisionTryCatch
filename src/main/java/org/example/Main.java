package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Enter Numerator
20
Enter Denominator
0
You cannot divide by zero
Enter Numerator
20
Enter Denominator
y
You must enter a whole number
Enter Numerator
60
Enter Denominator
2
result is 30
         */
        boolean tryTrue = false;
        while(tryTrue == false) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter Numerator: ");
                int numerator = scanner.nextInt();
                System.out.println("Enter Denominator: ");
                int denominator = scanner.nextInt();

                int total = numerator / denominator;
                System.out.println(total);
                tryTrue = true;
            } catch (ArithmeticException e) {
                System.out.println("You cannot divide by zero.");
            } catch (InputMismatchException e) {
                System.out.println("You must use whole number");
            }

            }
        }
    }
