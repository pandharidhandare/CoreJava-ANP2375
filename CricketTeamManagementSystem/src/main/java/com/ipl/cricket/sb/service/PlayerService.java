package com.ipl.cricket.sb.service;

import java.util.List;


import com.ipl.cricket.sb.entity.Player;

public interface PlayerService {

	
	Player savePlayer(Player player);
	
	Player getByIdPlayer(long pid);
	
	List<Player> getAllPlayer();
	
	Player updateByIdPlayer(Player player,long pid);
	
	public void deleteByIdPlayer(long pid);
	
	
	//method for fetch player details based on pname
	List<Player> getPlayerByName(String pFirstname);
	
	
	//method for fetch player details based on prank
	Player getPlayerByRank(long pRank);
}
