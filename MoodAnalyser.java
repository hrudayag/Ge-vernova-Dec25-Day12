public class MoodAnalyser {
    private String message;
    public MoodAnalyser() {
    }
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("Sad")) {
            return "SAD";
        }
        return "HAPPY";
    }

    public static void main(String[] args) {
        MoodAnalyser sadMood = new MoodAnalyser("I am in Sad Mood");
        System.out.println(sadMood.analyseMood());

        MoodAnalyser happyMood = new MoodAnalyser("I am in Happy Mood");
        System.out.println(happyMood.analyseMood());
    }
}
