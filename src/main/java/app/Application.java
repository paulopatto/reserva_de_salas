package app;

import java.util.List;

import app.model.*;

public class Application {
  public static void main(String[] args){
    System.out.println("Application bootstrap");

    Room r = new Room();
    
    r.setName("Teste");
    r = (Room) r.save();
    
  }
}
