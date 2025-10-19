//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class DivideByZeroNoExpectionHandling {

    public static int quotient(int numerator, int denominator) {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer numerator: ");
        int numerator = scanner.nextInt();

        System.out.println("Please enter an integer denominator: ");
        int denominator = scanner.nextInt();

        int result = quotient(numerator, denominator);

        System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
    }
}