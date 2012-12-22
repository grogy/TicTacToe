package tictactoe.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import tictactoe.Model.GameArea;

public class ButtonDriver implements ActionListener {
	private int x;

	private int y;

	private JButton button;
	
	private GameArea area;
	
	public ButtonDriver(int x, int y, JButton button, GameArea area)
	{
		this.x = x;
		this.y = y;
		this.button = button;
		this.area = area;
	}

	public void actionPerformed(ActionEvent evt) {
		if (area.setArea(x, y)) {
			button.setText(area.getCharOfArea(x, x));
			area.changePlayer();
		}
	}
}
