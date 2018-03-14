package lk.raneesh.csacwk.utility;

import javax.swing.JOptionPane;

/**
 *
 * @author Raneesh Gomez
 */

public class UserValidation {
    
    public static boolean validateUsername(String username) {
        boolean isUsernameValid = false;
        
        if (username.length() < 30) {
            isUsernameValid = true;
        }
        return isUsernameValid;
    }
    
    public static boolean validateNickname(String nickname) {
        boolean isNicknameValid = false;
        
        if (nickname.length() < 20) {
            isNicknameValid = true;
        }
        return isNicknameValid;
    }
    
    public static void showError(String errorMessage) {
        new JOptionPane().showMessageDialog(null, errorMessage , "Registration Failure", JOptionPane.ERROR_MESSAGE); 
    }
    
}
