package tictactoe.Controller;

import javax.swing.SwingUtilities;
import tictactoe.GUI.Window;

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
				guiWindow = new Window();
				guiWindow.setVisible(true);
			}
		});
	}
}
