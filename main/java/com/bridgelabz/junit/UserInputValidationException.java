package com.bridgelabz.junit;

import exception.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputValidationException {
    boolean result = false;

    // Method isValidFirstName to validate the first name given by user using regex
    public boolean isValidFirstName(String firstName) throws InvalidFirstNameException {
        try {

            // Declaring regex pattern to check the firstName
            String firstNameRegex = "^[A-Z]{1}[a-z]{2,}$";

            // Compiling the regex
            Pattern pattern = Pattern.compile(firstNameRegex);

            // Checking fot the pattern match

            Matcher matcher = pattern.matcher(firstName);

            result = matcher.matches();
            if (!result) {
                throw new InvalidFirstNameException("Please enter valid input.");
            }
        } catch (NullPointerException npe) {
            throw new InvalidFirstNameException("Given first name is null. Please enter valid input.");
        }
        return result;
    }
    // method isValidLastName to validate the last name given by user using regex
    public boolean isValidLastName(String lastName) throws InvalidLastNameException {
        try {

            String lastNameRegex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(lastNameRegex);
            Matcher matcher = pattern.matcher(lastName);
            result = matcher.matches();
            if (!result) {
                throw new InvalidLastNameException("Please enter valid input.");
            }
        } catch (NullPointerException npe) {
            throw new InvalidLastNameException("Given last name is null. Please enter valid input.");
        }
        return result;
    }

    //method isValidEmail to validate the email given by user using regex
    public boolean isValidEmail(String email) throws InvalidEmailException {
        try {
            String emailRegex = "^[a-zA-Z-9]+([._+-]?[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2})?$";
            Pattern pattern = Pattern.compile(emailRegex);
            Matcher matcher = pattern.matcher(email);
            result = matcher.matches();
            if (!result) {
                throw new InvalidEmailException("Please enter valid input.");
            }
        } catch (NullPointerException npe) {
            throw new InvalidEmailException("Given email is null. Please enter valid input.");
        }
        return result;
    }

    // method isValidMobileNumber to validate the mobile format given by user using regex
    public boolean isValidMobileNumber(String mobileNumber) throws InvalidMobileNumberException {
        try {
            String mobileNumberRegex = "^[0-9]{2}[\\s][0-9]{10}$";
            Pattern pattern = Pattern.compile(mobileNumberRegex);
            Matcher matcher = pattern.matcher(mobileNumber);
            result = matcher.matches();
            if (!result) {
                throw new InvalidMobileNumberException("Please enter valid input.");
            }
        } catch (NullPointerException npe) {
            throw new InvalidMobileNumberException("Given email is null. Please enter valid input.");
        }
        return result;
    }

    //method isValidPassword to validate the password given by user using regex
    public boolean isValidPassword(String password) throws InvalidPasswordException {
        try {
            String passwordRegex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*" +
                    "[\\@\\#\\^\\!\\$\\%\\&\\?][a-zA-Z0-9]*$";

            Pattern pattern = Pattern.compile(passwordRegex);
            Matcher matcher = pattern.matcher(password);
            result = matcher.matches();
            if (!result) {
                throw new InvalidPasswordException("Please enter valid input.");
            }
        } catch (NullPointerException npe) {
            throw new InvalidPasswordException("Given email is null. Please enter valid input.");
        }
        return result;
    }
    public static void main(String[] args) throws InvalidFirstNameException, InvalidLastNameException, InvalidEmailException, InvalidMobileNumberException, InvalidPasswordException {
        UserInputValidationException userInputValidation = new UserInputValidationException();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.next();
        System.out.println(userInputValidation.isValidFirstName(firstName) ? "Valid" : "In Valid");
        System.out.println("Enter last name: ");
        String lastName = scanner.next();
        System.out.println(userInputValidation.isValidLastName(lastName) ? "Valid" : "In Valid");
        System.out.println("Enter email: ");
        String email = scanner.next();
        System.out.println(userInputValidation.isValidEmail(email) ? "Valid" : "In Valid");
        System.out.println("Enter mobile number: ");
        String mobileNumber = scanner.next();
        System.out.println(userInputValidation.isValidMobileNumber(mobileNumber) ? "Valid" : "In Valid");
        System.out.println("Enetr password: ");
        String password = scanner.next();
        System.out.println(userInputValidation.isValidPassword(password) ? "Valid" : "In Valid");
        scanner.close();
    }
}
