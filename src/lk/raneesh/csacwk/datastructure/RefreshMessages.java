/**
 * File Name: RefreshMessages.java
 */

package lk.raneesh.csacwk.datastructure;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import lk.raneesh.csacwk.controllers.ChatController;
import lk.raneesh.csacwk.gui.EditMessagesJFrame;

public class RefreshMessages implements Runnable {    

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        ChatController.retrieveThreadSpecificMessages(EditMessagesJFrame.getThreadId());
                    }
                });
                Thread.sleep(900);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(RefreshMessages.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
