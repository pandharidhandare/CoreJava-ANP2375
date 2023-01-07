package com.ipl.cricket.sb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ipl.cricket.sb.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long>{

	//customized query using JPQL
	
	@Query("select p from Player p where p.pFirstname=?1")
	List<Player> getPlayerByName(String pFirstname);
	
	@Query("select p from Player p where p.pRank=?1")
	Player getPlayerByRank(long pRank);
}
