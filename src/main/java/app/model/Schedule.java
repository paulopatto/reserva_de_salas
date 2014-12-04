package app.model ;
///   vim: ft=java

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="schedules")
public class Schedule {

  @Id
  @GeneratedValue
  private int id;

  @ManyToOne
  @Column(name="room_id")
  private Room room;

  @ManyToOne
  @Column(name="person_id")
  private Person person;

  @Column(name="slot")
  private Timestamp slot;

  @Column(name="statue")
  private boolean status;

  @Column(name="created_at")
  protected Timestamp createdAt;

  @Column(name="updated_at")
  protected Timestamp updatedAt;

  public Person getPerson() { return this.person; }
  public void setPerson(Person person) { this.person = person; }

  public Room getRoom() { return this.room; }
  public void setRoomId(Room room) { this.room = room; }

  public Timestamp getSlot() { return slot; }
  public void setSlot(Timestamp slot) { this.slot = slot; }

  public void setStatus(boolean status){ this.status = status; }
  public boolean getStatus(){ return this.status; }

  public static void bookRoom(Person person, Room room) { System.out.println( "notYetImplemented" ); }

  public static boolean available(Timestamp slot){
    System.out.println( "notYetImplemented" );
    return false;
  }

  public static Schedule find(int id){ return new Schedule() ; }

}
