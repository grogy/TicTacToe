package tictactoe.UI.Checker;

import tictactoe.Model.GameArea;
import tictactoe.Model.StateArray;

public interface CheckWin {
	public StateArray getWinner();
	
	public void setSizeForWin(int size);
	
	public void setArea(GameArea area);
}