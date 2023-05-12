/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.User;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author João Vitor
 */
public class UserDAO {

    public boolean InsertUser(String name) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:quiz.db")) {
            String sqlInsert = "INSERT INTO game(name,points)VALUES(?,0)";
            PreparedStatement insertSmt = conn.prepareStatement(sqlInsert);
            boolean userExists = userExists(name);

            if (userExists != true) {
                insertSmt = conn.prepareStatement(sqlInsert);
                insertSmt.setString(1, name);
                insertSmt.executeUpdate();
                System.out.println("Usuário adicionado! ");
                return false;
            } else {
                conn.close();
                return true;
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return false;
    }

    public boolean userExists(String user) {
        String sql = "SELECT * FROM game WHERE name=?";

        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:quiz.db")) {
            PreparedStatement statment = conn.prepareStatement(sql);
            statment.setString(1, user);
            ResultSet rs = statment.executeQuery();
            if (rs.next()) {
                System.out.println("Usuário já existe");
                statment.closeOnCompletion();
                conn.close();
                return true;
            } else {
                statment.close();
                conn.close();
                return false;
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    public void updatePoints(String user) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:quiz.db")) {
            String sql = "SELECT * FROM game WHERE name=?";
            String sqlUpdate = "UPDATE game SET points =? WHERE name = ?";
            PreparedStatement stmtSelect = conn.prepareStatement(sql);
            PreparedStatement stmtUpdate = conn.prepareStatement(sqlUpdate);
            stmtSelect.setString(1, user);
            ResultSet rs = stmtSelect.executeQuery();
            User userGame = new User();

            while (rs.next()) {
                userGame.setId(rs.getInt(1));;
                userGame.setUsername(rs.getString(2));
                userGame.setPoints(rs.getInt(3));

            }
            stmtUpdate.setInt(1, userGame.getPoints());
            stmtUpdate.setString(2, userGame.getUsername());
            stmtUpdate.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro na aplicação: " + ex.getMessage());
        }
    }

    public ResultSet rankUsers() {
        String sql = "SELECT * FROM game ORDER BY points DESC";
        ResultSet rs;
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:quiz.db")) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            return rs;

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro na aplicação: " + ex.getMessage());

        }
        return rs = null;
    }
}