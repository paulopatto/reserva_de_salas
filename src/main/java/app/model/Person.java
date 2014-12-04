package app.model;
///   vim: ft=java

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public abstract class Person {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name="name")
  private String name;

  @Column(name="email")
  private String email;

  @Column(name="mobile")
  private String mobile;

  private Date createdAt;
  private Date updatedAt;

  public Long getId(){ return this.id; }

  public void setName(String name){ this.name = name;}
  public String getName(){ return this.name; }

  public void setEmail(String email){ this.email = email;}
  public String getEmail(){ return this.email; }

  public void setMobile(String mobile){ this.mobile = mobile;}
  public String getMobile(){ return this.mobile; }

  public Date getCreatedAt(){ return this.createdAt; }
  public date getUpdatedAt(){ return this.updatedAt; }
}
