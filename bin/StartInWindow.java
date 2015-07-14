/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin;

import bin.game.GameInterface;
import bin.game.GameManager;
import bin.panels.MainPanel;
import bin.panels.subpanels.GameScreen;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *there is no need to change this class
 * it is used only for starting game
 * 
 * you can change TIMER_DELAY to change FPS
 * 
 * FPS = 1000/TIMER_DELAY;
 * 
 * @author gbeljajew
 */
public class StartInWindow {

    private static final int TIMER_DELAY = 20;
    private static final int SCREEN_WIDTH = 800;
    private static final int SCREEN_HIGH = 600;
    
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("titel comes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        final GameInterface game = GameManager.createInstance();
        
        final MainPanel panel = MainPanel.create(new Dimension(SCREEN_WIDTH, SCREEN_HIGH), game);
        
        frame.add(panel);
        
        frame.pack();
        frame.setLocationRelativeTo(null);
        
        Timer t = new Timer(TIMER_DELAY, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                
                if(game.isGameRunning() && panel.isGamePanelOn())
                    game.update();
                
                panel.repaint();
            }
        });
        
        frame.setVisible(true);
        
        t.start();
    }
    
}
