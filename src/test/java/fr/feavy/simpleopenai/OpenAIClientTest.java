package fr.feavy.simpleopenai;

import org.junit.jupiter.api.Test;

import java.util.List;

class OpenAIClientTest {

    private static String API_KEY = System.getenv("OPENAI_API_KEY");

    @Test
    void complete() {
        CompletionEngine engine = CompletionEngine.GPT4_VISION;

        OpenAIClient client = new OpenAIClient(API_KEY);
        ChatMessage message = new ChatMessage(ChatMessage.Role.USER, "Qu'est-il représenté sur cette photo ?", List.of("https://cdn.discordapp.com/attachments/883747434164006933/1196476260336025720/image.png"));
        Conversation conversation = new Conversation();
        conversation.addMessage(message);
        String completion = client.complete(conversation, engine).join();
        System.out.println(completion);
    }
}