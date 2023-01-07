package com.ipl.cricket.sb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipl.cricket.sb.entity.Player;
import com.ipl.cricket.sb.exception.PlayerNotFoundException;
import com.ipl.cricket.sb.repository.PlayerRepository;
import com.ipl.cricket.sb.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService{

	@Autowired
	PlayerRepository playerRepo;
	
	@Override
	public Player savePlayer(Player player) {
		
		return playerRepo.save(player);
	}

	@Override
	public Player getByIdPlayer(long pid) {
		
		return playerRepo.findById(pid).orElseThrow(()->new PlayerNotFoundException("Entered player id does not found"));
	}

	@Override
	public List<Player> getAllPlayer() {
		
		return playerRepo.findAll();
	}

	@Override
	public Player updateByIdPlayer(Player player, long pid) {
		
		Player player1=playerRepo.findById(pid).orElseThrow(()->new PlayerNotFoundException("Entered player id does not found"));
		
		player1.setpEmail(player1.getpEmail());
		player1.setpRank(player1.getpRank());
		
		playerRepo.save(player1);
		return player1;
	}

	@Override
	public void deleteByIdPlayer(long pid) {
		
	playerRepo.findById(pid).orElseThrow(()->new PlayerNotFoundException("Entered player id does not found"));
		playerRepo.deleteById(pid);
	}

	@Override
	public List<Player> getPlayerByName(String pFirstname) {
		// TODO Auto-generated method stub
		return playerRepo.getPlayerByName(pFirstname);
	}

	@Override
	public Player getPlayerByRank(long pRank) {
		// TODO Auto-generated method stub
		return playerRepo.getPlayerByRank(pRank);
		
	}

}
