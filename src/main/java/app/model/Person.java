package app.model;
///   vim: ft=java

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persons")
public abstract class Person extends Base {

  @Id
  @GeneratedValue
  protected Long id;

  @Column(name="name")
  protected String name;

  @Column(name="email")
  protected String email;

  @Column(name="mobile")
  protected String mobile;
  
  @Column(name="type")
  protected String type;

  @Column(name="created_at")
  protected Timestamp createdAt;
  
  @Column(name="updated_at")
  protected Timestamp updatedAt;

  public Long getId(){ return this.id; }

  public void setName(String name){ this.name = name;}
  public String getName(){ return this.name; }

  public void setEmail(String email){ this.email = email;}
  public String getEmail(){ return this.email; }

  public void setMobile(String mobile){ this.mobile = mobile;}
  public String getMobile(){ return this.mobile; }

  public Timestamp getCreatedAt(){ return this.createdAt; }
  public Timestamp getUpdatedAt(){ return this.updatedAt; }
}
