package lk.raneesh.csacwk.datastructure;
import lk.raneesh.csacwk.utility.AuthValidation;

/**
 *
 * @author 2016087
 */
public class User {
    
    private String loginId;
    private char[] password;   
    private String nickname;

    /**
     * @return the username
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * @param username the username to set
     */
    public void setLoginId(String loginId) {
        boolean isLoginIdValid = AuthValidation.validateUsername(loginId);
        if (isLoginIdValid) {
            this.loginId = loginId;
            System.out.println("Username saved successfully!");
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
        System.out.println("Password saved successfully!");
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
        boolean isNicknameValid = AuthValidation.validateNickname(nickname);
        if (isNicknameValid) {
            this.nickname = nickname;
        }
        
    }   
     
}
