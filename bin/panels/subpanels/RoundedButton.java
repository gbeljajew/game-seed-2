/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.panels.subpanels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author gbeljajew
 */
public class RoundedButton extends JButton
{
    
    private Color mainColor = Color.lightGray;
    private Color flashColor = Color.white;
    
    private final JLabel label;
    
    private Color color = mainColor;
    
    public RoundedButton(String text)
    {
        label = new JLabel(text);
        this.setLayout(new BorderLayout());
        this.add(label, BorderLayout.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        this.addMouseListener(new MouseAdapter() 
        {

            @Override
            public void mouseReleased(MouseEvent e) 
            {
                color = mainColor;
                super.mouseReleased(e);
            }

            @Override
            public void mousePressed(MouseEvent e) 
            {
                color = flashColor;
                super.mousePressed(e);
            }
            
        });
        
        
        
    }

    @Override
    public void paint(Graphics g)
    {
        Color c = g.getColor();
        g.setColor(Color.gray);
        g.fillRoundRect(2, 2, this.getWidth()-3, this.getHeight()-3, 5, 5);
        g.setColor(color);
        g.fillRoundRect(1, 1, this.getWidth()-3, this.getHeight()-3, 5, 5);
        g.setColor(c);
        
        this.paintChildren(g);
    }

    public void setMainColor(Color mainColor)
    {
        this.mainColor = mainColor;
    }

    public void setFlashColor(Color flashColor)
    {
        this.flashColor = flashColor;
    }
    
//    public void setTextColor(Color color)
//    {
//        label.setForeground(color);
//    }
//
//    @Override
//    public void setHorizontalTextPosition(int textPosition)
//    {
//        label.setHorizontalTextPosition(textPosition);
//    }
//
//    @Override
//    public void setVerticalTextPosition(int textPosition)
//    {
//        label.setVerticalTextPosition(textPosition);
//    }
//
//    @Override
//    public void setHorizontalAlignment(int alignment)
//    {
//        label.setHorizontalAlignment(alignment);
//    }
//
//    @Override
//    public void setText(String text)
//    {
//        label.setText(text);
//    }

    
    
    
    
}
