package com.practice.javaone.hw2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("List of operations: add subtract multiply divide alphabetize");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an operation:");
        String operation = scanner.nextLine();

        operation = operation.toLowerCase();

        switch(operation){
            case "add":
                System.out.println("Enter two integers:");
                String input = scanner.nextLine();
                String[] inputArr = input.split(" ");
                try {
                    int input1 = Integer.parseInt(inputArr[0]);
                    int input2 = Integer.parseInt(inputArr[1]);
                    System.out.println("Answer: " + (input1 + input2));
                }
                catch (Exception e){
                    System.out.println("Invalid input entered. Terminating...");
                }
                break;

            case "subtract":
                System.out.println("Enter two integers:");
                input = scanner.nextLine();
                inputArr = input.split(" ");
                try {
                    int input1 = Integer.parseInt(inputArr[0]);
                    int input2 = Integer.parseInt(inputArr[1]);
                    System.out.println("Answer: " + (input1 - input2));
                }
                catch (Exception e){
                    System.out.println("Invalid input entered. Terminating...");
                }
                break;

            case "multiply":
                System.out.println("Enter two doubles:");
                input = scanner.nextLine();
                inputArr = input.split(" ");
                try {
                    double input1 = Double.parseDouble(inputArr[0]);
                    double input2 = Double.parseDouble(inputArr[1]);
                    System.out.println("Answer: " + Math.round(input1 * input2*100)/100.0);
                }
                catch (Exception e){
                    System.out.println("Invalid input entered. Terminating...");
                }
                break;

            case "divide":
                System.out.println("Enter two doubles:");
                input = scanner.nextLine();
                inputArr = input.split(" ");
                try {
                    double input1 = Double.parseDouble(inputArr[0]);
                    double input2 = Double.parseDouble(inputArr[1]);
                    if (input2 == 0){
                        System.out.println("Invalid input entered. Terminating...");
                    }
                    else {
                        System.out.println("Answer: " + Math.round(input1 / input2 * 100) / 100.0);
                    }
                }
                catch (Exception e){
                    System.out.println("Invalid input entered. Terminating...");
                }
                break;

            case "alphabetize":
                System.out.println("Enter two words:");
                input = scanner.nextLine();
                inputArr = input.split(" ");

                String input1 = inputArr[0];
                String input2 = inputArr[1];

                String input1Lower = input1.toLowerCase();
                String input2Lower = input2.toLowerCase();

                String pattern = "[a-zA-Z]+";
                if (Pattern.matches(pattern, input1) && Pattern.matches(pattern, input2)){
                    if (input1Lower.compareTo(input2Lower) < 0){
                        System.out.println("Answer: " + input1+" comes before "+input2+" alphabetically.");
                    }
                    else if (input1Lower.compareTo(input2Lower) == 0) {
                        System.out.println("Answer: Chicken or Egg.");
                    }
                    else {
                        System.out.println("Answer: " + input2+" comes before "+input1+" alphabetically.");

                    }

                }
                else {
                    System.out.println("Invalid input entered. Terminating...");
                }
                break;
            default:
                System.out.println("Invalid input entered. Terminating...");
                break;
        }
/*
        if (operation.equals("add")){
            System.out.println("Enter two integers:");
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");
            try {
                int input1 = Integer.parseInt(inputArr[0]);
                int input2 = Integer.parseInt(inputArr[1]);
                System.out.println("Answer: " + (input1 + input2));
            }
            catch (Exception e){
                System.out.println("Invalid input entered. Terminating...");
            }
        }
        else if (operation.equals("subtract")){
            System.out.println("Enter two integers:");
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");
            try {
                int input1 = Integer.parseInt(inputArr[0]);
                int input2 = Integer.parseInt(inputArr[1]);
                System.out.println("Answer: " + (input1 - input2));
            }
            catch (Exception e){
                System.out.println("Invalid input entered. Terminating...");
            }
        }
        else if (operation.equals("multiply")){
            System.out.println("Enter two doubles:");
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");
            try {
                double input1 = Double.parseDouble(inputArr[0]);
                double input2 = Double.parseDouble(inputArr[1]);
                System.out.println("Answer: " + Math.round(input1 * input2*100)/100.0);
            }
            catch (Exception e){
                System.out.println("Invalid input entered. Terminating...");
            }
        }
        else if (operation.equals("divide")){
            System.out.println("Enter two doubles:");
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");
            try {
                double input1 = Double.parseDouble(inputArr[0]);
                double input2 = Double.parseDouble(inputArr[1]);
                if (input2 == 0){
                    System.out.println("Invalid input entered. Terminating...");
                }
                else {
                    System.out.println("Answer: " + Math.round(input1 / input2 * 100) / 100.0);
                }
            }
            catch (Exception e){
                System.out.println("Invalid input entered. Terminating...");
            }
        }
        else if (operation.equals("alphabetize")){
            System.out.println("Enter two words:");
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");

            String input1 = inputArr[0];
            String input2 = inputArr[1];

            String pattern = "[a-zA-Z]+";
            if (Pattern.matches(pattern, input1) && Pattern.matches(pattern, input2)){
                if (input1.compareTo(input2) < 0){
                    System.out.println("Answer: " + input1+" comes before "+input2+" alphabetically.");
                }
                else if (input1.compareTo(input2) == 0) {
                    System.out.println("Answer: Chicken or Egg.");
                }
                else {
                    System.out.println("Answer: " + input2+" comes before "+input1+" alphabetically.");

                }

            }
            else {
                System.out.println("Invalid input entered. Terminating...");
            }
        }
        else {
            System.out.println("Invalid input entered. Terminating...");
        }*/
    }
}
