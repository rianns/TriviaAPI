package io.nology.triviaapi.game;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    // add game from front-end and call postTrivia
    public Game createGame(List<String> userAnswers, int score, List<String> correctAnswers) {
        Game newGame = new Game();
        newGame.setUserAnswers(userAnswers);
        newGame.setScore(score);
        newGame.setCorrectAnswers(correctAnswers);
        newGame.setDate(new Date());
        return gameRepository.save(newGame);
    }

    // get all games
    public List<GameDTO> getAllGames() {
        List<Game> games = gameRepository.findAll();
        List<GameDTO> gameDto = new ArrayList<>();

        for (Game game : games) {
            gameDto.add(getGameDTO(game));
        }
        return gameDto;
    }

    // get game by id
    public GameDTO getGameById(Long id) {
        Game game = gameRepository.findById(id).orElse(null);
        if (game == null) {
            return null;
        }
        return getGameDTO(game);
    }

    // update game
    public void updateGame(Long id, List<String> userAnswers, int score) {
        Game game = gameRepository.findById(id).orElse(null);
        if (game == null) {
            return;
        }

        game.setUserAnswers(new ArrayList<>(userAnswers));
        game.setScore(score);
        gameRepository.save(game);
    }

    // delete game
    public void deleteGame(Long id) {
        gameRepository.deleteById(id);
    }

    // get game DTO
    private GameDTO getGameDTO(Game game) {
        if (game == null) {
            return null;
        }
        return new GameDTO(
                game.getUserAnswers(),
                game.getScore(),
                game.getCorrectAnswers());
    }
}
