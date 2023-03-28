/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Connection.ConnectionDB;
/**
 *
 * @author João Vitor
 */
public class GameDAO {
    ConnectionDB conn = new ConnectionDB();
    public boolean InsertUser(String name){
        try {
            String sqlUser = "SELECT * FROM game WHERE name=?";
            String sqlInsert = "INSERT INTO game(name,points)VALUES(?,0)";
            PreparedStatement prepared = conn.runConnection().prepareStatement(sqlUser);
            prepared.setString(1, name);
            ResultSet rs = prepared.executeQuery();
            if(rs.next()) {
                return false;   
            }
            else {
                prepared.closeOnCompletion();
                prepared = conn.runConnection().prepareStatement(sqlInsert);
                prepared.setString(1, name);
                prepared.executeUpdate();
                conn.runConnection().close();
                return true;
            }
           
           
            
            
        }
        catch(SQLException ex ){
            System.out.println(ex);
        }
        
        return false;
    }
    public boolean userExists(String user) {
    String sql = "SELECT * FROM game WHERE name=?";
    try {
        PreparedStatement statment = conn.runConnection().prepareStatement(sql);
        statment.setString(1, user);
        ResultSet rs = statment.executeQuery();
        if(rs.next()) {
            System.out.println("Usuário já existe");
            statment.closeOnCompletion();
            conn.runConnection().close();
            return true;
    }
        else{
            statment.close();
            conn.runConnection().close();
            return false;
    }
  
    }
    catch(SQLException ex ){
          System.out.println(ex);
    }
    return false;
    }
   public void updatePoints(String user) {

   }
    
}
