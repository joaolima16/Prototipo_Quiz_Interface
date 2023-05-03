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
    private String username;
    private int Id;
    private int points;
    
    public User(String username, int id, int points ){
    setUsername(username);
    setId(id);
    setPoints(points);
    
    }
    public  int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points + 10;
    }

    public String getUsername() {
        return username;
    }
    @Override 
    public String toString(){
    return "Usuário" + getUsername() + "pontos:" + getPoints();
    }

}
