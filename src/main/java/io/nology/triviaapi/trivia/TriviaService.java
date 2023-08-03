package io.nology.triviaapi.trivia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TriviaService {

    private static final String OPEN_TRIVIA_DB_URL = "https://opentdb.com/api.php";

    private final TriviaRepository triviaRepository;
    private final RestTemplate restTemplate;

    public TriviaService(TriviaRepository triviaRepository, RestTemplate restTemplate) {
        this.triviaRepository = triviaRepository;
        this.restTemplate = restTemplate;
    }

    // get all trivias
    public List<Trivia> getTrivia() {
        return triviaRepository.findAll();
    }

    // add new trivia game data to db
    public List<Trivia> postTrivia(int amount, String difficulty) {

        String apiUrl = String.format("%s?amount=%d&difficulty=%s", OPEN_TRIVIA_DB_URL, amount, difficulty);

        TriviaListDTO triviaListDTO = restTemplate.getForObject(apiUrl, TriviaListDTO.class);

        if (triviaListDTO != null && triviaListDTO.getResults() != null) {
            List<Trivia> triviaList = new ArrayList<>();

            for (TriviaDTO triviaDTO : triviaListDTO.getResults()) {
                System.out.println("Trivia: " + triviaDTO);

                Trivia trivia = new Trivia();
                trivia.setQuestion(triviaDTO.getQuestion());
                trivia.setCategory(triviaDTO.getCategory());
                trivia.setDifficulty(triviaDTO.getDifficulty());
                trivia.setCorrectAnswer(triviaDTO.getCorrectAnswer());

                // set incorrect answers, one-to-many?
                trivia.setIncorrectAnswers(triviaDTO.getIncorrectAnswers());

                triviaList.add(trivia);
            }

            return triviaRepository.saveAll(triviaList);
        }
        return Collections.emptyList();
    }

    // get trivia game by id
    public Trivia getTriviaById(Long id) {
        Optional<Trivia> optTrivia = triviaRepository.findById(id);
        return optTrivia.orElse(null);
    }

    // delete trivia game
    public void deleteTrivia() {
        triviaRepository.deleteAll();
    }

    // update trivia game

}
