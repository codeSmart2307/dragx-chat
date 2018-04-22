/**
 * File Name: UserValidation.java
 */

package lk.raneesh.csacwk.utility;

public class UserValidation {
    
    public static boolean validateRegistration(String nickname, String username, String password, String confirmPassword) {
        boolean isRegistrationFieldsFilled = false;
        
        // If the fields are not empty or do not contain the placeholder text
        if (!nickname.equals("") && !nickname.equals("Enter Nickname...") && !username.equals("") && !username.equals("Enter A Login ID...") && !password.equals("") && !password.equals("Enter A Password...") && !confirmPassword.equals("") && !confirmPassword.equals("Confirm Password...")) {
            isRegistrationFieldsFilled = true;
        }
        else {
            isRegistrationFieldsFilled = false;
        }        
        return isRegistrationFieldsFilled;
    }
    
    public static boolean validateLogin(String username, String password) {
        boolean isLoginFieldsFilled = false;
        
        // If the fields are not empty or do not contain the placeholder text
        if (!username.equals("") && !username.equals("Enter Login ID...") && !password.equals("") && !password.equals("Enter Password...")) {
            isLoginFieldsFilled = true;
        }
        else {
            isLoginFieldsFilled = false;
        }        
        return isLoginFieldsFilled;
    }    
}
