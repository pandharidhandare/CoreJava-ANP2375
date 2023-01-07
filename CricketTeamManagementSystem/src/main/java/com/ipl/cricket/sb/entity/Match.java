package com.ipl.cricket.sb.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="matches_Info")
public class Match {

	@Id
	private int mid;
	
	@Column(length = 20,nullable = false)
	@NotBlank(message = "cannot be empty.Please fill requiredd data")
	private String mType;
	
	@Column(length = 25,nullable = false)
	@NotBlank(message = "cannot be empty.Please fill requiredd data")
	private String mLocation;
	
	@Column(length = 15,nullable = false)
	@NotBlank(message = "cannot be empty.Please fill requiredd data")
	private String mDate;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="playerID", referencedColumnName ="id")
	@JsonBackReference
	private Player player;

	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Match( String mType, String mLocation, String mDate) {
		super();
		
		this.mType = mType;
		this.mLocation = mLocation;
		this.mDate = mDate;
	}

	public long getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getmType() {
		return mType;
	}

	public void setmType(String mType) {
		this.mType = mType;
	}

	public String getmLocation() {
		return mLocation;
	}

	public void setmLocation(String mLocation) {
		this.mLocation = mLocation;
	}

	public String getmDate() {
		return mDate;
	}

	public void setmDate(String mDate) {
		this.mDate = mDate;
	}

	
	
	
	
}
