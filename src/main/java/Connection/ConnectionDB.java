package Connection;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
        
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author João Vitor
 */
public class ConnectionDB {
    public Connection runConnection() {
    Connection connection = null;
    try{
         connection = DriverManager.getConnection("jdbc:sqlite:teste.db");
         Statement statment = connection.createStatement();
         statment.executeUpdate("CREATE TABLE IF NOT EXISTS game (id INTEGER Primary Key, name TEXT, points INTEGER)");
         System.out.println("Consultas realizadas! ");
        }
    catch(SQLException e) {
            System.out.println(e);
    }  
    
    return connection;
    }
    public ResultSet SelectAll(String command) {
        ResultSet rs = null;
       
        try{
             Statement statment = runConnection().createStatement();
             rs = statment.executeQuery(command);
             
        }
        catch(SQLException ex) {
            System.out.println(ex);
        }
        return rs;
    }
    public boolean InsertUser(String command) {
        
        
        try {
            Statement statment = runConnection().createStatement();
            statment.executeUpdate(command);
            return true;
        }
        catch(SQLException ex ){
            System.out.println(ex);
        }
        return false;
    }
    
}


