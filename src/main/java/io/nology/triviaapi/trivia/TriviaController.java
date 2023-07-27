package io.nology.triviaapi.trivia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trivias")
public class TriviaController {

    @Autowired
    private TriviaService triviaService;

    // GET
    @GetMapping
    public List<Trivia> getTrivia(@RequestParam int amount, @RequestParam String difficulty) {
        return triviaService.getTrivia(amount, difficulty);
    }

    // POST

    // DELETE

    // PUT
}
