package teszt;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;



public class drawRobot extends JComponent {
    
    public int x = 50;
    public int y = 50;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(x, y, 50, 50);
        g.fillRect(x, y, 50, 50);
        g.setColor(Color.BLACK);
    }
    
    public void moveUp(){
        y = y - 15;
        repaint();
    }
    
    public void moveDown(){
        y = y + 15;
        repaint();
    }
    
    public void moveRight(){
        x = x + 15;
        repaint();
    }
    
    public void moveLeft(){
        x = x - 15;
        repaint();
    }
    
}
