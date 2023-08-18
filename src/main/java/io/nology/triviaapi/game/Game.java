package io.nology.triviaapi.game;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// import io.nology.triviaapi.trivia.TriviaDTO;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    // user submitted answers
    // change from front-end to get an object with key-value pair (question id,
    // answer)

    // can probably make this another entity with user answers and if its failed
    @Column
    List<String> userAnswers;

    @Column
    int score;

    @Column
    Date date;

    @Column(length = 1000)
    List<String> correctAnswers;

    // TODO: #3 game history

    // TODO: #2 retry past game

    public Game() {
    }

    public Game(List<String> userAnswers, int score, Date date, List<String> correctAnswers) {
        super();
        this.userAnswers = userAnswers;
        this.score = score;
        this.date = date;
        this.correctAnswers = correctAnswers;
    }

    // public TriviaDTO getTrivia() {
    // return trivia;
    // }

    // public void setTrivia(TriviaDTO trivia) {
    // this.trivia = trivia;
    // }

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
}
