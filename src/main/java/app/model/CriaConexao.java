/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package app.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriaConexao {

    public static Connection getConexao() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("conectando ao banco...");
            return (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/groom", "groom", "gaba");
            } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
    }
}
