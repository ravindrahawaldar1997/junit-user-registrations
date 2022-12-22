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
    public static boolean isValidEmail(String email) {

        String emailRegex = "^[a-zA-Z0-9_+-]+(?:\\.[a-zA-Z0-9_+-]+)*@" +
                "([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}" +
                "(?:(\\.([A-Za-z]{2})))?$";;

        Pattern pattern = Pattern.compile(emailRegex);

        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    public static boolean isValidMobileNumber(String mobileNumber) {
        String mobileNumberRegex =  "^[1-9]{2}[\\s][0-9]{10}$";
        Pattern pattern = Pattern.compile(mobileNumberRegex);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }
    //Creating isValidPassword method to validate the password given by user using regex
    public static boolean isValidPassword(String password) {
        System.out.println(password);
        String passwordRegex = "^[a-z]{8}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    //Creating isValidPassword method to validate the password given by user using regex
    public static boolean isValidPasswordOneUpperChar(String password) {
        System.out.println(password);
        String passwordRegex = "^[A-Z]{1}[a-z]{7}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        UserInputValidation userInputValidation = new UserInputValidation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.next();
        System.out.println(UserInputValidation.isValidFirstName(firstName) ? "Valid" : "In Valid");
        System.out.println("Enter last name: ");
        String lastName = scanner.next();
        System.out.println(UserInputValidation.isValidLastName(lastName) ? "Valid" : "In Valid");
        System.out.println("Enter email: ");
        String email = scanner.next();
        System.out.println(userInputValidation.isValidEmail(email) ? "Valid" : "In Valid");
        System.out.println("Enter mobile number: ");
        String mobileNumber = scanner.next();
        System.out.println(userInputValidation.isValidMobileNumber(mobileNumber) ? "Valid" : "In Valid");
        System.out.println("Eneter password: ");
        String password = scanner.next();
        System.out.println(userInputValidation.isValidPassword(password) ? "Valid" : "In Valid");
        System.out.println("Eneter password with one upper char: ");
        String passwordUpperChar = scanner.next();
        System.out.println(userInputValidation.isValidPasswordOneUpperChar(passwordUpperChar) ? "Valid" : "In Valid");
        scanner.close();
    }

    }
