package io.nology.triviaapi.game;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    // add game info from front-end
    @PostMapping
    public Game createGame(@RequestBody GameDTO gameDTO) {
        return gameService.createGame(gameDTO.userAnswers, gameDTO.score, gameDTO.correctAnswers);
    }

    @GetMapping
    // get all games
    public List<GameDTO> getAllGames() {
        return gameService.getAllGames();
    }

    @GetMapping("/{id}")
    public GameDTO getGameById(@RequestParam(value = "id") Long id) {
        return gameService.getGameById(id);
    }

    @PutMapping("/{id}")
    public void updateGame(@RequestParam(value = "id") Long id, @RequestBody List<String> userAnswers,
            @RequestBody int score) {
        gameService.updateGame(id, userAnswers, score);
    }

    @DeleteMapping("/{id}")
    public void deleteGame(Long id) {
        gameService.deleteGame(id);
    }

    // have a filter to get all entries have correct = "false"

    // Get trivias from db

    // add correct answers in an array

    //
}
