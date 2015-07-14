/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.panels.subpanels;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 * this one is main Game screen
 * @author gbeljajew
 */
public class GameScreen extends JPanel
{
    
    public GameScreen() 
    {
        
    }
    
    @Override
    public void paint(Graphics g1) 
    {
        Graphics2D g = (Graphics2D)g1;
        
        g.drawLine(0, 0, this.getWidth(), this.getHeight());
        g.drawLine(0, this.getHeight(), this.getWidth(), 0);
        
    }
    
    
    
}
