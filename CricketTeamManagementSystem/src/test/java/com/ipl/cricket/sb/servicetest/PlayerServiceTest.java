package com.ipl.cricket.sb.servicetest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.ipl.cricket.sb.entity.Player;
import com.ipl.cricket.sb.repository.PlayerRepository;
import com.ipl.cricket.sb.service.PlayerService;

//testing all CRUD method of Player Service

@SpringBootTest
public class PlayerServiceTest {

	@Autowired
	private PlayerService ps;
	
	@MockBean
	private PlayerRepository pr;
	
	//testing savePlayer() of player service 
	
	@Test
	public void testSavePlayer() {
		Player p1=new Player();
		p1.setId(1);
		p1.setpFirstname("sam");
		p1.setpLastname("karan");
		p1.setpRank(5);
		p1.setpEmail("sam@rootmail.com");
		Mockito.when(pr.save(p1)).thenReturn(p1);
		assertThat(ps.savePlayer(p1)).isEqualTo(p1);
	}
	
	//testing of getAllPlayer of player service
	
	@Test
	public void testGetAllPlayer() {
		
		Player p1=new Player();
		p1.setId(1);
		p1.setpFirstname("sam");
		p1.setpLastname("karan");
		p1.setpRank(5);
		p1.setpEmail("sam@rootmail.com");
		
		Player p2=new Player();
		p2.setId(2);
		p2.setpFirstname("payal");
		p2.setpLastname("kumaran");
		p2.setpRank(2);
		p2.setpEmail("payal@rootmail.com");
		
		List<Player> aList= new ArrayList<Player>();
		aList.add(p1);
		aList.add(p2);
		Mockito.when(pr.findAll()).thenReturn(aList);
		assertThat(ps.getAllPlayer()).isEqualTo(aList);
			
		}
	//testing of getByIdPlayer of Player service
	
			@Test
			public void testGetPlayerById() {
				Player p1=new Player();
				p1.setId(1);
				p1.setpFirstname("sm");
				p1.setpLastname("kaan");
				p1.setpRank(3);
				p1.setpEmail("sam@rotmail.com");
				
				Optional<Player> op=Optional.of(p1);
				Player ua=op.get();
				
				Mockito.when(pr.findById((long) 1)).thenReturn(op);
				assertThat(ps.getByIdPlayer(1)).isEqualTo(ua);
				
				
	}
			
			//testing of updateByIdPlayer of player service
			
			@Test
			public void testUpdateByIdPlayer() {
				Player p1=new Player();
				p1.setId(1);
				p1.setpFirstname("sam");
				p1.setpLastname("karan");
				p1.setpRank(5);
				p1.setpEmail("sam@rootmail.com");
				
				Optional<Player> optional=Optional.of(p1);
				Player player=optional.get();
				
				Mockito.when(pr.findById((long) 1)).thenReturn(optional);
				
				//here we updateRank
				player.setpRank(2);
				Mockito.when(pr.save(player)).thenReturn(player);
				assertThat(ps.updateByIdPlayer(player, 1)).isEqualTo(player);
				
			}
			
			//testing of deleteByIdPlayer of player service
			
			@Test
			public void testDeleteByIdPlayer() {
				Player p1=new Player();
				p1.setId(1);
				p1.setpFirstname("sam");
				p1.setpLastname("karan");
				p1.setpRank(5);
				p1.setpEmail("sam@rootmail.com");
				
				Optional<Player> optional=Optional.of(p1);
				
				Mockito.when(pr.existsById((long) 1)).thenReturn(false);
				assertThat(pr.existsById(optional.get().getId()));
			}
}
	
