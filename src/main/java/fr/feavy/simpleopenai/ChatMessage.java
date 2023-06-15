package fr.feavy.simpleopenai;

import org.json.JSONObject;

public class ChatMessage {
    public static enum Role {
        USER,
        ASSISTANT
    }

    public String role;
    public String content;

    public ChatMessage(String role, String content) {
        this.role = role;
        this.content = content;
    }

    public ChatMessage(Role role, String content) {
        this(role.toString().toLowerCase(), content);
    }

    public JSONObject toJsonObject() {
        JSONObject obj = new JSONObject();
        obj.put("role", this.role);
        obj.put("content", this.content);
        return obj;
    }
}
