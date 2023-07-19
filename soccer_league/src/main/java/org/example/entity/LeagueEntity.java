package org.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "league_table")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LeagueEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int leagueId;
	private int year;
	private String season;
	private String title;
	
	
	
	public LeagueEntity(int year, String season, String title) {
		super();
		this.year = year;
		this.season = season;
		this.title = title;
	}
	public int getLeagueId() {
		return leagueId;
	}
	public void setLeagueId(int leagueId) {
		this.leagueId = leagueId;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}