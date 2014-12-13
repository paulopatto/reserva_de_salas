package app.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

/// @deprecated
public abstract class Base {
	

  protected static Session getSession(){ return HibernateUtil.getSession(); }
  
  //FIXME: Corrija isso pelo amor de Deus
  protected static String className = Base.class.getSimpleName();
  
  protected Session session = getSession();
  public static String tableName = "";
  
  public Base save(){
	  this.session.beginTransaction();
	  this.session.save(this);
	  this.session.getTransaction().commit();
	  
	  return this;
  }
  
  public static ResultSet query(String sql) throws SQLException {
        Connection connection = CriaConexao.getConexao();
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        return stmt.executeQuery();
    }
}

