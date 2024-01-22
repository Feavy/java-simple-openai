package fr.feavy.simpleopenai;

public class CompletionEngine {
    public static final CompletionEngine DAVINCI = new CompletionEngine("text-davinci-003", false, false);
    public static final CompletionEngine GPT4 = new CompletionEngine("gpt-4", true, false);
    public static final CompletionEngine GPT4_VISION = new CompletionEngine("gpt-4-vision-preview", true, true);
    
    public final String engineName;
    public final boolean isChatBot;
    public final boolean supportsImage;

    public CompletionEngine(String engineName, boolean isChatBot, boolean supportsImage) {
        this.engineName = engineName;
        this.isChatBot = isChatBot;
        this.supportsImage = supportsImage;
    }

    @Override
    public String toString() {
        return "CompletionEngine{" +
                "engineName='" + engineName + '\'' +
                ", isChatBot=" + isChatBot +
                ", supportsImage=" + supportsImage +
                '}';
    }
}
