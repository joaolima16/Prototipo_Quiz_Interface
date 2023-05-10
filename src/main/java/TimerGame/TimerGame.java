/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimerGame;
import java.util.TimerTask;
import java.util.Timer;
/**
 *
 * @author joao.vlgoncalves
 */
public class TimerGame {
        private int segundos = 0;
    private Timer timer;

    public void start() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                segundos++;
                System.out.println(segundos);
            }
        }, 0, 1000);
    }

    public void stop() {
        timer.cancel();
    }
}
