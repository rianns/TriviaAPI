package io.nology.triviaapi.trivia;

import java.util.List;

public class TriviaListDTO {
    private List<TriviaDTO> results;

    public TriviaListDTO() {
    }

    public TriviaListDTO(List<TriviaDTO> results) {
        this.results = results;
    }

    public List<TriviaDTO> getResults() {
        return results;
    }

    public void setResults(List<TriviaDTO> results) {
        this.results = results;
    }

}
