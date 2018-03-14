package lk.raneesh.csacwk.server;

/**
 *
 * @author 2016087
 */
        
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.raneesh.csacwk.datastructure.User;

public class LoginServer {
    
    private ArrayList<User> userLoginList = new ArrayList<>();  
    
    public void addUserToList(User user) {
        //userLoginList.add(user);
        try {
            String myDataPacket = user.getLoginId() + " | " + user.getPassword();
            Socket clientSocket = new Socket("192.168.50.121", 8290);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            out.println(myDataPacket);
            clientSocket.close();
        }
        catch(IOException e) {
            Logger.getLogger(LoginServer.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void displayList() {
        for (int i = 0; i < userLoginList.size(); i++) {
            System.out.println("Logged in User " + (i+1) + " => " + userLoginList.get(i));
        }        
    }
            
}
