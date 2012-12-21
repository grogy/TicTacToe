package tictactoe.Controller;

import javax.swing.SwingUtilities;
import tictactoe.GUI.Window;

public class GameAutomat {
	private StateApplication state = StateApplication.START;

	public void run() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Window w = new Window();
				w.setVisible(true);
			}
		});
	}
}
