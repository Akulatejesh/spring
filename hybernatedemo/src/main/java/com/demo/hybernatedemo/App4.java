package com.demo.hybernatedemo;
 
import java.util.List;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
 
import com.demo.hybernatedemo.config.HibernateUtility;
 
public class App4 {
	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtility.getSessionFactoryObject();
		 Session session=sessionFactory.openSession();
		// Query query= session.createNativeQuery("select prdid,prdname from product where prdcategory=?");
		 @SuppressWarnings({ "deprecation", "rawtypes" })
		Query query= session.createNativeQuery("select * from product");
	 //query.setParameter(1, "Toy");
		 @SuppressWarnings("unchecked")
		List<Object[]> products=query.getResultList();
		 for(Object[] p:products) {
			 for(Object o:p)
			 System.out.println(o);
		 }
		 session.close();

	}
	}