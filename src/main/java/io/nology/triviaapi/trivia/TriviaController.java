package io.nology.triviaapi.trivia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
    public ResponseEntity<List<Trivia>> getTrivias() {
        List<Trivia> trivias = triviaService.getTrivia();
        if (!trivias.isEmpty()) {
            return ResponseEntity.ok(trivias);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    // GET BY ID
    @GetMapping("/{id}")
    public ResponseEntity<Trivia> getTriviaById(@PathVariable Long id) {
        Trivia trivia = triviaService.getTriviaById(id);
        if (trivia != null) {
            return ResponseEntity.ok(trivia);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // POST
    @PostMapping
    public List<Trivia> postTrivia(@RequestParam int amount, @RequestParam String difficulty) {
        return triviaService.postTrivia(amount, difficulty);
    }

    // DELETE previous trivias game
    @DeleteMapping
    public void deleteTrivia() {
        triviaService.deleteTrivia();
    }

    // PUT
}
