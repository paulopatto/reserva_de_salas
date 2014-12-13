package app.model;

///   vim: ft=java

import java.sql.SQLException;
import java.util.List;

public class Costumer extends Person {

    private final BookBehaviour book = new InternetBookRoom();

    public void bookRoom(Schedule room_id) {
    }

    public void cancelBook(int schedule_id) {
        ///
    }

    public void verify(int room_id) {
        /// code
    }

    public void pay() {
    }

    public static void create(String name, String email, String mobile, String password) {
        Person.create(name, email, mobile, password, "Costumer");
    }
    
    public static List<Costumer> all() throws SQLException{
        return  Person._all("Costumer");
    }
}
