/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package system;
import gui.FormTiket;

/**
 *
 * @author bananalemon
 */

public class Main implements Runnable {
    public static void main(String[] args) {
        Main app_runner = new Main();
        Thread thread = new Thread(app_runner);
        thread.start();
    }
    
    @Override
    public void run() {
        FormTiket frame = new FormTiket();
        frame.setVisible(true);
    }
}