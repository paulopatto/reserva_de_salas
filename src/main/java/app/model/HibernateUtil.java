package app.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
  public static SessionFactory getSessionFactory(){
    return new AnnotationConfiguration().configure().buildSessionFactory();
  }
  public static Session getSession(){
	  return getSessionFactory().openSession();
  }
}
