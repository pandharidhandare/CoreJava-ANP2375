package com.ipl.cricket.sb.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="player_Info")
public class Player {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(length=50,nullable=false)
	@NotBlank(message="Enter Your First Name")
	private String pFirstname;
	
	@Column(length=50,nullable=false)
	@NotBlank(message="Enter Your Last Name")
	private String pLastname;
	
	@Column(length=50,nullable=false)
	@NotBlank(message="Enter Your Email")
	@Email(message="Enter proper Email id")
	private String pEmail;
	
	@Column(length=50,nullable=false)
	@NotBlank(message="Enter Your Which type of player you are")
	private String pType;
	
	@Column(length=50,nullable=false)
	@NotNull(message="Enter Your Rank")
	private long pRank;


	@OneToMany(fetch = FetchType.EAGER, mappedBy = "player", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Match> matchList;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(long id, @NotBlank(message = "Enter Your First Name") String pFirstname,
			@NotBlank(message = "Enter Your Last Name") String pLastname,
			@NotBlank(message = "Enter Your Email") @Email(message = "Enter proper Email id") String pEmail,
			@NotBlank(message = "Enter Your Which type of player you are") String pType,
			@NotBlank(message = "Enter Your Rank") long pRank) {
		super();
		this.id = id;
		this.pFirstname = pFirstname;
		this.pLastname = pLastname;
		this.pEmail = pEmail;
		this.pType = pType;
		this.pRank = pRank;
	}
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getpFirstname() {
		return pFirstname;
	}

	public void setpFirstname(String pFirstname) {
		this.pFirstname = pFirstname;
	}

	public String getpLastname() {
		return pLastname;
	}

	public void setpLastname(String pLastname) {
		this.pLastname = pLastname;
	}

	public String getpEmail() {
		return pEmail;
	}

	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}

	public String getpType() {
		return pType;
	}

	public void setpType(String pType) {
		this.pType = pType;
	}

	public long getpRank() {
		return pRank;
	}

	public void setpRank(long pRank) {
		this.pRank = pRank;
	}
	
	
}
