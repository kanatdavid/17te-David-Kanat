/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleshipsjava;
import java.awt.*;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Graphics;

/**
 *
 * @author david.kanat
 */
public class MouseDemo extends Canvas implements MouseListener
{
    private Color curColor;
    private String curMessage;
    private boolean onTheFrame = false;
    
    public MouseDemo()
    {
        addMouseListener(this);
        
        curColor = Color.red;
        curMessage = "kvadraten är röd.";
    }
    
    public void Paint( Graphics g)
    {
        g.setColor(Color.black);
        g.setFont(Font.decode("Calibri-BOLD-24"));
        g.drawString(curMessage, 200, 50);
        
        g.setColor(curColor);
        g.fillRect(250, 100, 100, 100);
        if(onTheFrame)
        {
            g.setColor(Color.CYAN);
            g.fillRect(10, 10, 100, 100);
        }
    }
    
        public void mouseClicked( MouseEvent evt)
    {
        if(curColor == Color.green)
        {
            curColor = Color.red;
            curMessage = "Kvadraten är röd.";
        }
        else
        {
            curColor = Color.green;
            curMessage = "Kvadraten är grön.";
        }
        repaint();
    }
    
    public void mousePressed ( MouseEvent evt)
    {
    }
    
    public void mouseReleased ( MouseEvent evt)
    {
    }
    
     public void mouseEntered ( MouseEvent evt)
    {
        onTheFrame = true;
    }
    
     public void mouseExited ( MouseEvent evt)
    {
        onTheFrame = false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame win = new JFrame("MouseDemo");
        win.setSize(1100, 800);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new MouseDemo() );
        win.setVisible(true); 
        Paint(Graphics g);
    }
}
