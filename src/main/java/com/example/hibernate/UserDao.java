package com.example.hibernate;
  
import org.hibernate.Session;  
import org.hibernate.Transaction;  
import java.util.List;
import java.util.ArrayList;
import org.hibernate.Query;
  
public class UserDao {  
	
public static List<Post> getListOfUsers(){
        List<Post> list = new ArrayList<Post>();

        Session session = HibernateSessionManager.getSessionFactory().openSession();
	session.beginTransaction();

        Transaction tx = null;       
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from Post").list();
	    session.save(list);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
    }
}  
