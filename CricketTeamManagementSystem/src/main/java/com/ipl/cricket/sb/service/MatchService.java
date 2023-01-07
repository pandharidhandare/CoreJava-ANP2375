package com.ipl.cricket.sb.service;

import java.util.List;

import com.ipl.cricket.sb.entity.Match;

public interface MatchService {

	List<Match> getAllMatch();
	
	Match getMatchById(int bid);
	
	List<Match> getMatchByLocation(String mLocation);
}
