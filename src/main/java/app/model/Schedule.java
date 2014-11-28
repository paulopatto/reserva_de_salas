package app.model ;
///   vim: ft=java

import java.util.Date;

public class Schedule {

  private int id;
  private int roomId;
  private int personId;
  private Date slot;
  private boolean status;

  public int getPersonId() {
	return personId;
  }
public void setPersonId(int personId) {
	this.personId = personId;
}
public int getRoomId() {
	return roomId;
}
public void setRoomId(int roomId) {
	this.roomId = roomId;
}
public Date getSlot() {
	return slot;
}
public void setSlot(Date slot) {
	this.slot = slot;
}
public void setStatus(boolean status){ this.status = status; }
  public boolean getStatus(){ return this.status; }

  public void bookRoom(Person person_id, Room room_id) {
    System.out.println( "notYetImplemented" );
  }

  public boolean available(Date slot){
    System.out.println( "notYetImplemented" );
    return false;
  }

  public static Schedule find(int id){ return new Schedule() ; }

}
