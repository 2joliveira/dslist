package com.javaprojects.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaprojects.dslist.dto.GameDTO;
import com.javaprojects.dslist.dto.GameMinDTO;
import com.javaprojects.dslist.entities.Game;
import com.javaprojects.dslist.projections.GameMinProjection;
import com.javaprojects.dslist.repositories.GameRepository;

@Service
public class GameService {

  @Autowired
  private GameRepository gameRepository;

  @Transactional(readOnly = true)
  public GameDTO finById(Long gameId) {
    Game result = gameRepository.findById(gameId).get();

    return new GameDTO(result);
  }

  @Transactional(readOnly = true)
  public List<GameMinDTO> findAll() {
    List<Game> result = gameRepository.findAll();
    return result.stream().map(game -> new GameMinDTO(game)).toList();
  };

  @Transactional(readOnly = true)
  public List<GameMinDTO> findByList(Long listId) {
    List<GameMinProjection> result = gameRepository.searchByList(listId);
    return result.stream().map(game -> new GameMinDTO(game)).toList();
  };
}
