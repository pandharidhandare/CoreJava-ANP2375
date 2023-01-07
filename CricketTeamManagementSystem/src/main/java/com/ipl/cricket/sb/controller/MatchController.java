package com.ipl.cricket.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ipl.cricket.sb.entity.Match;
import com.ipl.cricket.sb.service.MatchService;

@RestController
public class MatchController {

	@Autowired
	private MatchService mSer;
	
	//fetching match details by id using get mapping
			@GetMapping("/getb/{bid}")
			public ResponseEntity<Match> getP(@PathVariable("bid") int  mid){
				return new ResponseEntity<Match>(mSer.getMatchById(mid), HttpStatus.OK);
			}
			
			//fetching  match details using get mapping
			@GetMapping("/getb")
			public List<Match> getAllB(){
				return mSer.getAllMatch();
			}
		
			//fetching match details by location using get mapping
		@GetMapping("/getblocation/{mLocation}")
		public List<Match> getByloc(@PathVariable("mLocation") String mLocation){
						return mSer.getMatchByLocation(mLocation);
					}
					
}
