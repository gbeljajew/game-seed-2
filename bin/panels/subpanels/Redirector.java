/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.panels.subpanels;

import bin.panels.MainPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * standart ActionListener for Buttons, that only switch Screens
 * @author gbeljajew
 */
public class Redirector implements ActionListener
    {
        private final String direction;
        
        private final MainPanel mainPanel;

        public Redirector(String direction, MainPanel mainPanel)
        {
            this.direction = direction;

            this.mainPanel = mainPanel;
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            mainPanel.layout.show(mainPanel, direction);
        }
    }