public class MoodAnalyser {
    private String message;
    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.length() == 0) {
                throw new MoodAnalysisException(
                        MoodAnalysisException.ExceptionType.EMPTY_MOOD,
                        "Mood is Empty"
                );
            }

            if (message.contains("Sad")) {
                return "SAD";
            }
            return "HAPPY";

        } catch (NullPointerException e) {
            throw new MoodAnalysisException(
                    MoodAnalysisException.ExceptionType.NULL_MOOD,
                    "Mood is Null"
            );
        }
    }

    public static void main(String[] args) {
        try {
            MoodAnalyser analyser = new MoodAnalyser("");
            System.out.println(analyser.analyseMood());
        } catch (MoodAnalysisException e) {
            System.out.println(e.type + " : " + e.getMessage());
        }
    }
}