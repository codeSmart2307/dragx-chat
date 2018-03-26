/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.raneesh.csacwk.controllers;

import java.util.ArrayList;
import java.util.List;
import static lk.raneesh.csacwk.controllers.UserController.showError;
import lk.raneesh.csacwk.datastructure.MessageList;
import lk.raneesh.csacwk.datastructure.ThreadList;
import lk.raneesh.csacwk.datastructure.User;
import lk.raneesh.csacwk.utility.ChatValidation;
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
                newThreadList.add(0, newThread.getThreadTitle());
                newThreadList.add(1, newThread.getThreadCreator());
                newThreadList.add(2, newThread.getThreadDateTime());
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
            for (int i = 0; i < retrievedThreads.size(); i++) {
                currentThreadsList.add(new ThreadList(retrievedThreads.get(i).getThreadTitle(), retrievedThreads.get(i).getThreadCreator(), retrievedThreads.get(i).getThreadDateTime()));
            }
        }
               
        return currentThreadsList;
    }
    
    public static ArrayList<MessageList> retrieveThreadSpecificMessages() {
        ArrayList<MessageList> currentMessagesList = new ArrayList<>();
        
        
        
        return currentMessagesList;
    }

}
