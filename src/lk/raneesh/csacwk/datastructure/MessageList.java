/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.raneesh.csacwk.datastructure;


/**
 *
 * @author Raneesh Gomez
 */
public class MessageList {  
    
    private int threadId;
    private static String threadTitle;
    private int messageId;
    private String messageBody;
    private String messageAuthor;
    private String messageDate;

    public MessageList(int threadId, int messageId, String messageBody, String messageAuthor, String messageDate) {
        this.threadId = threadId;        
        this.messageId = messageId;
        this.messageBody = messageBody;
        this.messageAuthor = messageAuthor;
        this.messageDate = messageDate;
    }  
    
    /**
     * @return the threadTitle
     */
    public static String getThreadTitle() {
        return threadTitle;
    }

    /**
     * @param aThreadTitle the threadTitle to set
     */
    public static void setThreadTitle(String aThreadTitle) {
        threadTitle = aThreadTitle;
    }

    /**
     * @return the messageBody
     */
    public String getMessageBody() {
        return messageBody;
    }

    /**
     * @param messageBody the messageBody to set
     */
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    /**
     * @return the messageAuthor
     */
    public String getMessageAuthor() {
        return messageAuthor;
    }

    /**
     * @param messageAuthor the messageAuthor to set
     */
    public void setMessageAuthor(String messageAuthor) {
        this.messageAuthor = messageAuthor;
    }

    /**
     * @return the messageDate
     */
    public String getMessageDate() {
        return messageDate;
    }

    /**
     * @param messageDate the messageDate to set
     */
    public void setMessageDate(String messageDate) {
        this.messageDate = messageDate;
    }

    /**
     * @return the messageId
     */
    public int getMessageId() {
        return messageId;
    }

    /**
     * @param messageId the messageId to set
     */
    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    /**
     * @return the threadId
     */
    public int getThreadId() {
        return threadId;
    }

    /**
     * @param threadId the threadId to set
     */
    public void setThreadId(int threadId) {
        this.threadId = threadId;
    }
    
}
