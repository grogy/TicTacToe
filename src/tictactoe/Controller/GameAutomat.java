package tictactoe.Controller;

import javax.swing.SwingUtilities;
import tictactoe.GUI.Window;
import tictactoe.Model.GameArea;

public class GameAutomat {
	private StateApplication state = StateApplication.START;
	
	private Window guiWindow;

	public void run() {
		switch (state) {
			case START:
				createWindow();
				state = StateApplication.PLAY_X;
				break;
		}
	}
	
	private void createWindow()
	{
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				GameArea area = new GameArea(10);
				guiWindow = new Window(area);
				guiWindow.setVisible(true);
			}
		});
	}
}
