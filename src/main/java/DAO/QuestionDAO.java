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

/**
 *
 * @author João Vitor
 */
public class QuestionDAO {

    public ArrayList<Questions> SelectQuestions() {
        ResultSet rs = null;
        ArrayList<Questions> lstQuestions = new ArrayList();
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:quiz.db")) {
            String sql = "SELECT question,correctResponse,response,teste FROM response r LEFT JOIN questions q ON q.id = r.id_question";
            PreparedStatement statment = conn.prepareStatement(sql);
            rs = statment.executeQuery();
            while (rs.next()) {
                ArrayList arrResponses = new ArrayList();
                int cont;

               System.out.println(rs.getString(4));
                JSO
                for (cont = 0; cont <= 2; cont++) {
                    arrResponses.add(rs.getString(3));
                }
                // arrResponses.forEach(e -> System.out.println(e));
                lstQuestions.add(new Questions(rs.getString(1), rs.getString(2), arrResponses));

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lstQuestions;
    }
}
