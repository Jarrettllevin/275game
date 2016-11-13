package test;

import static org.junit.Assert.*;

import java.awt.Dimension;

import org.junit.Test;

import model.Game;
import model.Player;
import model.State;
import model.Tool;

public class testGame {

	@Test
	public void testStop() {
		Dimension d = new Dimension();
		Game tgame = new Game(d);
		Player tplayer = new Player(20, 20, 5, 5, 15, 4, 10, 20, Tool.TRASH, State.NEUTRAL);
		tgame.setPlayer(tplayer);
		assertEquals(tgame.getPlayer().getSalinity(), tplayer.getSalinity());
		tgame.stop();
		assertEquals(tgame.getPlayer(), null);
	}
	@Test
	public void testIsGameOver(){
		Dimension d = new Dimension();
		Game tgame = new Game(d);
		for(int i=0; i<3; i++){
			tgame.getPlayer().loseLife();
		}
		assertTrue(tgame.isGameOver());
		tgame.getPlayer().setLife(3);
		assertFalse(tgame.isGameOver());
		tgame.getPlayer().setSalinity(tgame.getPlayer().getSalmax()+1);
		assertTrue(tgame.isGameOver());
		tgame.getPlayer().setSalinity(tgame.getPlayer().getSalmin()+1);
		assertFalse(tgame.isGameOver());
		tgame.getPlayer().setSalinity(tgame.getPlayer().getSalmin()-1);
		assertTrue(tgame.isGameOver());
	}

}