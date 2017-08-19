package br.com.senai.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection createConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/bdbar", "root", "admin");
        } catch (SQLException ex) {
            System.err.println("Impossível conectar\n\n\n" + ex.getStackTrace());
            throw new RuntimeException(ex);
        }
    }

}
