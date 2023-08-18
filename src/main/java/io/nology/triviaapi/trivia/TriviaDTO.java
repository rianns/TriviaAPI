package io.nology.triviaapi.trivia;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TriviaDTO {

    private String difficulty;
    private String category;
    private String question;
    @JsonProperty("correct_answer")
    private String correctAnswer;
    @JsonProperty("incorrect_answers")
    private List<String> incorrectAnswers;

    public TriviaDTO() {
    }

    public TriviaDTO(String difficulty, String category, String question, String correctAnswer,
            List<String> incorrectAnswers) {
        this.difficulty = difficulty;
        this.category = category;
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.incorrectAnswers = incorrectAnswers;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public List<String> getIncorrectAnswers() {
        return incorrectAnswers;
    }

    public void setIncorrectAnswers(List<String> incorrectAnswers) {
        this.incorrectAnswers = incorrectAnswers;
    }

    @Override
    public String toString() {
        return "TriviaDTO{" +
                "category='" + category + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", question='" + question + '\'' +
                ", correct_answer='" + correctAnswer + '\'' +
                ", incorrect_answers=" + incorrectAnswers +
                '}';
    }
}
