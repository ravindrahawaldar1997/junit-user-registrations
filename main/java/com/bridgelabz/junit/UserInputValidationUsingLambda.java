package com.bridgelabz.junit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class UserInputValidationUsingLambda {
    @FunctionalInterface
    public interface Validate {
        // Declaring an Abstract method
        boolean validate(String input);
    }

    //method validateFirstName to validate first name using regex using lambda function
    //method return - Validate type

    public static Validate validateFirstName() {
        return firstName -> firstName.matches("^[A-Z]{1}[a-z]{2,}$");
    }

    // method validateLastName to validate last name using regex using lambda function
    // Validate type
    public static Validate validateLastName() {
        return lastName -> lastName.matches("^[A-Z]{1}[a-z]{2,}$");
    }

    //Method validateEmail to validate email using regex using lambda function
    //return - Validate type
    public static Validate validateEmail() {
        return email -> email.matches("^[a-zA-Z-9]+([._+-]?[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2})?$");
    }

    //method validateMobileNumber to validate mobile number using regex using lambda function
    //return - Validate type
    public static Validate validateMobileNumber() {
        return mobileNumber -> mobileNumber.matches("^[0-9]{2}[\\s][0-9]{10}$");
    }
    // method validatePassword to validate password using regex using lambda function
    //return - Validate type

    public static Validate validatePassword() {
        return password -> password.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*" +
                "[\\@\\#\\^\\!\\$\\%\\&\\?][a-zA-Z0-9]*$");
    }
    public static  void main(String[] args) throws IOException {

        UserInputValidationUsingLambda userInputValidationUtil = new UserInputValidationUsingLambda();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("******* FIRSTNAME VALIDATION *******");
            System.out.println("Please Enter first name: ");
            String firstName = bufferedReader.readLine();
            System.out.println(UserInputValidationUsingLambda.validateFirstName().validate(firstName) ? "Valid" : "InValid");
            System.out.println("******* LASTNAME VALIDATION *******");
            System.out.println("Please Enter last name: ");
            String lastName = bufferedReader.readLine();
            System.out.println(UserInputValidationUsingLambda.validateLastName().validate(lastName) ? "Valid" : "InValid");
            System.out.println("******* EMAIL VALIDATION *******");
            System.out.println("Please Enter email: ");
            String email = bufferedReader.readLine();
            System.out.println(UserInputValidationUsingLambda.validateEmail().validate(email) ? "Valid" : "InValid");
            System.out.println("******* MOBILE FORMAT VALIDATION *******");
            System.out.println("Please Enter Mobile Number: ");
            String mobileNumber = bufferedReader.readLine();
            System.out.println(UserInputValidationUsingLambda.validateMobileNumber().validate(mobileNumber) ? "Valid" : "InValid");
            System.out.println("******* PASSWORD VALIDATION *******");
            System.out.println("Please Enter Password: ");
            String password = bufferedReader.readLine();
            System.out.println(UserInputValidationUsingLambda.validatePassword().validate(password) ? "Valid" : "InValid");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try{
            bufferedReader.close();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
