/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.panels;

import bin.game.GameInterface;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author gbeljajew
 */
public class MainPanel extends JPanel
{
    
    public static final String GAME_PANEL = "game"; 
    public static final String SAVE_PANEL = "save"; 
    public static final String LOAD_PANEL = "load"; 
    public static final String NEW_GAME_PANEL = "new"; 
    public static final String CREDIT_PANEL = "credit"; 
    public static final String TUTORIAL_PANEL = "tutorial"; 
    public static final String MENU_PANEL = "menu";
    public static final String OPTIONS_PANEL = "option";
    
    //-------------------------------
    
    GamePanel gamePanel;
    LoadPanel loadPanel;
    SavePanel savePanel;
    NewGamePanel newGamePanel;
    PanelWithTextPanel credits;
    PanelWithTextPanel tutorial;
    MainMenuPanel menuPanel;
    OptionsPanel optionsPanel;
    
    public final CardLayout layout = new CardLayout();
    
    
    

    private MainPanel(){}
    
    public static MainPanel create(Dimension size, GameInterface game)
    {
        MainPanel mp = new MainPanel();
        mp.setPreferredSize(size);
        
        mp.setLayout(mp.layout);
        
//----------Panels---------------------------------------------------------
        
        mp.menuPanel = new MainMenuPanel(mp, game);
        mp.menuPanel.setPreferredSize(size);
        mp.add(mp.menuPanel, MENU_PANEL);
        
        mp.gamePanel = new GamePanel(mp, game);
        mp.gamePanel.setPreferredSize(size);
        mp.add(mp.gamePanel, GAME_PANEL);
        
        mp.loadPanel = new LoadPanel(mp, game);
        mp.loadPanel.setPreferredSize(size);
        mp.add(mp.loadPanel, LOAD_PANEL);
        
        mp.savePanel = new SavePanel(mp, game);
        mp.savePanel.setPreferredSize(size);
        mp.add(mp.savePanel, SAVE_PANEL);
        
        mp.newGamePanel = new NewGamePanel(mp, game);
        mp.newGamePanel.setPreferredSize(size);
        mp.add(mp.newGamePanel, NEW_GAME_PANEL);
        
        mp.credits = new PanelWithTextPanel(mp, game);
        mp.credits.setPreferredSize(size);
        mp.add(mp.credits, CREDIT_PANEL);
        
        mp.tutorial = new PanelWithTextPanel(mp, game);
        mp.tutorial.setPreferredSize(size);
        mp.add(mp.tutorial, TUTORIAL_PANEL);
        
        mp.optionsPanel = new OptionsPanel(mp, game);
        mp.optionsPanel.setPreferredSize(size);
        mp.add(mp.optionsPanel, OPTIONS_PANEL);
        
//---------- ----------------------------------------------------------------
        
//        mp.layout.show(mp, MENU_PANEL);
        
        return mp;        
    }
    
    public boolean isGamePanelOn()
    {
        return gamePanel.isShowing();
    }
    
}
