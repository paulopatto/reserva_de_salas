package gaba.model;

///   vim: ft=java
public interface BookBehaviour {
  public void bookRoom(Schedule request);
  public void cancel(int schedule_id);
  public boolean verify(Schedule request);
}
