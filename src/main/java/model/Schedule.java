package model;
///   vim: ft=java

import java.util.Date;

public class Schedule {

  private int id;
  private int roomId;
  private int personId;
  private Date slot;

  public void bookRoom(Person person_id, Room room_id, Datetime date){
    /// Salva na tabela
    throw "NotYetImplemented";
  }

  public boolean available(Date slot){
    throw "NotYetImplemented";
  }
}
