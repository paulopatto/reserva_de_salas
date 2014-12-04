package app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/// vim: ft=java

@Entity(name="rooms")
public class Room {
	  @Id
	  @GeneratedValue
	  private int id;
	  
	  @Column(name="name")
	  private String name;

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	  
}
