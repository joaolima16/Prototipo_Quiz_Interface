/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Connection.ConnectionDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 *
 * @author João Vitor
 */
public class GameDAO {

    public boolean InsertUser(String name){
        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:quiz.db")) {
            String sqlInsert = "INSERT INTO game(name,points)VALUES(?,0)";
            PreparedStatement insertSmt = conn.prepareStatement(sqlInsert);
            boolean teste = userExists(name);
            
            if(teste !=true) {
                    insertSmt = conn.prepareStatement(sqlInsert);
                    insertSmt.setString(1, name);
                    insertSmt.executeUpdate();
                    System.out.println("Usuário adicionado! ");
                    return false;   
            }
            else { 
                conn.close();
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
    try(Connection conn = DriverManager.getConnection("jdbc:sqlite:quiz.db")){
        PreparedStatement statment = conn.prepareStatement(sql);
        statment.setString(1, user);
        ResultSet rs = statment.executeQuery();
        if(rs.next()) {
                System.out.println("Usuário já existe");
                statment.closeOnCompletion();
                conn.close();
                return true;
    }
        else{
            statment.close();
            conn.close();
            return false;
    }
  
    }
    catch(SQLException ex ){
          System.out.println(ex);
    }
    return false;
    }
   public void updatePoints(String user) {
        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:quiz.db")) {
          String sql = "SELECT * FROM game WHERE name=?";
          PreparedStatement stmtSelect = conn.prepareStatement(sql);
          PreparedStatement stmtInsert = conn.prepareStatement(sql);
          stmtSelect.setString(1, user);
          ResultSet rs = stmtSelect.executeQuery();
          while(rs.next()){
            User.setId(rs.getInt(1));
            User.setUsername(rs.getString(2));
            User.setPoints(rs.getInt(3));
            System.out.println(User.getId());
            System.out.println(User.getUsername());
            User.setPoints(rs.getInt(3));
                 System.out.println(User.getPoints());
          }
        }
        catch(SQLException ex) {
        
        
        }
   }
    
}
