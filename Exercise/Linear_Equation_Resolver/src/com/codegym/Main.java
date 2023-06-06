package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Equation has no solution");
        } else if (a == 0 && b == 0 && c == 0) {
            System.out.println("Equation has infinity solutions");
        } else {
            System.out.println("Equation has solution: " + (c - b) / a);
        }
    }
}