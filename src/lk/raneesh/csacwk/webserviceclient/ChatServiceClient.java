/**
 * File Name: ChatServiceClient.java
 */

package lk.raneesh.csacwk.webserviceclient;

import lk.raneesh.csacwk.webservice.chatservice.ChatMessage;
import lk.raneesh.csacwk.webservice.chatservice.ChatThread;

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

    public static java.util.List<lk.raneesh.csacwk.webservice.chatservice.ChatMessage> retrieveAllMessages(int threadId) {
        lk.raneesh.csacwk.webservice.chatservice.ChatService_Service service = new lk.raneesh.csacwk.webservice.chatservice.ChatService_Service();
        lk.raneesh.csacwk.webservice.chatservice.ChatService port = service.getChatServicePort();
        return port.retrieveAllMessages(threadId);
    }

    public static ChatMessage addMessage(int threadId, java.lang.String messageBody, java.lang.String messageAuthor) {
        lk.raneesh.csacwk.webservice.chatservice.ChatService_Service service = new lk.raneesh.csacwk.webservice.chatservice.ChatService_Service();
        lk.raneesh.csacwk.webservice.chatservice.ChatService port = service.getChatServicePort();
        return port.addMessage(threadId, messageBody, messageAuthor);
    }

    public static String retrieveThreadTitle(int threadId) {
        lk.raneesh.csacwk.webservice.chatservice.ChatService_Service service = new lk.raneesh.csacwk.webservice.chatservice.ChatService_Service();
        lk.raneesh.csacwk.webservice.chatservice.ChatService port = service.getChatServicePort();
        return port.retrieveThreadTitle(threadId);
    }   
}
