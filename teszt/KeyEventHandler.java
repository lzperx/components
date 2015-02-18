/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teszt;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author andri_000
 */
class KeyEventHandler extends JFrame implements KeyListener {
    
    public drawRobot robot;
    
    public KeyEventHandler(){
        this.robot = new drawRobot();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode()== e.VK_W){
            robot.moveUp();
        }
        if (e.getKeyCode() == e.VK_D){
            robot.moveRight();
        }
        if (e.getKeyCode() == e.VK_A){
            robot.moveLeft();
        }
        if (e.getKeyCode() == e.VK_S){
            robot.moveDown();
        }
    }
    
}
