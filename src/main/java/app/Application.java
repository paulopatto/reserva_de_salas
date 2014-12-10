package app;

import java.util.List;

import app.model.*;

public class Application {
  public static void main(String[] args){
    System.out.println("Application bootstrap");

    Room.create("Verão");
    System.out.println("Gravado");
    System.exit(0);
  }
}
