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
    
    private static User currUser;
    
    public static boolean registerUser(String nickname, String username, char[] password, char[] confirmPassword) {
        boolean isRegistrationSuccessful = false;
        
        String passwordString = String.valueOf(password);
        String confirmPasswordString = String.valueOf(confirmPassword);
        
        String registrationStatus = UserServiceClient.register(nickname, username, passwordString, confirmPasswordString);
        
        if (registrationStatus.equals("success")) {          
            showSuccess("You have been successfully registered!");           
            isRegistrationSuccessful = true;
        }
        else {
            showError(registrationStatus);
        }
        
        return isRegistrationSuccessful;
    }
    
    public static boolean loginUser(String username, char[] password) {
        boolean isLoginSuccessful = false;        
        String passwordString = String.valueOf(password);        
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
        }
        else {            
            showError(statusArr[0]);
        }
        
        return isLoginSuccessful;
        
    }
    
    public static void showError(String errorMessage) {
        new JOptionPane().showMessageDialog(null, errorMessage, "Error!", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void showSuccess(String successMessage) {
        new JOptionPane().showMessageDialog(null, successMessage, "Success!", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
