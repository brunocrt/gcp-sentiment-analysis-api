package me.brunocrt.gcp.nlp;

public class Analysis {

    private String score;
    private String magnitude;
    private String language;

    public Analysis(String language, Float score, Float magnitude) {
        this.score = String.valueOf(score);
        this.magnitude = String.valueOf(magnitude);
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getScore() {
        return this.score;
    }

    public String getMagnitude() {
        return this.magnitude;
    }
}