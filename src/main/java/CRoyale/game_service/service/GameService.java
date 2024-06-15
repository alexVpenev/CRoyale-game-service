package CRoyale.game_service.service;

import CRoyale.game_service.entity.Game;
import CRoyale.game_service.repository.IGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private IGameRepository gameRepository;

//    @Autowired
//    public GameService(IGameRepository gameRepository) {
//        this.gameRepository = gameRepository;
//    }

    public int add(int a, int b) {
        return a + b;
    }

    public List<Game> getGames() {
        return gameRepository.findAll();
    }

    public void createGame(Game game) { gameRepository.save(game); }




}
