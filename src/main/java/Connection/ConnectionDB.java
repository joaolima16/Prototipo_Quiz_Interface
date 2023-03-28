package Connection;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
         connection = DriverManager.getConnection("jdbc:sqlite:quiz.db");
        }
    catch(SQLException e) {
            System.out.println(e);
    }  
    
    return connection;
    }
    public void CreateTables(){
        
        try{
            Statement statment = runConnection().createStatement();
            statment.executeUpdate("CREATE TABLE IF NOT EXISTS game (id INTEGER Primary Key, name TEXT, points INTEGER)");
            System.out.println("Tabela criada");
         }
        catch(SQLException ex){
            System.out.println(ex);
         }
       
    
    }
  
}


