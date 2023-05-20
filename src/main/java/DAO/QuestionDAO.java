/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.Questions;
import java.util.ArrayList;


public class QuestionDAO {

    public ArrayList<Questions> SelectQuestions() {
        ResultSet rs;
        String data_split[];
        ArrayList<Questions> lstQuestions = new ArrayList();
        
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:quiz.db")) {
            String sql = "SELECT question,correctResponse,response FROM response r LEFT JOIN questions q ON q.id = r.id_question";
            PreparedStatement statment = conn.prepareStatement(sql);
            rs = statment.executeQuery();
            while (rs.next()) {                
                String data = rs.getString(3);
                data_split = data.split(",");
                lstQuestions.add(new Questions(rs.getString(1),rs.getString(2), data_split));
            }
            
       } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lstQuestions;
    }
    
}
