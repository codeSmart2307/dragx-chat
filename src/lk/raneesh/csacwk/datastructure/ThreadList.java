/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.raneesh.csacwk.datastructure;

import java.util.ArrayList;

/**
 *
 * @author Raneesh Gomez
 */
public class ThreadList {
    
    private int threadId;
    private String threadTitle;
    private String threadCreator;
    private String threadDate;    

    public ThreadList(int threadId, String threadTitle, String threadCreator, String threadDate) {
        this.threadId = threadId;
        this.threadTitle = threadTitle;
        this.threadCreator = threadCreator;
        this.threadDate = threadDate;
    }   

    /**
     * @return the threadTitle
     */
    public String getThreadTitle() {
        return threadTitle;
    }

    /**
     * @param threadTitle the threadTitle to set
     */
    public void setThreadTitle(String threadTitle) {
        this.threadTitle = threadTitle;
    }

    /**
     * @return the threadCreator
     */
    public String getThreadCreator() {
        return threadCreator;
    }

    /**
     * @param threadCreator the threadCreator to set
     */
    public void setThreadCreator(String threadCreator) {
        this.threadCreator = threadCreator;
    }

    /**
     * @return the threadDate
     */
    public String getThreadDate() {
        return threadDate;
    }

    /**
     * @param threadDate the threadDate to set
     */
    public void setThreadDate(String threadDate) {
        this.threadDate = threadDate;
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
    
    @Override
    public String toString() {
        return String.valueOf(getThreadId());
    }
    
}
