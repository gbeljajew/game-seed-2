/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.game;

import bin.panels.NewGamePanel;
import com.sun.org.apache.regexp.internal.RESyntaxException;
import java.awt.Graphics2D;
import java.nio.file.Path;

/**
 * minimal implementation of GameInterface<br/>
 * 
 * @author gbeljajew
 */
public class GameManager implements GameInterface
{
    
    protected GameOptions options;      // in there are all options for Game
    
    protected GameResources resources;  //every resource your Game has should be there
    
    protected GameSessionData game;     //everything that need to be saved has to be in there.
    
    protected boolean running=true;    //
    
    
    

    private GameManager(){} // use Fabric
    
    public static GameManager createInstance()
    {
        GameManager gm = new GameManager();
        
        
        
        
        return gm;
    }

    @Override
    public void saveGame(Path path) 
    {
        
    }

    @Override
    public void loadGame(Path path) 
    {
        
    }

    @Override
    public void newGame(NewGamePanel ngp) 
    {
        
    }

    @Override
    public GameOptions getOptions() 
    {
        return options;
    }

    @Override
    public void draw(Graphics2D g) 
    {
        
    }

    @Override
    public void update()
    {
        System.out.println("works");
    }

    @Override
    public boolean isGameRunning()
    {
        return running;
    }

    @Override
    public GameResources getResources()
    {
        return resources;
    }
    
}
