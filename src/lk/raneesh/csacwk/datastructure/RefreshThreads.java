/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.raneesh.csacwk.datastructure;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import lk.raneesh.csacwk.controllers.ChatController;

/**
 *
 * @author Raneesh Gomez
 */
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
