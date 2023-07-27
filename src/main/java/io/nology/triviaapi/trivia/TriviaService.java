package io.nology.triviaapi.trivia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TriviaService {

    private static final String OPEN_TRIVIA_DB_URL = "https://opentdb.com/api.php";

    @Autowired
    private TriviaRepository repository;

    // add new trivia game data
    public Trivia addTrivia(TriviaDTO data) {

        String difficulty = data.getDifficulty().trim();
        Integer numberOfTrivias = data.getNumberOfTrivias();

        Trivia newTrivia = new Trivia();

        newTrivia.setDifficulty(difficulty);
        newTrivia.setNumberOfTrivias(numberOfTrivias);


        return repository.save(newTrivia);
    }

    // get all trivias

    // get trivia game by id

    // update trivia game

    // delete trivia game
}
