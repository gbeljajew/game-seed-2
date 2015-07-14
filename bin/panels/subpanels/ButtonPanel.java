/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.panels.subpanels;

import bin.game.GameInterface;
import bin.panels.MainPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author gbeljajew
 */
public class ButtonPanel extends JPanel
{
    private final MainPanel mainPanel;
    private final CardLayout layout;
    private final GameInterface game;
    
    RoundedButton backToGame, newGame, saveGame, loadGame, options, tutorial, credits, exit;
    
    
    
    

    public ButtonPanel(final MainPanel mainPanel, GameInterface game)
    {
        this.mainPanel = mainPanel;
        this.layout = mainPanel.layout;
        this.game = game;
        
        this.setBounds( ((mainPanel.getPreferredSize().width-260)/2) , ((mainPanel.getPreferredSize().height-440)/2), 260, 440 );
        
        this.setLayout(null);
        
//---------- Buttons --------------------------------------------------
        
//---------- Back to Game ---------------------------------------------
        backToGame = new RoundedButton("Back to Game");
        backToGame.setBounds(30, 30, 200, 30);
        this.add(backToGame);
        backToGame.addActionListener(new Redirector(MainPanel.GAME_PANEL,mainPanel));
        backToGame.setVisible(false);
        
//---------- New Game -------------------------------------------------       
        newGame = new RoundedButton("New Game");
        newGame.setBounds(30, 80, 200, 30);
        this.add(newGame);
        newGame.addActionListener(new Redirector(MainPanel.NEW_GAME_PANEL,mainPanel));
        
//---------- Save Game ------------------------------------------------
        saveGame = new RoundedButton("Save");
        saveGame.setBounds(30, 130, 200, 30);
        this.add(saveGame);
        saveGame.addActionListener(new Redirector(MainPanel.SAVE_PANEL,mainPanel));
        
//---------- Load Game -------------------------------------------------
        loadGame = new RoundedButton("Load");
        loadGame.setBounds(30, 180, 200, 30);
        this.add(loadGame);
        loadGame.addActionListener(new Redirector(MainPanel.LOAD_PANEL, mainPanel));

//---------- Options -------------------------------------------------        
        options = new RoundedButton("Options");
        options.setBounds(30, 230, 200, 30);
        this.add(options);
        options.addActionListener(new Redirector(MainPanel.OPTIONS_PANEL, mainPanel));
        
//---------- Tutorial -------------------------------------------------        
        tutorial = new RoundedButton("Tutorial");
        tutorial.setBounds(30, 280, 200, 30);
        this.add(tutorial);
        tutorial.addActionListener(new Redirector(MainPanel.TUTORIAL_PANEL, mainPanel));
        
//---------- Credits -------------------------------------------------
        credits = new RoundedButton("Credits");
        credits.setBounds(30, 330, 200, 30);
        this.add(credits);
        credits.addActionListener(new Redirector(MainPanel.CREDIT_PANEL, mainPanel));
        
//---------- Exit -------------------------------------------------
        exit = new RoundedButton("Exit");
        exit.setBounds(30, 380, 200, 30);
        this.add(exit);
        exit.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        
    }
    
    public void showBackToGameButton()
    {
        backToGame.setVisible(true);
    }
    
    
    /**
     * this is an Standart ActionListener for Buttons, that switch to another
     * Screen without doing anything
     */
    
    
}
