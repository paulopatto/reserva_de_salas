/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package app.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Conexao {

    final private String driver = "org.postgresql.Driver";
    final private String url = "jdbc:postgresql://localhost:5432/groom";
    final private String usuario = "groom";
    final private String senha = "gaba";
    private Connection conexao;
    public Statement stmt;
    public ResultSet rs;

public boolean conecta(){
    boolean result = true;
    try{
        Class.forName(driver);
        conexao = (Connection) DriverManager.getConnection(url, usuario, senha);
        System.out.println("conectou...");
    }
    catch(ClassNotFoundException Driver){

        JOptionPane.showMessageDialog(null, "driver naum localizado!: "+Driver);
        result = false;
    }
    catch(SQLException Fonte){
        JOptionPane.showMessageDialog(null, "erro na conexao com a fonte de dados: " + Fonte );
        result = false;

    }
    return result;
}
public void desconecta(){
    boolean result = true;
    try{
        conexao.close();
        System.out.println("banco desconectado!");
    }
    catch(SQLException erroSQL){
        JOptionPane.showMessageDialog(null, "nao foi possivel fechar o banco de dados" + erroSQL.getMessage());
        result = false;
    }
}
public void executeSQL(String sql){

    try{
        stmt = (Statement) conexao.createStatement();
        rs = stmt.executeQuery(sql);

    }
    catch(SQLException sqlex){
        JOptionPane.showMessageDialog(null, sqlex.getMessage());
    }
}

}
