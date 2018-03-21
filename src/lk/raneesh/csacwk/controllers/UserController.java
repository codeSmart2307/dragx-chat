/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.raneesh.csacwk.controllers;

import javax.swing.JOptionPane;
import lk.raneesh.csacwk.datastructure.User;
import lk.raneesh.csacwk.webserviceclient.UserServiceClient;

/**
 *
 * @author Raneesh Gomez
 */
public class UserController {
 
    public static void registerUser(String nickname, String username, char[] password, char[] confirmPassword) {
        String passwordString = String.valueOf(password);
        String confirmPasswordString = String.valueOf(confirmPassword);
        
        boolean isRegistrationValid = UserServiceClient.register(nickname, username, passwordString, confirmPasswordString);
        
        if (isRegistrationValid) {
            User newUser = new User();
            newUser.setNickname(nickname);
            newUser.setLoginId(username);
            newUser.setPassword(password);
           
            showSuccess("You have been successfully registered!");
        }
        else {
            showError("Registration failed!");
        }
    }
    
    public static void loginUser(String username, char[] password) {
        
    }
    
    public static void showError(String errorMessage) {
        new JOptionPane().showMessageDialog(null, errorMessage, "Error!", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void showSuccess(String successMessage) {
        new JOptionPane().showMessageDialog(null, successMessage, "Success!", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
