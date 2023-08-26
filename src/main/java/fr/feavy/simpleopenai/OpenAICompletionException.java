package fr.feavy.simpleopenai;

import org.json.JSONObject;

public class OpenAICompletionException extends RuntimeException {
    private final JSONObject openAIErrorPayload;

    public OpenAICompletionException(JSONObject openAIErrorPayload) {
        super(openAIErrorPayload.getString("message"));
        this.openAIErrorPayload = openAIErrorPayload;
    }

    public JSONObject getPayload() {
        return openAIErrorPayload;
    }

    public String getType() {
        return openAIErrorPayload.getString("type");
    }

    public String getParam() {
        return openAIErrorPayload.getString("param");
    }

    public String getCode() {
        return openAIErrorPayload.getString("code");
    }
}
