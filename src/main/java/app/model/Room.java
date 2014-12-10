package app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.Session;
/// vim: ft=java

@Entity(name = "rooms")
public class Room extends Base {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name")
    private String name;

    public Room(String label){
        this.name = label;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Room> all() {
        List<Room> results = getSession().createQuery("from rooms").list();
        return results;
    }
    
    public static void create(String label){
        Session session = HibernateUtil.getSession();
        Room room = new Room(label);
        
        try{
            session.beginTransaction();
            session.save(room);
            session.getTransaction().commit();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
