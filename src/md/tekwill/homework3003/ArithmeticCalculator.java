package md.tekwill.homework3003;

import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("operator: ");
        String operator = in.nextLine();
        System.out.print("first number: ");
        float first = in.nextFloat();
        System.out.print("second number: ");
        float second = in.nextFloat();
        float result;
        switch (operator) {
            case "+":
                result = first + second;
                System.out.print(first + " " + operator + " " + second + " = " + result);
                break;
            case "-":
                result = first - second;
                System.out.print(first + " " + operator + " " + second + " = " + result);
                break;
            case "*":
                result = first * second;
                System.out.print(first + " " + operator + " " + second + " = " + result);
                break;
            case "/":
                result = first / second;
                System.out.print(first + " " + operator + " " + second + " = " + result);
                break;


            default:
                System.out.print("Invalid! Please enter \"+\", \"-\", \"*\" or \"/\" ");
                break;
        }

    }

}

