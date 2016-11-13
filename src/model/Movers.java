package model;

import java.awt.Color;

public class Movers {
	 int xpos;
	 int ypos;
	 int xvel;
     int yvel;
     Color color;

	Movers(int xpos, int ypos, int xvel, int yvel){
		this.xpos = xpos;
		this.ypos= ypos;
		this.xvel= xvel;
		this.yvel = yvel;
	}

	 public int getXpos() {
		return xpos;
	}

	public void setXpos(int xpos) {
		this.xpos = xpos;
	}

	public int getYpos() {
		return ypos;
	}

	public void setYpos(int ypos) {
		this.ypos = ypos;
	}

	public int getXvel() {
		return xvel;
	}

	public void setXvel(int xvel) {
		this.xvel = xvel;
	}

	public int getYvel() {
		return yvel;
	}

	public void setYvel(int yvel) {
		this.yvel = yvel;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return this.color;
	}


   /**
    * moveX updates the x position with the given velocity
   @author Jeanine
 * @param vel
 * an int that represents the velocity that you want the x position to move at
 * @return xpos
 */
public void moveX(int vel){
    xpos+= vel;
   }
	
   /**
    * moveY updates the Y position with the given velocity
    * @author Jeanine
 * @param vel
 * an int that represents the velocity that you want the Y position to move at
 * @return ypos
 */
public void moveY(int vel){
	 ypos+= vel;
   }

}
