package tictactoe;

import tictactoe.Controller.GameAutomat;

public class TicTacToe {
	public static int sizeGame = 10;
	
	public static int buttonSize = 25;
	
	public static void main(String[] args) {
		GameAutomat game = new GameAutomat();
		game.run();
	}
}