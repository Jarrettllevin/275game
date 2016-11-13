package model;

import java.awt.Color;
import java.awt.Rectangle;

public class Hazard extends Movers{
  int spawntime;
  HazardType type;
  MovementType movementType;
  

  
  
  public Hazard(int xpos, int ypos, int xvel, int yvel, int spawntime, MovementType hazardMovementType) {
	super(xpos, ypos, xvel, yvel);
	this.spawntime = spawntime;
	this.movementType = hazardMovementType;
	color = Color.BLACK;
}


public int getSpawntime() {
	return spawntime;
}

public Rectangle getBounds(){
	Rectangle r = new Rectangle(xpos,ypos,20,20);
	return r;
}


public void setSpawntime(int spawntime) {
	this.spawntime = spawntime;
}

public HazardType getType(){
	return this.type;
}

public void setType(HazardType hazardType){
	this.type = hazardType;
}


/**
 * Moves the hazard object one unit to the left in the game.
 
 */
 
public void move(){
	switch(movementType){
	case ENEMYMOVE:
		this.xpos = xpos-xvel;
	  	double y = Math.sin(xpos/5)*(-25);
	  	this.ypos = ((int)y)+ypos;
		break;
	case LEFT:
		this.xpos = xpos-1;
		break;
	case COLLIDEDUP:
		this.xpos = xpos+5;
		this.ypos = ypos-1;
		break;
	case COLLIDEDDOWN:
		this.xpos = xpos+5;
		this.ypos = ypos+1;
	case RIGHT:
		this.xpos = xpos+1;
		break;
	}
  }
 
public int getxpos() {
	return xpos;
}
public void setxpos(int xpos) {
	this.xpos = xpos;
	super.setXpos(xpos);
}
public int getypos() {
	return ypos;
}
public void setypos(int ypos) {
	this.ypos = ypos;
	super.setYpos(ypos);
}
public int getxvel() {
	return xvel;
}
public void setxvel(int xvel) {
	this.xvel = xvel;
}
public int getyvel() {
	return yvel;
}
public void setyvel(int yvel) {
	this.yvel = yvel;
}
/**
 * Increase the xvel of the hazard by the specified integer increment.
 * @param increment the amount the velocity is increased
 */
public void increasexvel(int increment){
  	xvel = xvel + increment;
  }

public MovementType getMovementType(){
	return this.movementType;
}

public void setMovementType(MovementType newMovementType){
	this.movementType = newMovementType;
}


public PowerupType getPowerupType() {
	// TODO Auto-generated method stub
	return null;
}




}

