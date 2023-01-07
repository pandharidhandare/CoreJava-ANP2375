package com.ipl.cricket.sb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipl.cricket.sb.entity.Match;
import com.ipl.cricket.sb.exception.MatchNotFoundException;
import com.ipl.cricket.sb.repository.MatchRepository;
import com.ipl.cricket.sb.service.MatchService;

@Service
public class MatchServiceImpl implements MatchService {

	@Autowired
	private MatchRepository mRepo;

	@Override
	public List<Match> getAllMatch() {	
		return mRepo.findAll();
	}

	@Override
	public Match getMatchById(int mid) {	
		return mRepo.findById(mid).orElseThrow(()-> new MatchNotFoundException("Entered match id not found"));
	}

	@Override
	public List<Match> getMatchByLocation(String mLocation) {	
		return mRepo.getMatchByLocation(mLocation);
	}
}
