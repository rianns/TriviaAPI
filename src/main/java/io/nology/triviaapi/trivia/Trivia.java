package io.nology.triviaapi.trivia;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "trivias")
public class Trivia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String difficulty;

    @Column
    private String category;

    @Column
    private String question;

    @Column
    private String correct_answer;

    @OneToMany(mappedBy = "trivia", cascade = CascadeType.ALL)
    private List<IncorrectAnswer> incorrect_answers;

    public Trivia() {
    }

    public Trivia(String difficulty, String category, String question, String correct_answer,
            List<IncorrectAnswer> incorrect_answers) {
        super();
        this.difficulty = difficulty;
        this.category = category;
        this.question = question;
        this.correct_answer = correct_answer;
        this.incorrect_answers = incorrect_answers;
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

    public List<IncorrectAnswer> getIncorrectAnswers() {
        return incorrect_answers;
    }

    public void setIncorrectAnswers(List<IncorrectAnswer> incorrect_answers) {
        this.incorrect_answers = incorrect_answers;
    }
}
