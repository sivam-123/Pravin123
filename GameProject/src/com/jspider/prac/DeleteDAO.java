package com.jspider.prac;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.SingleTonSessionFactory;

public class DeleteDAO {
	public static void main(String[] args) {
		Session session=SingleTonSessionFactory.getSf().openSession();
		Query qry=session.getNamedQuery("delete");
        qry.setParameter("gameName","Footboll");
        qry.executeUpdate();
        session.beginTransaction().commit();
	}
}
