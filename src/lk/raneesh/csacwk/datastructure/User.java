package lk.raneesh.csacwk.datastructure;

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
}
