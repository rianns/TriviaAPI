package io.nology.triviaapi.trivia;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TriviaDTO {

    private String difficulty;
    private String category;
    private String question;
    @JsonProperty("correct_answer")
    private String correct_answer;
    @JsonProperty("incorrect_answers")
    private List<String> incorrect_answers;

    public TriviaDTO() {
    }

    public TriviaDTO(String difficulty, String category, String question, String correct_answer,
            List<String> incorrect_answers) {
        this.difficulty = difficulty;
        this.category = category;
        this.question = question;
        this.correct_answer = correct_answer;
        this.incorrect_answers = incorrect_answers;
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
        return correct_answer;
    }

    public void setCorrectAnswer(String correct_answer) {
        this.correct_answer = correct_answer;
    }

    public List<String> getIncorrectAnswers() {
        return incorrect_answers;
    }

    public void setIncorrectAnswers(List<String> incorrect_answers) {
        this.incorrect_answers = incorrect_answers;
    }

    @Override
    public String toString() {
        return "TriviaDTO{" +
                "category='" + category + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", question='" + question + '\'' +
                ", correct_answer='" + correct_answer + '\'' +
                ", incorrect_answers=" + incorrect_answers +
                '}';
    }
}
