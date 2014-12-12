package app.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    public void setId(int id) {
        this.id = id;
    }
    public int getId(){ return this.id; }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Room> all() throws SQLException {
        Connection connection = CriaConexao.getConexao();
        String sql = "SELECT * FROM rooms" ;
        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        ArrayList<Room> rooms = new ArrayList<Room>();
        
        while (rs.next()) {
            Room room = new Room(rs.getString("name"));
            room.setId(rs.getInt("id"));
            
            rooms.add(room);
        }

        return rooms;
    }
    
    public static List<Room> findById(int id) throws SQLException{
        Connection connection = CriaConexao.getConexao();
        String sql = "SELECT * FROM rooms WHERE id = '" + id + "' ORDER BY id" ;
        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        ArrayList<Room> rooms = new ArrayList<Room>();
        
        while (rs.next()) {
            Room room = new Room(rs.getString("name"));
            room.setId(rs.getInt("id"));
            
            rooms.add(room);
        }

        return rooms;
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
