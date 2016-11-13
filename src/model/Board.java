package model;

import java.util.*;
/**
* Board is the array in which the characters and
* objects are placed. Attributes include:
* <ul>
* <li>The array that will represent the board
* <li>The player that is playing the game
* <li>
* </ul>
* @author Jarrett Levin
*/
public class Board{
	int[][] arr;
	int BOARDHEIGHT = 20;
	final int BOARDWIDTH = 40;
	
	/**
	 * This is a constructor for the Board class.
	 * It initializes the array to a 40x20 2d array,
	 * It initializes the player to a default Player,
	 * and initializes possiblehazards to a default
	 * PossibleHazards.
	 */
	public Board(){
		arr = new int[BOARDWIDTH][BOARDHEIGHT];
		for(int i=0; i<BOARDWIDTH; i++){
			for(int j=0; j<BOARDHEIGHT; j++){
				if(i<BOARDWIDTH/2){
					arr[i][j]=1;
					//System.out.println(j);
				}else{
					arr[i][j]=-1;
					
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	/** This method returns a part of the array given a coordinate
	 * @param x  the x coordinate of the specified tile
	 * @param y  The y coordinate of the specified tile
	 * @return String the specified file.
	 */
	public int getTile(int x, int y){
		return arr[x][y];
	}
}