package com.bridgelabz.junit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputValidation {
    public static boolean isValidFirstName(String firstName) {

        String firstNameRegex = "[A-Z]{1}[a-z]{2,}";  //Declaring regex pattern to check the firstName

        Pattern pattern = Pattern.compile(firstNameRegex);
        Matcher matcher = pattern.matcher(firstName);

        return matcher.matches();
    }
    public static boolean isValidLastName(String lastName) {
        String firstNameRegex = "[A-Z]{1}[a-z]{2,}";

        Pattern pattern = Pattern.compile(firstNameRegex);

        Matcher matcher = pattern.matcher(lastName);

        return matcher.matches();
    }

    public static void main(String[] args) {
        UserInputValidation userInputValidation = new UserInputValidation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.next();
        System.out.println(UserInputValidation.isValidFirstName(firstName) ? "Valid" : "In Valid");
        System.out.println(UserInputValidation.isValidFirstName(firstName) ? "Valid" : "In Valid");
        System.out.println("Enter last name: ");
        String lastName = scanner.next();
        System.out.println(UserInputValidation.isValidLastName(lastName) ? "Valid" : "In Valid");
    }
}