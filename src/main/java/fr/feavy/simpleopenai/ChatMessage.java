package fr.feavy.simpleopenai;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;
import java.util.Map;

public class ChatMessage {
    public static enum Role {
        USER,
        SYSTEM,
        ASSISTANT
    }

    public final String role;
    public final String content;
    public final List<String> imageUrls;

    public ChatMessage(String role, String content) {
        this(role, content, List.of());
    }

    public ChatMessage(Role role, String content) {
        this(role.toString().toLowerCase(), content, List.of());
    }

    public ChatMessage(Role role, String content, List<String> imageUrls) {
        this(role.toString().toLowerCase(), content, imageUrls);
    }

    public ChatMessage(String role, String content, List<String> imageUrls) {
        this.role = role;
        this.content = content;
        this.imageUrls = imageUrls;
    }

    public JSONObject toJsonObject() {
        return toJsonObject(true);
    }

    public JSONObject toJsonObject(boolean includeImages) {
        JSONArray content = new JSONArray();

        content.put(new JSONObject(Map.of("type", "text", "text", this.content)));
        if(includeImages) {
            for (String imageUrl : this.imageUrls) {
                content.put(new JSONObject(Map.of(
                        "type", "image_url",
                        "image_url", Map.of("url", imageUrl)
                )));
            }
        }

        return new JSONObject(Map.of(
                "role", this.role,
                "content", content
        ));
    }
}
