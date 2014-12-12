package app;

import app.forms.Login;
import app.model.Person;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
  public static void main(String[] args){
    System.out.println("Application bootstrap");
    
    //Person.login("gi@gio.com", "done");
    
    dataFormatBootstrap();
    
    new Login().setVisible(true);
    System.out.println("Done!");
  }
  
  public static void dataFormatBootstrap(){
      SimpleDateFormat EUA = new SimpleDateFormat("yyyy-MM-dd");
      SimpleDateFormat BRA = new SimpleDateFormat("dd-MM-yyyy");
      
      try { 
          System.out.println(BRA.format(EUA.parse("2014-12-12"))); 
          Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, "[Sys] ::Date ok!");
      } 
      catch (ParseException ex) {
          Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      
  }
}
