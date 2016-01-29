package com.example.hibernate;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Query;
import java.util.Iterator;
 
public class Retrive{
	public static void main(String[] args){
		Session session=HibernateSessionManager.getSessionFactory().openSession();
		session.beginTransaction();
		Query query=session.createQuery("from Post");
		List posts=query.list();
		/*for (Iterator iterator = posts.iterator(); iterator.hasNext();){
            		Post post = (Post) iterator.next(); 
            		System.out.println(post.getPostId()); 
			System.out.println(post.getTitle());
            		System.out.println(post.getBody()); 
		}*/
		for(int i=0;i<posts.size();i++){
			Post p=(Post)posts.get(i); 
			System.out.print(p.getPostId()+"\t");
			System.out.print(p.getTitle()+"\t");
            		System.out.print(p.getBody()+"\t"); 
			System.out.print("\n");
		}
		
			
			
	}
}




