package com.jspider.prac;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="game_table")
//@NamedQuery(name="getByduration",query="from GameDTO where duration=:duration")
@NamedQueries({@NamedQuery(name="getByduration", query="from GameDTO where duration=:duration"),
	@NamedQuery(name="getByName",query="from GameDTO where gameName=:gameName"),
	@NamedQuery(name="delete",query="delete from GameDTO where gameName=:name")})
public class GameDTO implements Serializable{
   @Id
   @Column(name="game_name")
   private String gameName;
   @Column(name="no_of_players")
   private int noOfPlayers;
   @Column(name="game_type")
   private String type;
   @Column(name="game_duration")
   private int duration;
public String getGameName() {
	return gameName;
}
public void setGameName(String gameName) {
	this.gameName = gameName;
}
public int getNoOfPlayers() {
	return noOfPlayers;
}
public void setNoOfPlayers(int noOfPlayers) {
	this.noOfPlayers = noOfPlayers;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
 public GameDTO()
 {
	   
 }
}
