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
    
    private String messageTitle;
    private String messageAuthor;
    private String messageDate;

    public MessageList(String messageTitle, String messageAuthor, String messageDate) {
        this.messageTitle = messageTitle;
        this.messageAuthor = messageAuthor;
        this.messageDate = messageDate;
    }   

    /**
     * @return the messageTitle
     */
    public String getMessageTitle() {
        return messageTitle;
    }

    /**
     * @param messageTitle the messageTitle to set
     */
    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
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
    
    
    
}
