/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.panels;

import bin.game.GameInterface;
import bin.game.GameOptions;
import bin.panels.subpanels.Redirector;
import bin.panels.subpanels.RoundedButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author gbeljajew
 */
public class OptionsPanel extends JPanel
{
    private GameOptions options;

    public OptionsPanel(final MainPanel mainPanel, final GameInterface game)
    {
        this.setLayout(null);
        this.options=game.getOptions();
        this.resetChanges();
        
        
        JLabel label = new JLabel("OptionsPanel");
        label.setBounds(50, 50, 100, 20);
        this.add(label);
        
        
        
        int width = mainPanel.getPreferredSize().width;
        int high = mainPanel.getPreferredSize().height;
        
        
        
        
        
        //--------- Confirm and Back Buttons ---------------------------------
        
        RoundedButton confirm = new RoundedButton("Confirm");
        confirm.setBounds(width-120, high-90, 100, 30);
        this.add(confirm);
        confirm.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                confirmChanges();
                mainPanel.layout.show(mainPanel, MainPanel.MENU_PANEL);
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
                resetChanges();
                mainPanel.layout.show(mainPanel, MainPanel.MENU_PANEL);
            }
        });
    }
    
    /**
     * transfers all changes into options
     */
    private void confirmChanges()
    {
        
    }
    
    /**
     * sets all changes to those in options = resets all changes
     */
    private void resetChanges()
    {
        
    }
    
}
