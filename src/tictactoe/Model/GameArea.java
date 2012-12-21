package tictactoe.Model;

public class GameArea {
	private int size;
	
	private StateArray[][] area;
	
	public GameArea(int size) {
		this.size = size;
		
		inicialeArea();
	}
	
	private void inicialeArea()
	{
		area = new StateArray[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				area[i][j] = StateArray.NONE;
			}
		}
	}
	
	public int getSize()
	{
		return size;
	}
}
