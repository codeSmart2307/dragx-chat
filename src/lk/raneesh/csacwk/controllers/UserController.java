package lk.raneesh.csacwk.controllers;

import javax.swing.JOptionPane;
import lk.raneesh.csacwk.datastructure.User;
import lk.raneesh.csacwk.utility.UserValidation;
import lk.raneesh.csacwk.webserviceclient.UserServiceClient;

public class UserController {

    private static User currUser;

    // Method to register a new user to the application
    public static boolean registerUser(String nickname, String username, char[] password, char[] confirmPassword) {
        boolean isRegistrationSuccessful = false;
        String registrationStatus = "";

        String passwordString = String.valueOf(password);
        String confirmPasswordString = String.valueOf(confirmPassword);

        boolean isRegistrationFieldsFilled = UserValidation.validateRegistration(nickname, username, passwordString, confirmPasswordString);

        // Validation for fields filled
        if (isRegistrationFieldsFilled) {
            registrationStatus = UserServiceClient.register(nickname, username, passwordString, confirmPasswordString);

            if (registrationStatus.equals("success")) {
                showSuccess("You have been successfully registered!");
                isRegistrationSuccessful = true;
            } else {
                showError(registrationStatus);
            }

        } else {
            showError("Fields cannot be left empty! Please try again.");
        }

        return isRegistrationSuccessful;
    }

    // Method to log a user into the application
    public static boolean loginUser(String username, char[] password) {
        boolean isLoginSuccessful = false;
        String passwordString = String.valueOf(password);

        boolean isLoginFieldsFilled = UserValidation.validateLogin(username, passwordString);

        // Validation for fields filled
        if (isLoginFieldsFilled) {
            String loginStatus = UserServiceClient.login(username, passwordString);
            String[] statusArr = loginStatus.split("&");
            if (statusArr[0].equals("success")) {
                currUser = new User();
                currUser.setLoginId(username);
                currUser.setPassword(password);
                currUser.setNickname(statusArr[1]);
                User.setCurrUser(currUser);
                showSuccess("Welcome, " + currUser.getNickname());

                isLoginSuccessful = true;
            } else {
                showError(statusArr[0]);
            }
        }
        else {
            showError("Fields cannot be left empty! Please try again.");
        }

        return isLoginSuccessful;

    }

    // Method to display a JOptionPane to display error messages
    public static void showError(String errorMessage) {
        new JOptionPane().showMessageDialog(null, errorMessage, "Error!", JOptionPane.ERROR_MESSAGE);
    }

    // Method to display a JOptionPane to display success messages
    public static void showSuccess(String successMessage) {
        new JOptionPane().showMessageDialog(null, successMessage, "Success!", JOptionPane.INFORMATION_MESSAGE);
    }
}
