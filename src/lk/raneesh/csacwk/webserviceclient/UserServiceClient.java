/**
 * File Name: ChatServiceClient.java
 */

package lk.raneesh.csacwk.webserviceclient;

public class UserServiceClient {

    public static String login(java.lang.String username, java.lang.String password) {
        lk.raneesh.csacwk.webservice.userservice.UserService_Service service = new lk.raneesh.csacwk.webservice.userservice.UserService_Service();
        lk.raneesh.csacwk.webservice.userservice.UserService port = service.getUserServicePort();
        return port.login(username, password);
    }

    public static String register(java.lang.String nickname, java.lang.String username, java.lang.String password, java.lang.String confirmPassword) {
        lk.raneesh.csacwk.webservice.userservice.UserService_Service service = new lk.raneesh.csacwk.webservice.userservice.UserService_Service();
        lk.raneesh.csacwk.webservice.userservice.UserService port = service.getUserServicePort();
        return port.register(nickname, username, password, confirmPassword);
    }   
}
