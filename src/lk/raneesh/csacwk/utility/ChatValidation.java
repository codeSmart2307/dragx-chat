/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.raneesh.csacwk.utility;

/**
 *
 * @author Raneesh Gomez
 */
public class ChatValidation {

    public static boolean validateThreadTitle(String threadTitle) {
        boolean isThreadTitleFieldFilled = false;

        if (threadTitle.length() <= 300) {
            if (!threadTitle.equals("") && !threadTitle.equals("Enter Thread Title Here...")) {
                isThreadTitleFieldFilled = true;
            } else {
                isThreadTitleFieldFilled = false;
            }
        }
        else {
            isThreadTitleFieldFilled = false;
        }

        return isThreadTitleFieldFilled;
    }
    
    public static boolean validateMessageBody(String messageBody) {
        boolean isMessageBodyFieldFilled = false;
        
        if (messageBody.length() <= 300) {
            if (!messageBody.equals("") && !messageBody.equals("Enter Message Here...")) {
                isMessageBodyFieldFilled = true;
            } else {
                isMessageBodyFieldFilled = false;
            }
        }
        else {
            isMessageBodyFieldFilled = false;
        }

        return isMessageBodyFieldFilled;
    }

}
