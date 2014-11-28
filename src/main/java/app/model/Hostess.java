package app.model;
///   vim: ft=java

class Hostess extends Person {

  private BookBehaviour book;

  public Hostess(){
    this.book = new TelephoneBookRoom() ;
  }
  public void bookRoom(Schedule request){
    book.bookRoom(request);
  }
  public void cancelBook(int schedule_id){ }
  public void verify(Schedule request){ }
}
