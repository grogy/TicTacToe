package tictactoe;

import javax.swing.SwingUtilities;
import tictactoe.GUI.Window;

public class TicTacToe {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Window w = new Window();
				w.setVisible(true);
			}
		});
	}
}