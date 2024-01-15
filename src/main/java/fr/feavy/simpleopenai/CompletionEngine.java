package fr.feavy.simpleopenai;

public class CompletionEngine {
    public static final CompletionEngine DAVINCI = new CompletionEngine("text-davinci-003", false);
    public static final CompletionEngine GPT4 = new CompletionEngine("gpt-4", true);
    public static final CompletionEngine GPT4_VISION = new CompletionEngine("gpt-4-vision-preview", true);
    
    public final String engineName;
    public final boolean isChatBot;

   public CompletionEngine(String engineName, boolean isChatBot) {
        this.engineName = engineName;
        this.isChatBot = isChatBot;
    }

    @Override
    public String toString() {
        return "CompletionEngine{" +
                ", engineName='" + engineName + '\'' +
                ", isChatBot=" + isChatBot +
                '}';
    }
}
