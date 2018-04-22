/**
 * File Name: ChatValidation.java
 */

package lk.raneesh.csacwk.utility;

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
