/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.panels;

import bin.game.GameInterface;
import bin.panels.subpanels.Redirector;
import bin.panels.subpanels.RoundedButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author gbeljajew
 */
public class SavePanel extends JPanel
{
    private Path path;
    public SavePanel(final MainPanel mainPanel, final GameInterface game)
    {
        this.setLayout(null);
        JLabel label = new JLabel("SavePanel");
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
                game.saveGame(path);
                
                mainPanel.layout.show(mainPanel, MainPanel.MENU_PANEL);
            }
        });
        
        RoundedButton back = new RoundedButton("Back");
        back.setBounds(width-120, high-50, 100, 30);
        this.add(back);
        back.addActionListener(new Redirector(MainPanel.MENU_PANEL, mainPanel));
        
    }
    
}
