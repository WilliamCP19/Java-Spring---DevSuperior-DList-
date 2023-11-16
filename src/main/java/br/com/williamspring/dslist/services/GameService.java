package br.com.williamspring.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.williamspring.dslist.dto.GameDTO;
import br.com.williamspring.dslist.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll () {
        var result = gameRepository.findAll(); 
        return result.stream().map(x -> new GameDTO(x)).toList();
    }
}
