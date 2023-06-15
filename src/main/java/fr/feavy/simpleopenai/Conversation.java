package fr.feavy.simpleopenai;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Conversation {
    protected final List<ChatMessage> conversation = new ArrayList<>();

    public Conversation() {
    }

    public List<ChatMessage> getMessages() {
        return conversation;
    }

    public void addMessage(ChatMessage message) {
        conversation.add(message);
    }

    public void addMessage(int index, ChatMessage message) {
        conversation.add(index, message);
    }

    public JSONArray toJson() {
        return new JSONArray(this.getMessages().stream().map(ChatMessage::toJsonObject).collect(Collectors.toList()));
    }

    @Override
    public String toString() {
        return String.join("\n\n", conversation.stream().map(it -> it.content).toList()) + "\n\n";
    }
}
