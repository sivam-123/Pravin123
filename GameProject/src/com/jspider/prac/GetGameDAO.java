package com.jspider.prac;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.SingleTonSessionFactory;

public class GetGameDAO {
	public static void main(String[] args) {
		Session session=SingleTonSessionFactory.getSf().openSession();
		Query qry=session.getNamedQuery("getByduration");
		qry.setParameter("duration", 30);
		GameDTO game=(GameDTO)qry.uniqueResult();
		System.out.println(game.getGameName());
		System.out.println(game.getDuration());
		System.out.println(game.getNoOfPlayers());
		System.out.println(game.getType());
		System.out.println("-----------------------");
		Query qry1=session.getNamedQuery("getByName");
		qry1.setParameter("gameName","Cricket");
		GameDTO game1=(GameDTO)qry1.uniqueResult();
		System.out.println(game1.getGameName());
		System.out.println(game1.getDuration());
		System.out.println(game1.getNoOfPlayers());
		System.out.println(game1.getType());
	}
}
