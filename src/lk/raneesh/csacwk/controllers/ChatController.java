/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.raneesh.csacwk.controllers;

import java.util.ArrayList;
import java.util.List;
import static lk.raneesh.csacwk.controllers.UserController.showError;
import static lk.raneesh.csacwk.controllers.UserController.showSuccess;
import lk.raneesh.csacwk.datastructure.MessageList;
import lk.raneesh.csacwk.datastructure.ThreadList;
import lk.raneesh.csacwk.datastructure.User;
import lk.raneesh.csacwk.gui.EditMessagesJFrame;
import lk.raneesh.csacwk.gui.SelectThreadJFrame;
import lk.raneesh.csacwk.utility.ChatValidation;
import lk.raneesh.csacwk.webservice.chatservice.ChatMessage;
import lk.raneesh.csacwk.webservice.chatservice.ChatThread;
import lk.raneesh.csacwk.webserviceclient.ChatServiceClient;

/**
 *
 * @author Raneesh Gomez
 */
public class ChatController {

    public static ArrayList<String> createNewThread(String threadTitle) {

        ArrayList<String> newThreadList = new ArrayList<>();

        String threadCreator = User.getCurrUser().getNickname();
        boolean isThreadTitleValid = ChatValidation.validateThreadTitle(threadTitle);


        if (isThreadTitleValid) {
            ChatThread newThread = ChatServiceClient.addThread(threadTitle, threadCreator);
            if (newThread != null) {
                newThreadList.add(0, String.valueOf(newThread.getThreadId()));
                newThreadList.add(1, newThread.getThreadTitle());
                newThreadList.add(2, newThread.getThreadCreator());
                newThreadList.add(3, newThread.getThreadDateTime());
            }
            else {
                showError("Error in retrieving new thread!");
            }

        } else {
            showError("Fields cannot be left empty! Please try again.");
        }

        return newThreadList;
    }    

    public static ArrayList<ThreadList> retrieveAllThreads() {     
        ArrayList<ThreadList> currentThreadsList = new ArrayList<>();
        List<ChatThread> retrievedThreads = ChatServiceClient.retrieveAllThreads();
        
        if (retrievedThreads != null) {
            SelectThreadJFrame.threadListModel.removeAllElements();
            for (int i = 0; i < retrievedThreads.size(); i++) {
                SelectThreadJFrame.threadListModel.addElement(new ThreadList(retrievedThreads.get(i).getThreadId(), retrievedThreads.get(i).getThreadTitle(), retrievedThreads.get(i).getThreadCreator(), "Last Edited: " + retrievedThreads.get(i).getThreadDateTime()));
                
                // Kept in case auto refresh does not work and is required for refresh button
                currentThreadsList.add(new ThreadList(retrievedThreads.get(i).getThreadId(), retrievedThreads.get(i).getThreadTitle(), retrievedThreads.get(i).getThreadCreator(), retrievedThreads.get(i).getThreadDateTime()));
            }
        } 
        else {
            showSuccess("No threads yet!");
        }
        
        return currentThreadsList;
    }
    
    public static String getThreadTitle(int threadId) {
        String threadTitle = ChatServiceClient.retrieveThreadTitle(threadId);       
        
        return threadTitle;
    }
    
    public static ArrayList<MessageList> retrieveThreadSpecificMessages(int threadId) {   
        ArrayList<MessageList> currentMessagesList = new ArrayList<>();
        List<ChatMessage> retrievedMessages = ChatServiceClient.retrieveAllMessages(threadId);       
        
        if (retrievedMessages != null) {
            EditMessagesJFrame.messageListModel.removeAllElements();
            for (int i = 0; i < retrievedMessages.size(); i++) {
                EditMessagesJFrame.messageListModel.addElement(new MessageList(retrievedMessages.get(i).getThreadId(), retrievedMessages.get(i).getMessageId(), retrievedMessages.get(i).getMessageBody(), retrievedMessages.get(i).getMessageAuthor(), retrievedMessages.get(i).getMessageDateTime()));
                
                // Kept in case auto refresh does not work and is required for refresh button
                currentMessagesList.add(new MessageList(retrievedMessages.get(i).getThreadId(), retrievedMessages.get(i).getMessageId(), retrievedMessages.get(i).getMessageBody(), retrievedMessages.get(i).getMessageAuthor(), retrievedMessages.get(i).getMessageDateTime()));
            }
        } 
        else {
            showSuccess("No messages yet!");
        }
        
        return currentMessagesList;       
    }
    
    public static ArrayList<String> createNewMessage(int threadId, String messageBody) {
        ArrayList<String> newMessageList = new ArrayList<>();

        String messageAuthor = User.getCurrUser().getNickname();
        boolean isMessageBodyValid = ChatValidation.validateMessageBody(messageBody);
        
        if (isMessageBodyValid) {
            ChatMessage newMessage = ChatServiceClient.addMessage(threadId, messageBody, messageAuthor);
            if (newMessage != null) {
                newMessageList.add(0, String.valueOf(newMessage.getThreadId()));
                newMessageList.add(1, String.valueOf(newMessage.getMessageId()));
                newMessageList.add(2, newMessage.getMessageBody());
                newMessageList.add(3, newMessage.getMessageAuthor());
                newMessageList.add(4, newMessage.getMessageDateTime());
            }
            else {
                showError("Error in retrieving new message!");
            }

        } else {
            showError("Fields cannot be left empty! Please try again.");
        }
        
        return newMessageList;
    }

}
