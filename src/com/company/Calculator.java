package com.company;

import java.util.Scanner;

public class Calculator {
    /*
            Welcome USER - DONE
            Choice Options : plus, substract, divide, multiply, rest - DONE
            input user : 2 numbers - DONE
            Control errors - DONE

             */
    public static void printWelcome() {
        System.out.println("Welcome to the Calculator!");
    }

    public static void printMenuCalculator() {
        System.out.println("************************************");
        System.out.println("1. Plus\n2. Substract\n3. Divide\n4. Multiply\n5. Rest\n6. Power\n7. Exit");
    }

    public static float inputUser() {
        Scanner input = new Scanner(System.in);
        float a = 0;
        boolean correctInput = false;

        System.out.print("Write a number: ");
        do {
            correctInput = input.hasNextFloat();
            if (!correctInput) {
                System.out.println("Write a number please.");
                input.nextLine();
            }
        } while (!correctInput);
        a = input.nextFloat();
        input.nextLine();

        return a;
    }

    public static int inputSwitchMenu(){
        Scanner input = new Scanner(System.in);
        int a = 0;
        boolean correctInput = false;

        System.out.print("Choose an option: ");
        do {
            correctInput = input.hasNextInt();
            if (!correctInput) {
                System.out.println("Write a number please.");
                input.nextLine();
            }
        } while (!correctInput);
        a = input.nextInt();
        input.nextLine();

        return a;
    }

    public static float plus(){
        float a = 0, b = 0;
        a = inputUser();
        b = inputUser();

        return (a + b);
    }

    public static float substract(){
        float a = 0, b = 0;
        a = inputUser();
        b = inputUser();

        return (a - b);
    }

    public static float divide(){
        float a = 0, b = 0;
        a = inputUser();
        b = inputUser();

        return (a / b);
    }

    public static float multiply(){
        float a = 0, b = 0;
        a = inputUser();
        b = inputUser();

        return (a * b);
    }

    public static float rest(){
        float a = 0, b = 0;
        a = inputUser();
        b = inputUser();

        return (a % b);
    }

    public static double pow(){
        double a = 0, b = 0;
        a = inputUser();
        b = inputUser();

        return Math.pow(a, b);
    }

    public static void main(String[] args) {

        int inputMenu;

        printWelcome();
        do {
            printMenuCalculator();
            inputMenu = inputSwitchMenu();

            switch (inputMenu) {
                case 1:
                    System.out.println(plus());
                    System.out.println();
                    break;
                case 2:
                    System.out.println(substract());
                    System.out.println();
                    break;
                case 3:
                    System.out.println(divide());
                    System.out.println();
                    break;
                case 4:
                    System.out.println(multiply());
                    System.out.println();
                    break;
                case 5:
                    System.out.println(rest());
                    System.out.println();
                    break;
                case 6:
                    System.out.println(pow());
                    break;
                case 7:
                    System.out.println("See you next time!");
                    break;
                default:
                    System.out.println("Choose a correct option.");
                    break;
            }
        } while (inputMenu != 7);
    }
}