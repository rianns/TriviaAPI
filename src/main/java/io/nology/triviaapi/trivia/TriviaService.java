package io.nology.triviaapi.trivia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TriviaService {

    private static final String OPEN_TRIVIA_DB_URL = "https://opentdb.com/api.php";

    @Autowired
    private TriviaRepository triviaRepository;

    public List<Trivia> getTrivia(int amount, String difficulty) {

        String apiUrl = String.format("%s?amount=%d&difficulty=%s", OPEN_TRIVIA_DB_URL, amount, difficulty);

        RestTemplate restTemplate = new RestTemplate();
        TriviaListDTO triviaListDTO = restTemplate.getForObject(apiUrl, TriviaListDTO.class);

        if (triviaListDTO != null && triviaListDTO.getResults() != null) {
            List<Trivia> triviaList = new ArrayList<>();

            for (TriviaDTO triviaDTO : triviaListDTO.getResults()) {
                Trivia trivia = new Trivia();
                trivia.setQuestion(triviaDTO.getQuestion());
                trivia.setCorrectAnswer(triviaDTO.getCorrectAnswer());
                trivia.setIncorrectAnswers(triviaDTO.getIncorrectAnswers());

                triviaList.add(trivia);
            }

            return triviaRepository.saveAll(triviaList);
        }
        return Collections.emptyList();
    }

    // add new trivia game data to db
    public Trivia saveTrivia(Trivia trivia) {
        return triviaRepository.save(trivia);
    }

    // get all trivias

    // get trivia game by id

    // update trivia game

    // delete trivia game
}
