public class MoodAnalysisException extends Exception {
    public enum ExceptionType {
        NULL_MOOD,
        EMPTY_MOOD
    }
    public ExceptionType type;

    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
