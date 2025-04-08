package com.players.players.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.players.players.model.Player;
import com.players.players.repository.PlayerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Optional<Player> getPlayerById(Long id) {
        return playerRepository.findById(id);
    }

    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    // Update an existing player
    public Player updatePlayer(Long id, Player playerDetails) {
        Optional<Player> playerData = playerRepository.findById(id);
        if (playerData.isPresent()) {
            Player player = playerData.get();
            player.setName(playerDetails.getName());
            player.setDorsal(playerDetails.getDorsal());
            player.setTeam(playerDetails.getTeam());
            return playerRepository.save(player);
        } else {
            return null;
        }
    }

    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }
}
