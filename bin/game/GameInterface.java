/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.game;

import bin.panels.subpanels.GameScreen;
import bin.panels.NewGamePanel;
import java.awt.Graphics2D;
import java.nio.file.Path;

/**
 *
 * @author gbeljajew
 */
public interface GameInterface 
{
    /**
     * creates a new Game
     * @param ngp a JPanel in which all setings for new Game are made.
     */
    public void newGame(NewGamePanel ngp);
    
    /**
     * saves GameSessionData<br/>
     * make sure everithing worth saving is in there 
     * and everything, that should be not saved, is not
     * @param path Path to save file
     */
    public void saveGame(Path path);
    
    /**
     * loads GameSessionData
     * @param path Path to save file
     */
    public void loadGame(Path path);
    
    /**
     * GameOptions for OptionsMenuPanel
     * @return 
     */
    public GameOptions getOptions();
    
    /**
     * here happens drawing for Game but only for Game screen<br/>
     * all other drawings makes swing. 
     * @param g 
     */
    public void draw(Graphics2D g);
    
    /**
     * this method is the inside of main loop.<br/>
     * contains all game logic.
     */
    public void update();
    
    /**
     * should be called before calling update()
     * @return true if Game is running<br/>
     * false if Game is paused.
     */
    public boolean isGameRunning();
    
    /**
     * sometime you want or need to use some Game Resourcess in some Panels <br/>
     * f.e in NewGamePanel<br/>
     * with this method you can get them in Fabric from MainPanel.
     * @return 
     */
    public GameResources getResources();
    
    
}
