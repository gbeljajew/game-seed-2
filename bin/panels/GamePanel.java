/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.panels;

import bin.game.GameInterface;
import bin.panels.subpanels.Redirector;
import bin.panels.subpanels.RoundedButton;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * this one contains main Game screen and some conntrollers on right side
 * @author gbeljajew
 */
public class GamePanel extends JPanel
{

    public GamePanel(final MainPanel mainPanel, final GameInterface game)
    {
        this.setLayout(null);
        JLabel label = new JLabel("GamePanel");
        label.setBounds(50, 50, 100, 20);
        this.add(label);
        
        int width = mainPanel.getPreferredSize().width;
        int high = mainPanel.getPreferredSize().height;
        
        
        
        
        RoundedButton back = new RoundedButton("Menu");
        back.setBounds(width-120, high-50, 100, 30);
        this.add(back);
        back.addActionListener(new Redirector(MainPanel.MENU_PANEL, mainPanel));
        
    }
    
}
