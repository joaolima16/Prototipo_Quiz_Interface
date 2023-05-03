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

/**
 *
 * @author João Vitor
 */
public class QuestionDAO {

    public void SelectQuestions() {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:quiz.db")) {
            String sql = "SELECT question,correctResponse,response FROM response r LEFT JOIN questions q ON q.id = r.id_question";
            PreparedStatement statment = conn.prepareStatement(sql);
            ResultSet rs = statment.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(3));  
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }
}
