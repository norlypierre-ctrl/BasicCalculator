package com.pluralsight;

import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter Second Number: ");
        double num2 = scanner.nextDouble();

        System.out.println("\n Possible Calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please select an option: ");

        double result = num1 * num2;

        System.out.println("\n" + num1 + " * " + num2 + " = " + result);

        scanner.close();
    }
}