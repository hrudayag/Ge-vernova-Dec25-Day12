public class MoodAnalyser {
    private String message;
    public MoodAnalyser() {
    }
    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood() {
        try {
            if (message.contains("Sad")) {
                return "SAD";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
        }
        return "HAPPY";
    }

    public static void main(String[] args) {
        MoodAnalyser nullMood = new MoodAnalyser(null);
        System.out.println(nullMood.analyseMood());
    }
}
