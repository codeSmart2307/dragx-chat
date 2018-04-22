/**
 * File Name: RefreshThreads.java
 */

package lk.raneesh.csacwk.datastructure;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import lk.raneesh.csacwk.controllers.ChatController;

public class RefreshThreads implements Runnable {    

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {

                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        ChatController.retrieveAllThreads();
                    }
                });
                Thread.sleep(900);

            }
        } catch (InterruptedException ex) {
            Logger.getLogger(RefreshThreads.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
