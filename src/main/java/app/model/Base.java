package app.model;

import java.util.List;

import org.hibernate.Session;

public abstract class Base {
	

  protected static Session getSession(){ return HibernateUtil.getSession(); }
  
  //FIXME: Corrija isso pelo amor de Deus
  protected static String className = Base.class.getSimpleName();
  
  protected Session session = getSession();
  
  public Base save(){
	  this.session.beginTransaction();
	  this.session.save(this);
	  this.session.getTransaction().commit();
	  
	  return this;
  }
}

