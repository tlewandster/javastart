package t18_Wprowadzanie_danych.e1;

import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Wprowadź pierwszą liczbę:");
        double firstNumber = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Wprowadź działanie (+-*/):");
        String operation = scanner.nextLine();

        System.out.println("Wprowadź drugą liczbę:");
        double secondNumber = scanner.nextDouble();

        scanner.close();

        String resultTemplate = firstNumber + operation + secondNumber + " = ";
        switch (operation) {
            case "+" -> System.out.println(resultTemplate + (firstNumber + secondNumber));
            case "-" -> System.out.println(resultTemplate + (firstNumber - secondNumber));
            case "*" -> System.out.println(resultTemplate + (firstNumber * secondNumber));
            case "/" -> System.out.println(resultTemplate + (firstNumber / secondNumber));
            default -> System.out.println("Nieznane działanie");
        }
    }
}
