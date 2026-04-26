package ub.com.csi142.tuckshop.utils;

import java.util.Scanner;

public class InputValidator 
{
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Ensures the user enters a valid decimal number (Price).
     * Prevents crashes if letters are entered.
     */
    public static double getValidPrice(String prompt) 
    {
        while (true) 
            {
                 System.out.print(prompt);
            try {
                  double value = Double.parseDouble(scanner.nextLine());
                  if (value < 0) 
                    {
                    System.out.println("Error: Price cannot be negative.");
                    continue;
                    }
                     return value;
                } 
            catch (NumberFormatException exception) 
                    {
                      System.out.println("Error: Invalid input. Please enter a numeric price (e.g 18.50).");
                    }
            }
    }

    /**
     * Ensures the user enters a valid whole number (Quantity/Stock).
     */
    public static int getValidInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int value = Integer.parseInt(scanner.nextLine());
                if (value < 0) {
                    System.out.println("Error: Amount cannot be negative.");
                    continue;
                }
                return value;
            } catch (NumberFormatException exception) {
                System.out.println("Error: Please enter a whole number.");
            }
        }
    }

    /**
     * Ensures the user doesn't leave required text fields blank.
     */
    public static String getNonEmptyString(String prompt) 
    {
        while (true) 
            {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) 
                {
                System.out.println("Error: This field cannot be left blank.");
                continue;
                }
                  return input;
           }
    }
}