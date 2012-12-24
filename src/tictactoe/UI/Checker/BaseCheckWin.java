package tictactoe.UI.Checker;

import tictactoe.Model.GameArea;
import tictactoe.Model.StateArray;

public class BaseCheckWin implements CheckWin {
	private GameArea area;
	
	private int size;
	
	@Override
	public void setArea(GameArea area) {
		this.area = area;
	}

	@Override
	public void setSizeForWin(int size) {
		this.size = size;
	}

	@Override
	public StateArray getWinner() {
		StateArray state;
		
		state = checkRow();
		if (state != StateArray.NONE)
			return state;
		
		state = checkColumn();
		if (state != StateArray.NONE)
			return state;
		
		state = checkTopDiagonal();
		if (state != StateArray.NONE)
			return state;
		
		state = checkDownDiagonal();
		if (state != StateArray.NONE)
			return state;
		
		
		return StateArray.NONE;
	}
	
	private StateArray checkRow() {
		StateArray prevState = null;
		int count;
		
		for (int y = 0; y < area.getSize(); y++) {
			count = 0;
			for (int x = 0; x < area.getSize(); x++) {
				if (prevState == area.getState(x, y)) {
					count++;
				} else {
					count = 0;
					prevState = area.getState(x, y);
				}
				if (count == size && prevState != StateArray.NONE)
					return prevState;
			}
			prevState = StateArray.NONE;
		}
		
		return StateArray.NONE;
	}
	
	private StateArray checkColumn() {
		StateArray prevState = null;
		int count;
		
		for (int x = 0; x < area.getSize(); x++) {
			count = 0;
			for (int y = 0; y < area.getSize(); y++) {
				if (prevState == area.getState(x, y)) {
					count++;
				} else {
					count = 0;
					prevState = area.getState(x, y);
				}
				if (count == size && prevState != StateArray.NONE)
					return prevState;
			}
			prevState = StateArray.NONE;
		}
		
		return StateArray.NONE;
	}
	
	private StateArray checkTopDiagonal() {
		// todo, dodelat
		
		StateArray prevState = null;
		int count;
		
		for (int y = 0; y < area.getSize(); y++) {
			count = 0;
			for (int x = 0; x < area.getSize(); x++) {
				if (prevState == area.getState(x, y)) {
					count++;
				} else {
					count = 0;
					prevState = area.getState(x, y);
				}
				if (count == size && prevState != StateArray.NONE)
					return prevState;
			}
			prevState = StateArray.NONE;
		}
		
		return StateArray.NONE;
	}
	
	private StateArray checkDownDiagonal() {
		return StateArray.NONE;
	}
}