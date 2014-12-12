package app.model;
///   vim: ft=java

import java.sql.Timestamp;
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

    private Person(String name, String email, String mobile, String password) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
    }


    public Long getId() {
        return this.id;
    }

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
    
    public String getPassword() { return this.password; }
    
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
}
