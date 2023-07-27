package io.nology.triviaapi.trivia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trivias")
public class Trivia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String difficulty;

    @Column
    Integer numberOfTrivias;

    @Column
    String[] questions;

    @Column
    String[] choices;

    @Column
    String[] correctAnswers;

    public Trivia() {
    }

    public Trivia(String difficulty, Integer numOfTrivias) {
        super();
        this.difficulty = difficulty;
        this.numberOfTrivias = numOfTrivias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getNumberOfTrivias() {
        return numberOfTrivias;
    }

    public void setNumberOfTrivias(Integer numberOfTrivias) {
        this.numberOfTrivias = numberOfTrivias;
    }

    public String[] getQuestions() {
        return questions;
    }

    public void setQuestions(String[] questions) {
        this.questions = questions;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    public String[] getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(String[] correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

}
