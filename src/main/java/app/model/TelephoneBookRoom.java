package app.model;

///   vim: ft=java
public class TelephoneBookRoom implements BookBehaviour {

  @Override
  public void bookRoom(Schedule request){}

  @Override
  public void cancel(int schedule_id){}

  @Override
  public boolean verify(Schedule request){return false; }
}
