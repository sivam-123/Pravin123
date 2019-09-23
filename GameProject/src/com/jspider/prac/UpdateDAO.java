package com.jspider.prac;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.SingleTonSessionFactory;

public class UpdateDAO {
	public static void main(String[] args) {
		String hql="update GameDTO set duration=80 where gameName=:gameName";
		Session session=SingleTonSessionFactory.getSf().openSession();
		Query qry=session.createQuery(hql);
		qry.setParameter("gameName", "hockey");
		//Execute the query.....
		qry.executeUpdate();
		session.beginTransaction().commit();	
	}
}
