package com.demo.hybernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
 
import com.demo.hybernatedemo.config.HibernateUtility;
import com.demo.hybernatedemo.entities.Product;
public class App {
  @SuppressWarnings("deprecation")
public static void main(String[] args) {
	  SessionFactory sessionFactory=HibernateUtility.getSessionFactoryObject();
   //Product prdObj=new Product(1,"Java","Book",700);
    Session session=sessionFactory.openSession();
  //Transaction trnx= session.beginTransaction();
  //session.save(prdObj);
   //trnx.commit();
  //session.close();
   Product prdObj=session.get(Product.class, 1);
    prdObj.setPrdPrice(3900);
    Transaction trnx= session.beginTransaction();
  session.update(prdObj);
  trnx.commit();
   session.close();
   System.out.println(prdObj);
  }
}