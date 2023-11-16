package br.com.williamspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.williamspring.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
