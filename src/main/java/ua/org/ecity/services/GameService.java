package ua.org.ecity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.org.ecity.entities.Game;
import ua.org.ecity.repository.GameRepository;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> getGameById (long id) {
        return gameRepository.findById(id);
    }

    public List<Game> getGameByMoves (Integer moves) {
        return gameRepository.findByMoves(moves);
    }
}