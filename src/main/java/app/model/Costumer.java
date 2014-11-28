package app.model;

///   vim: ft=java
class Costumer extends Person {

private BookBehaviour book;

  public Costumer(){
    this.book = new InternetBookRoom() ;
  }

  public void bookRoom(Schedule room_id){
  }

  public void cancelBook(int schedule_id){
    ///
  }

  public void verify(int room_id){
    /// code
  }

  public void pay(){}
}
