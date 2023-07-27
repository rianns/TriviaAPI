package io.nology.triviaapi.trivia;

public class TriviaDTO {

    String difficulty;

    Integer numberOfTrivias;

    public TriviaDTO() {
    }

    public TriviaDTO(String difficulty, Integer numOfTrivias) {
        super();
        this.difficulty = difficulty;
        this.numberOfTrivias = numOfTrivias;
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

    public void setNumberOfTrivias(Integer numOfTrivias) {
        this.numberOfTrivias = numOfTrivias;
    }
}
