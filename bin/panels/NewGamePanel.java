/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.panels;

import bin.game.GameInterface;
import bin.panels.subpanels.RoundedButton;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * here happens all presetings for Starting a new Game<br/>
 * 
 * @author gbeljajew
 */
public class NewGamePanel extends JPanel
{
   

    public NewGamePanel(final MainPanel mainPanel, final GameInterface game)
    {
        this.setLayout(null);
        JLabel label = new JLabel("NewGamePanel");
        label.setBounds(50, 50, 100, 20);
        this.add(label);
        
        int width = mainPanel.getPreferredSize().width;
        int high = mainPanel.getPreferredSize().height;
        
        final NewGamePanel ngp = this;
        
    //--------- Here Comes All Stuff for configuring new Game -------------
        
        
        
        
        
    //--------- Confirm and Back Buttons ---------------------------------
        
        RoundedButton confirm = new RoundedButton("Confirm");
        confirm.setBounds(width-120, high-90, 100, 30);
        this.add(confirm);
        confirm.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                game.newGame(ngp);
                mainPanel.menuPanel.showBackToGameButton();
                mainPanel.layout.show(mainPanel, MainPanel.GAME_PANEL);
            }
        });
        
        RoundedButton back = new RoundedButton("Back");
        back.setBounds(width-120, high-50, 100, 30);
        this.add(back);
        back.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                ngp.reset();
                mainPanel.layout.show(mainPanel, MainPanel.MENU_PANEL);
            }
        });
    }
    
    /**
     * resets all fields to default values
     */
    private void reset()
    {
        
    }
   
    
}
