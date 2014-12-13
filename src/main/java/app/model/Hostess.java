package app.model;
///   vim: ft=java

import java.sql.SQLException;
import java.util.List;


public class Hostess extends Person {

  private BookBehaviour book;

  public Hostess(){
    this.type = "Hostess";
    this.book = new TelephoneBookRoom() ;
  }
  public void bookRoom(Schedule request){
    book.bookRoom(request);
  }
  public void cancelBook(int schedule_id){ }
  public void verify(Schedule request){ }
  
  public static void create(String name, String email, String mobile, String password) {
        Person.create(name, email, mobile, password, "Hostess");
    }
  public static List<Hostess> all() throws SQLException{
        return Person._all("Hostess");
    }
}
