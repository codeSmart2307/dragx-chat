package lk.raneesh.csacwk.datastructure;

import javax.swing.JOptionPane;
import lk.raneesh.csacwk.utility.UserValidation;

/**
 *
 * @author 2016087
 */
public class User {
    
    private String username;
    private char[] password;   
    private String nickname;

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        boolean isUsernameValid = UserValidation.validateUsername(username);
        if (isUsernameValid) {
            this.username = username;
        }
        else {
            UserValidation.showError("Login ID is too long! Please keep it below 30 characters");
        }        
    }

    /**
     * @return the password
     */
    public char[] getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(char[] password) {
        this.password = password;
    }
    
    /**
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        boolean isNicknameValid = UserValidation.validateNickname(nickname);
        if (isNicknameValid) {
            this.nickname = nickname;
        }
        else {
            UserValidation.showError("Nickname is too long! Please keep it below 20 characters");
        }
    }   
     
}
