package com.players.players.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.players.players.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
