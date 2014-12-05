package app.controller;

import app.model.Room;

public class RoomController implements IController{
  public RoomController(){
    // Session session = HibernateUtil.getSession();
  }
  public void create(Room room){
    // session.save( room );
  }

  public void update( Room room ) {
    // Room r = session.get(Room.class, room.getId());
    /// Room.find(:id)
    //  Setter data
    //  session.save( room );
  }
}
