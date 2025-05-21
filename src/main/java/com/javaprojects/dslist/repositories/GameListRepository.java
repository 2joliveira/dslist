package com.javaprojects.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprojects.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
  
}
