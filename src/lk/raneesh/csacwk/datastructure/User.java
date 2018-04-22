/**
 * File Name: User.java
 */

package lk.raneesh.csacwk.datastructure;

public class User {

    private static User currUser;
    
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
        this.loginId = loginId;

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
        this.nickname = nickname;

    }

    /**
     * @return the currUser
     */
    public static User getCurrUser() {
        return currUser;
    }

    /**
     * @param aCurrUser the currUser to set
     */
    public static void setCurrUser(User aCurrUser) {
        currUser = aCurrUser;
    }
}
