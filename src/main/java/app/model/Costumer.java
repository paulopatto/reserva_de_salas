package app.model;

///   vim: ft=java
public class Costumer {

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
}
