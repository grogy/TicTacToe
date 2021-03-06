package tictactoe.Model;

public class GameArea {
	private int size;
	
	private StateArray[][] area;
	
	private Player actualPlayer;
	
	public GameArea(int size) {
		this.size = size;
		actualPlayer = Player.X;
		
		inicialeArea();
	}
	
	private void inicialeArea()
	{
		area = new StateArray[size][size];

		for (int x = 0; x < size; x++) {
			for (int y = 0; y < size; y++) {
				area[x][y] = StateArray.NONE;
			}
		}
	}
	
	public int getSize()
	{
		return size;
	}
	
	public boolean setArea(int x, int y)
	{
		if (area[x][y] != StateArray.NONE)
			return false;
		
		switch (actualPlayer) {
			case O:
				area[x][y] = StateArray.O;
				break;
			case X:
				area[x][y] = StateArray.X;
				break;
		}
		return true;
	}
	
	public String getCharOfArea(int x, int y)
	{
		switch (actualPlayer) {
			case O:
				return "O";
			case X:
				return "X";
		}
		return "";
	}
	
	public void changePlayer()
	{
		if (actualPlayer == Player.O)
			actualPlayer = Player.X;
		else
			actualPlayer = Player.O;
	}
}
