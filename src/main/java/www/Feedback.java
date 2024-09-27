package www;

public class Feedback {
    private String feedback;
    private String source;

    public Feedback() {}

    public Feedback(String feedback, String source) {
        this.feedback = feedback;
        this.source = source;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}