package io.nology.triviaapi.game;

import java.util.List;

public class GameDTO {
    List<String> userAnswers;
    int score;
    List<String> correctAnswers;

    public GameDTO() {
    }

    public GameDTO(List<String> userAnswers, int score, List<String> correctAnswers) {
        this.userAnswers = userAnswers;
        this.score = score;
        this.correctAnswers = correctAnswers;
    }

    public List<String> getUserAnswers() {
        return userAnswers;
    }

    public void setUserAnswers(List<String> userAnswers) {
        this.userAnswers = userAnswers;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(List<String> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }
}
