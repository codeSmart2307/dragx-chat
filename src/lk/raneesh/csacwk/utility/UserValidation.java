/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.raneesh.csacwk.utility;

/**
 *
 * @author Raneesh Gomez
 */
public class UserValidation {
    
    public static boolean validateRegistration(String nickname, String username, String password, String confirmPassword) {
        boolean isRegistrationFieldsFilled = false;
        
        if (!nickname.equals("") && !nickname.equals("Enter Nickname...") && !username.equals("") && !username.equals("Enter A Login ID...") && !password.equals("") && !password.equals("Enter A Password...") && !confirmPassword.equals("") && !confirmPassword.equals("Confirm Password...")) {
            isRegistrationFieldsFilled = true;
        }
        else {
            isRegistrationFieldsFilled = false;
        }
        
        return false;
    }
    
    public static boolean validateLogin(String username, String password) {
        boolean isLoginFieldsFilled = false;
        
        if (!username.equals("") && !username.equals("Enter Login ID...") && !password.equals("") && !password.equals("Enter Password...")) {
            isLoginFieldsFilled = true;
        }
        else {
            isLoginFieldsFilled = false;
        }
        
        return isLoginFieldsFilled;
    }
    
}
