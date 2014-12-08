package app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/// vim: ft=java

@Entity(name="rooms")
public class Room extends Base {
	  @Id
	  @GeneratedValue
	  private int id;

	  @Column(name="name")
	  private String name;

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	
	  public static  List<Room> all(){
		  List<Room> results = getSession().createQuery("from rooms").list();
		  return results;
	  }
}
