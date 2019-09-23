package com.jspider.prac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.SingleTonSessionFactory;

public class GameDAO {
	public static void main(String[] args) {
		GameDTO game=new GameDTO();
		game.setGameName("hockey");
        game.setDuration(60);
        game.setNoOfPlayers(11);
        game.setType("outdoor");
        Session session=SingleTonSessionFactory.getSf().openSession();
        session.save(game);
        session.beginTransaction().commit();
        System.out.println("data saved");
	}
}
