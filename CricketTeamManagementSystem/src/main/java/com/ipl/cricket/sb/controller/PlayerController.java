package com.ipl.cricket.sb.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ipl.cricket.sb.entity.Player;
import com.ipl.cricket.sb.service.PlayerService;


//rest controller to handle all incoming request using rest API
@RestController
public class PlayerController {

	@Autowired
	private PlayerService pSer;
	
	//save passenger details using post mapping
	@PostMapping("/savep")
	public ResponseEntity<Player> savep(@Valid @RequestBody Player player){
		return new ResponseEntity<Player>(pSer.savePlayer(player),HttpStatus.CREATED);
	}
	
	//fetching passenger details by id using get mapping..
	@GetMapping("/getp/{pid}")
	public ResponseEntity<Player> getp(@PathVariable("pid") long pid){
		return new ResponseEntity<Player>(pSer.getByIdPlayer(pid),HttpStatus.OK);
	}
	
	//updating passenger details by id using put mapping.
	@PutMapping("/updatep/{pid}")
	public ResponseEntity<Player> updatep(@PathVariable("pid") long pid,
			@RequestBody Player player){
		return new ResponseEntity<Player>(pSer.updateByIdPlayer(player, pid), HttpStatus.OK);
	}
	
	//updating passenger details by id using delete mapping.
	@DeleteMapping("/deletep/{pid}")
	public ResponseEntity<String> deletep(@PathVariable("pid") long pid){
		pSer.deleteByIdPlayer(pid);
		return new ResponseEntity<String>("Deleted Successfully",HttpStatus.OK);
	}
	
	//fetch all passenger details by using get mapping
	
	@GetMapping("/gett")
	public List<Player> getAllPlayer(){
		return pSer.getAllPlayer();
	}
	
	
	//fetching player detail by First name using get mapping
	@GetMapping("/getpByName/{pFirstname}")
	public List<Player> getpByName(@PathVariable("pFirstname") String pFirstname){
		return pSer.getPlayerByName(pFirstname);
	}
	
	
	//fetching player detail by rank using get mapping
	@GetMapping("/getpByRank/{pRank}")
	public ResponseEntity<Player> getpByRank(@PathVariable("pRank") long pRank){
		return new ResponseEntity<Player>(pSer.getPlayerByRank(pRank),HttpStatus.OK);
	}
}
