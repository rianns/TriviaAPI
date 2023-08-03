package io.nology.triviaapi.game;

import java.util.Date;
import java.util.List;

import io.nology.triviaapi.trivia.TriviaDTO;

// all about the game
public class Game {
    Long id;

    // this calls the trivia API to get trivia
    // TriviaDTO trivia;
    private TriviaDTO trivia;

    // user submitted answers
    // change from front-end to get an object with key-value pair (question id,
    // answer)
    private List<String> userAnswers;

    // user score
    private int score;

    // date played
    private Date date;

    // correct answers
    private List<String> correctAnswers;

    // if a question was failed or not
    private boolean failed;

    // TODO: #3 game history

    // TODO: #2 retry past game

    public Game() {
    }

    public Game(int score, Date date, List<String> correctAnswers, boolean failed) {
        super();
        this.score = score;
        this.date = date;
        this.correctAnswers = correctAnswers;
        this.failed = failed;
    }

    public TriviaDTO getTrivia() {
        return trivia;
    }

    public void setTrivia(TriviaDTO trivia) {
        this.trivia = trivia;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(List<String> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public boolean isFailed() {
        return failed;
    }

    public void setFailed(boolean failed) {
        this.failed = failed;
    }
}
