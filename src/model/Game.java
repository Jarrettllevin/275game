package model;

import javax.swing.JPanel;
import javax.swing.KeyStroke;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.Serializable;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JFrame;

public class Game implements Serializable{
//	private static final long serialVersionUID = 1L;
	Player player;
	Board board;
	PossibleHazards ph;
	Color color;
	public static int FRAMEHEIGHT = 400;
	public static int FRAMEWIDTH = 400;
	public Game(Dimension screenSize){
		System.out.println("Generating game");
		player = new Player(30, 40, 10, 10, 200, 1, 1, 500, Tool.TRASH, State.NEUTRAL);
		player.setColor(color.MAGENTA);
		board =  new Board();
		ph = new PossibleHazards(75);
        ph.generateHazards(screenSize);
	}
	public void stop(){
		player = null;
		ph = null;
	}
	public Player getPlayer(){
		return this.player;
	}
	
	public  void setPlayer(Player player){
		this.player = player;
	}
	
	public PossibleHazards getPossibleHazards(){
		return this.ph;
	}
	
	public  void setPlayer(PossibleHazards ph){
		this.ph = ph;
	}
//    protected void bindKeyWith(String name, KeyStroke keyStroke, Action action) {
//        InputMap im = getInputMap(WHEN_IN_FOCUSED_WINDOW);
//        ActionMap am = getActionMap();
//        im.put(keyStroke, name);
//        am.put(name, action);
//    }
	public boolean isGameOver(){
		if(player.isSalOver()){
			System.out.println("Salt");
			return true;
		}
		else if(player.isSalUnder()){
			System.out.println("Salt");
			return true;
		}
		else if(player.getLife()<=0){
			System.out.println("Collision");
			return true;
		}
		return false;
	}
	
	public Board getBoard() {
		return this.board;
	}

	
//	public void update(int count){
////		if(k.keys[KeyEvent.VK_UP]){
////	        player.moveY(-1*player.getYvel());
////	    }
////
////	    if(k.keys[KeyEvent.VK_DOWN]){
////	    	player.moveY(player.getYvel());
////	    }
////
////	    if(k.keys[KeyEvent.VK_LEFT]){
////	    	player.moveX(-1*player.getXvel());
////	    }
////
////	    if(k.keys[KeyEvent.VK_RIGHT]){
////	    	player.moveX(-1*player.getXvel());
////	    }
//		
//		for(int i = 0; i<ph.getHazardsList().size(); i++){
//			//System.out.println("possible hazards");
//			if(ph.hazards.get(i).getSpawntime() <= count)
//			//System.out.println(ph.getpossibleHazards().size());
//			ph.getHazardsList().get(i).moveLeft();
//		}
////		player.moveX(player.getXvel());
////		player.moveY(player.getYvel());
//		double xsaltindexprep = player.getXpos()/((double)FRAMEWIDTH);
//		int xsaltindex = (int) (40*xsaltindexprep);
//		double ysaltindexprep = player.getYpos()/((double)FRAMEWIDTH);
//		int ysaltindex = (int) (20*ysaltindexprep);
//		player.setSaldelta(board.getTile(xsaltindex, ysaltindex));
//		System.out.print(xsaltindexprep+" ");
//		System.out.println(player.getXpos());
//		player.updateSalinity();
////		switch(board.getTile(xsaltindex, ysaltindex){
////		}
//		
//		onCollision();
//		repaint();
//	}
//	public static void main(String[] args) throws InterruptedException {
//        JFrame frame = new JFrame("Crab Game");
//        Game game = new Game();
//        frame.add(game);
//        frame.setSize(FRAMEWIDTH, FRAMEHEIGHT);
//        frame.setVisible(true);
//        frame.getContentPane().setBackground(Color.BLUE);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        int count = 0;
//        int trueCount = 0;
//        while (true) {
//        	count++;
//        	if(count%19900000 == 0) {
//        	trueCount++;
//        	game.update(trueCount);
//        	}
//        	//System.out.print(count);
//        }
//    }

}



