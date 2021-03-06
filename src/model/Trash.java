package model;

import java.awt.Color;

public class Trash extends Hazard{
	Tool type;
	Color color;
	public Trash(int xpos, int ypos, int xvel, int yvel, int spawntime, Tool type) {
		super(xpos, ypos, xvel, yvel, spawntime, MovementType.LEFT);
		this.setType(HazardType.TRASH);
		this.type = type;
		this.color = Color.GREEN;
	}
	public Tool getToolType() {
		return type;
	}
	public void setType(Tool type) {
		this.type = type;
	}
	
	@Override
	public Color getColor() {
		return this.color;
	}
	
}
