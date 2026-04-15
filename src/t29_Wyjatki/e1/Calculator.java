package t29_Wyjatki.e1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz pierwszą cyfrę: ");
        double firstNumber = getNumber(scanner);
        System.out.print("Wpisz operator: ");
        String operator = getOperator(scanner);
        System.out.print("Wpisz drugą cyfrę: ");
        double secondNumber = getNumber(scanner);
        System.out.println(calculate(firstNumber, operator, secondNumber));
    }

    private static double getNumber(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("Wpisz prawidłową cyfrę: ");
            } finally {
                scanner.nextLine();
            }
        }
    }

    private static String getOperator(Scanner scanner) {
        while (true) {
            try {
                String operator = scanner.next();
                if (operator.equals("+")  || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                    return operator;
                } else throw new UnknownOperatorException("Nieprawidłowy operator. Wybierz +, -, *, /");
            } catch (UnknownOperatorException e) {
                System.out.print(e.getMessage());
                System.out.print("\tWpisz prawidłowy operator: ");
            }
        }
    }

    private static double calculate(double firstNumber, String operator, double secondNumber) {
        switch (operator) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                if (secondNumber == 0) {
                    throw new ArithmeticException("Nie można dzielić przez zero");
                }
                return firstNumber / secondNumber;
        }
        return 0;
    }

}

