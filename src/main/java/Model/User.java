/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author João Vitor
 */
public class User {
    private static String username;
    private static int Id;
    private static int points;
    

    public static int getId() {
        return Id;
    }

    public static void setId(int Id) {
        User.Id = Id;
    }
    public static void setUsername(String username) {
        User.username = username;
    }

    public static int getPoints() {
        return points;
    }

    public static void setPoints(int points) {
        User.points = points + 10;
    }

    public static String getUsername() {
        return username;
    }

}
