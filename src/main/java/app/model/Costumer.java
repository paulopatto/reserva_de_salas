package app.model;

///   vim: ft=java
import org.hibernate.Session;

class Costumer extends Person {

    private final BookBehaviour book = new InternetBookRoom();
    public String type = "Person";

    public Costumer(String name, String email, String mobile, String password) {        
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
    }

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

    public void create(String name, String email, String mobile, String password) {
        Session session = HibernateUtil.getSession();
        Costumer costumer = new Costumer(name, email, mobile, password);

        try {
            session.beginTransaction();
            session.save(costumer);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
