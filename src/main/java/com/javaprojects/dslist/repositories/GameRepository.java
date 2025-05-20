package com.javaprojects.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprojects.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
  
}
