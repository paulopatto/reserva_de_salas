package app.model;
///   vim: ft=java

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;

@Entity
@Table(name = "people")
public class Person {
    
    @Id
    @GeneratedValue
    protected Long id;

    @Column(name = "name")
    protected String name;

    @Column(name = "email")
    protected String email;

    @Column(name = "mobile")
    protected String mobile;

    @Column(name = "type")
    protected String type;

    @Column(name = "password")
    protected String password;

    @Column(name = "created_at")
    protected Timestamp createdAt;

    @Column(name = "updated_at")
    protected Timestamp updatedAt;

    public Person(String name, String email, String mobile, String password) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
    }
    
    public Person(){}


    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id){ this.id = id; }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public void setPassword(String password){ this.password = password; }
    public String getPassword(){ return this.password ;}

    public String getMobile() {
        return this.mobile;
    }

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getType(){
        return this.type;
    }
    
    
    public static void create(String name, String email, String mobile, String password, String type){
        Person person = new Person(name, email, mobile, password);
        person.setType(type);
        
        Session session = HibernateUtil.getSession();
        
        try{
            session.beginTransaction();
            session.save(person);
            session.getTransaction().commit();
        }
        catch(Exception ex){ 
            Logger.getLogger(Person.class.getName())
                .log(Level.SEVERE, null, ex); 
        }
    }
    
    public static Person login(String email, String password){
        Person p = null;
        try{
            System.out.println("LOGIN: " + email);
            Conexao c = new Conexao();
            c.conecta(); 
            c.executeSQL("select * from people where email = '" + email + "'");
            
        }
        catch(Exception e){
            Logger.getLogger(Person.class.getName())
                    .log(Level.SEVERE, null, "[Login] Erro de tentativa para login com <"+email+">.");
            
            ///TODO: Passar para validação na camada de forms
            JOptionPane.showMessageDialog(null,"O programa será fechado!\ne-mail não encontrado","Erro de login",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(1);
        }
        
        if( !(p.getPassword().equals(password)) ){
            ///TODO: Passar para validação na camada de forms
            JOptionPane.showMessageDialog(null,"O programa será fechado!\nsenha inválida","Erro de login",JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        
        return p;
    }
    
    protected static List _all(String typeClass) throws SQLException {
        Connection connection = CriaConexao.getConexao();
        String sql = "SELECT * FROM people WHERE type = " + typeClass ;
        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        ArrayList<Person> people = new ArrayList<Person>();
        
        while (rs.next()) {
            Person person = new Person();
            
            person.setId(rs.getLong("id"));
            person.setName(rs.getString("name"));
            person.setEmail(rs.getString("email"));
            person.setPassword(rs.getString("password"));
            
            people.add(person);
        }

        return people;
    }
    
    public static List<Person> findById(int id) throws SQLException{
        Connection connection = CriaConexao.getConexao();
        String sql = "SELECT * FROM rooms WHERE id = '" + id + "' ORDER BY id" ;
        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        ArrayList<Person> people = new ArrayList<Person>();
        
        while (rs.next()) {
            Person person = new Person();
            
            person.setId(rs.getLong("id"));
            person.setName(rs.getString("name"));
            person.setEmail(rs.getString("email"));
            person.setPassword(rs.getString("password"));
            
            people.add(person);
        }

        return people;
    }
}
