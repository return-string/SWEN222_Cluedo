package ui;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import game.ActingOutOfTurnException;
import game.Game;
import java.util.EventListener;

public class Controller implements ActionListener, EventListener {
	
	private Game cluedoGame;
	private CluedoFrame gameFrame;
	
	public Controller(CluedoFrame gameFrame){
		this.gameFrame = gameFrame;
	}
	
	public void startGame(Set<String> players){
		this.cluedoGame = new Game(players);
	}
	
	public void nextTurn(){
		gameFrame.nextTurn();
	}
	
	public void repaintBoard(Graphics g){
		if(cluedoGame != null){
			cluedoGame.repaintBoard(g);
		}
	}
	
	public void testHypothesis(Set<String> hypothesis){
		if(cluedoGame != null){
			try {
				cluedoGame.testHypothesis(hypothesis);
			} catch (ActingOutOfTurnException e) {
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("New Game")){
			gameFrame.showGameSetup();
		}
		if(e.getActionCommand().equals("Rules")){
			gameFrame.showRules();
		}
		if(e.getActionCommand().equals("Exit")){
			gameFrame.dispose();
		}
		if(e.getActionCommand().equals("Roll Dice")){
			if(cluedoGame != null){
				cluedoGame.rollDice();
			}
		}
	}
        
        @Override
        public void 
	
	public boolean checkGameState(){
		if(cluedoGame != null){
			return cluedoGame.isPlaying();
		}
		return true;
	}

}
