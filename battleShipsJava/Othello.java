/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleshipsjava;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author david.kanat
 */

public class Othello extends Canvas implements MouseListener{
    
    static private int width = 850;
    static private int height = 850;
    static private int boxSize = 85;
    static int plan[][] = new int[10][10];
    static int currentPlayer = 1;
    
    public Othello()
    {
        addMouseListener(this);
    }
    
    @Override
    public void paint(Graphics g)
    {
        int squareWidth = width / 10 - 2;
        int squareHeight = height / 10 - 2;
        g.setColor(Color. GREEN);
        
        for(int i = 0; i<10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                int posX = i * width / 10 + 1;
                int posY = j * height / 10 + 1;
                
                switch (plan[i][j]) {
                    case 0:
                        g.setColor(Color.GREEN);
                        g.fill3DRect(posX, posY, squareWidth, squareHeight,  false);
                        break; 
                    case 1:
                        g.setColor(Color.WHITE);
                        g.fill3DRect(posX, posY, squareWidth, squareHeight, true);
                        break;
                    case 2:
                        g.setColor(Color.BLACK);
                        g.fill3DRect(posX, posY, squareWidth, squareHeight, true);
                        break;
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame win = new JFrame("Othello");
        win.setSize(width+24, height+57);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for (int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                plan[i][j] = 0;
            }
        }
        plan[4][4] = 2;
        plan[5][5] = 2;
        plan[4][5] = 1;
        plan[5][4] = 1;
        Othello canvas = new Othello();
        win.add (canvas);
        win.setVisible(true);
    }
    
    
    
    @Override
    public void mouseClicked(MouseEvent me) {
        int posX = me.getX();
        int posY = me.getY();
        int gridPosX = posX / boxSize;
        int gridPosY = posY / boxSize;
         if (plan[gridPosX][gridPosY] == 0 && checkSurroundings(gridPosX, gridPosY) > 0) 
         {
            plan[gridPosX][gridPosY] = currentPlayer;
             if (currentPlayer == 1)
             {
                 currentPlayer = 2;
             }
             else if(currentPlayer == 2)
             {
                 currentPlayer = 1;
             }
         }

        System.out.println(posX + "." + posY);
        repaint();
        System.out.println("posX:" + posX + ", " + "posY:" + posY);
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    } 

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
    private int checkSurroundings(int posX, int posY)
    {
        int surroundings = 0;
        for (int x = posX - 1; x <= posX + 1; x++)
        {
            for(int y = posY - 1; y <= posY + 1; y++)
            {
                if(!(x == posX && y == posY))
                {
                    try
                    {
                        if (plan[x][y] > 0)
                        {
                            surroundings++;
                        }
                    }
                    catch (Exception e) {
                        
                    }
                }
            }
        }
        return surroundings;
    }
    
        private int checkneighbors(int posX, int posY)
    {
        int chechneghbors = 0;
        for (int x = posX - 1; x <= posX + 1; x++)
        {
            for(int y = posY - 1; y <= posY + 1; y++)
            {
                if(!(x == posX && y == posY))
                {
                    try
                    {
                        if (plan[x][y] > 0)
                        {
                            
                            chechneghbors++;
                        }
                    }
                    catch (Exception e) {
                        
                    }
                }
            }
        }
        return chechneghbors;
    }
}
