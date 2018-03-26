/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.raneesh.csacwk.webserviceclient;

import lk.raneesh.csacwk.webservice.chatservice.ChatThread;

/**
 *
 * @author Raneesh Gomez
 */
public class ChatServiceClient {   

    public static ChatThread addThread(java.lang.String threadTitle, java.lang.String threadCreator) {
        lk.raneesh.csacwk.webservice.chatservice.ChatService_Service service = new lk.raneesh.csacwk.webservice.chatservice.ChatService_Service();
        lk.raneesh.csacwk.webservice.chatservice.ChatService port = service.getChatServicePort();
        return port.addThread(threadTitle, threadCreator);
    }

    public static java.util.List<lk.raneesh.csacwk.webservice.chatservice.ChatThread> retrieveAllThreads() {
        lk.raneesh.csacwk.webservice.chatservice.ChatService_Service service = new lk.raneesh.csacwk.webservice.chatservice.ChatService_Service();
        lk.raneesh.csacwk.webservice.chatservice.ChatService port = service.getChatServicePort();
        return port.retrieveAllThreads();
    }    
}
