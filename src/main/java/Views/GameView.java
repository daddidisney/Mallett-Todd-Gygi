/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import app.Main;
/**
 *
 * @author hiramtodd
 */
public class GameView extends View{
    
    public GameView(){
        super(Main.getCharacter().getName() + ", please enter the name of your game: ");
    }
    
    @Override
    public boolean doAction(String input){
        Main.getGame().setName(input);
        
        SelectTeamView selectTeamView = new SelectTeamView();
        selectTeamView.display();
        
        return true;
    }    
}
