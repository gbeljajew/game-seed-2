/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.panels;

import bin.game.GameInterface;
import bin.panels.subpanels.ButtonPanel;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author gbeljajew
 */
public class MainMenuPanel extends JPanel
{
    ButtonPanel buttons;
    public MainMenuPanel(MainPanel mainPanel, GameInterface game)
    {
        this.setLayout(null);
        this.setPreferredSize(mainPanel.getPreferredSize());
        
        JLabel label = new JLabel("MainMenuPanel");
        label.setBounds(50, 50, 100, 20);
        this.add(label);
        
        
        buttons = new ButtonPanel(mainPanel, game);
        this.add(buttons);
        
    }
    
    
    void showBackToGameButton()
    {
        buttons.showBackToGameButton();
    }
    
    
    
    
    
}
