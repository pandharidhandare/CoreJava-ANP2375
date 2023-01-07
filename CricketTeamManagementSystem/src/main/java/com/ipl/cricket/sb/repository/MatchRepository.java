package com.ipl.cricket.sb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ipl.cricket.sb.entity.Match;

public interface MatchRepository extends JpaRepository<Match, Integer>{

	// fetch all match details based on location
		@Query("select m from Match m where m.mLocation=?1")
		List<Match> getMatchByLocation(String mLocation);
}
