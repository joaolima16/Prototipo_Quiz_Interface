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
import org.json.JSONObject;


public class QuestionDAO {

    public ArrayList<Questions> SelectQuestions() {
        ResultSet rs = null;
        ArrayList<Questions> lstQuestions = new ArrayList();
        JSONObject jsonObject = new JSONObject();
        ArrayList arrResponses = new ArrayList();  
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:quiz.db")) {
            String sql = "SELECT question,correctResponse,response,teste FROM response r LEFT JOIN questions q ON q.id = r.id_question";
            PreparedStatement statment = conn.prepareStatement(sql);
            rs = statment.executeQuery();
            int cont =0;
            while (rs.next()) {                
                jsonObject.put("respostas",rs.getString(3));
                arrResponses.add(rs.getString(2));
                if(cont %3 ==0){
                    lstQuestions.add(new Questions(rs.getString(1), rs.getString(2), arrResponses));
                    arrResponses.clear();
                }
                 cont++;
            }
              String teste = jsonObject.toString();
              System.out.println(teste);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lstQuestions;
    }
}
