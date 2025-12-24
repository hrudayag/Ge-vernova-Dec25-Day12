public class MoodAnalyser{
    public String analyseMood(String message) {
        if (message.contains("Sad")) {
            return "SAD";
        }
        return "HAPPY";
    }
    public static void main(String[] args) {
        MoodAnalyser analyser = new MoodAnalyser();
        System.out.println(analyser.analyseMood("I am in Sad Mood"));
        System.out.println(analyser.analyseMood("I am in Any Mood"));
    }
}
