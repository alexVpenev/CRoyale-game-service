package CRoyale.game_service.controller;

import CRoyale.game_service.entity.Game;
import CRoyale.game_service.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping({"/"})
    public String helloWorld() {
        return "CRoyale Game Service - Version 0.0.3 - SONARCLOUD!!!";
    }

    @GetMapping({"/game"})
    public List<Game> getGame() { return gameService.getGames(); }

    @PostMapping({"/game"})
    public void createGame(@RequestBody Game game) { gameService.createGame(game); }

}
