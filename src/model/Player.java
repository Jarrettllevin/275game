package model;

import java.awt.Rectangle;

public class Player extends Movers{
	 int salinity ;
	 int salmin ;
	 int salmax ;
	 int saldelta;
	 Tool tool;
	 int life ; 
	 State state;
	 
	 public Player(int xpos, int ypos, int xvel, int yvel, int salinity, int saldelta, int salmin, int salmax, Tool tool, State state) {
			super(xpos, ypos, xvel, yvel);
			this.salinity = salinity;
			this.saldelta = saldelta;
			this.salmin = salmin;
			this.salmax = salmax;
			this.tool = tool;
			this.state = state;
			this.life=3;
	 }
	
	 public int getSaldelta() {
		return saldelta;
	}

	public void setSaldelta(int saldelta) {
		this.saldelta = saldelta;
	}

	public int getXpos() {
		return xpos;
	}

	public void setXpos(int xpos) {
		this.xpos = xpos;
	}
	
	public Rectangle getBounds(){
		return new Rectangle(xpos,ypos,30,30);
	}

	public int getYpos() {
		return ypos;
	}

	public boolean isSalOver(){
		return salinity>salmax;
	}
	public boolean isSalUnder(){
		return salinity<salmin;
	}
	public void loseLife(){
		life-=1;
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

	public int getSalinity() {
		return salinity;
	}

	public void setSalinity(int salinity) {
		this.salinity = salinity;
	}

	public int getSalmin() {
		return salmin;
	}

	public void setSalmin(int salmin) {
		this.salmin = salmin;
	}

	public int getSalmax() {
		return salmax;
	}

	public void setSalmax(int salmax) {
		this.salmax = salmax;
	}

	public Tool getTool() {
		return tool;
	}

	public void setTool(Tool tool) {
		this.tool = tool;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void updateSalinity(){
		salinity += saldelta;
	}
	
	
	/**@author Jeanine
	 * Subtracts 1 from Life. if Life is 0 do not subtract.
	 */
	public void LoseLife(){
		state = State.JUSTHIT;
	   if (life == 0){
		   return;
	   }
	   else{
		   life -= 1; 
	   }}
	 
	
	/**@author Jeanine
	 * 
	 * changes the state of the player to invincible
	 */
	 public void Invincibility(){
		 state = State.INVINCIBLE;		 
		 
	 }
	 
	 /**@author Jeanine
		 * changes state of the player to be in speedup mode
		 */
	 public void SpeedUp(){
		state = State.SPEEDUP;
		xvel = 20;
		yvel = 20;
		//System.out.println(xvel + " hi");
		//will put actual speeding up in the board?
		 
	 }
	 
	 /**@author Jeanine
		 * changes the tool depending on what it is, will cycle through it.
		 */
	 public void SwitchTool(){
		 switch(tool){
		 	case TRASH: tool = Tool.RECYCLE;
		 	break;
		 	
		 	case RECYCLE: tool = Tool.COMPOST;
		 	break;
		 	
		 	case COMPOST: tool = Tool.TRASH;
		 	break;
		 }
	 }
		 
	 }

	
	
