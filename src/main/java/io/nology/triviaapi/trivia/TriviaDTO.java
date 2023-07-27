package io.nology.triviaapi.trivia;

import java.util.List;

public class TriviaDTO {

    private String difficulty;
    private String category;
    private String question;
    private String correct_answer;
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

    public String getcategory() {
        return category;
    }

    public void setcategory(String category) {
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
}
