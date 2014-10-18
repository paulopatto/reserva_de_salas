interface IBook {
  public void bookRoom(int room_id);
  public void cancel(int schedule_id);
  public boolean verify(int room_id);
}
