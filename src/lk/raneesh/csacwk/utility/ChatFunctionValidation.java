/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.raneesh.csacwk.utility;

import javax.swing.JOptionPane;

/**
 *
 * @author Raneesh Gomez
 */
public class ChatFunctionValidation {

    public static boolean validateEmptyString(String string) {
        boolean isStringEmpty = true;

        if (!string.equals("")) {
            if (!string.equals("Enter Message Here...")) {
                if (!string.equals("Enter Thread Title Here...")) {
                    isStringEmpty = false;
                    System.out.println("boob");
                } else {
                    showError("Input is Empty! Please enter a valid input.");
                }
            } else {
                showError("Input is Empty! Please enter a valid input.");
            }
        } else {
            showError("Input is Empty! Please enter a valid input.");
        }

        return isStringEmpty;
    }

    public static void showError(String errorMessage) {
        new JOptionPane().showMessageDialog(null, errorMessage, "Error!", JOptionPane.ERROR_MESSAGE);
    }
}
