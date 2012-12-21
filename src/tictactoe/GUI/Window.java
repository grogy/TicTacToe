package tictactoe.GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import tictactoe.Model.GameArea;

public class Window extends JFrame {
	private GameArea area;

	public Window(GameArea area) {
		this.area = area;
		
		initUI();
		JPanel panel = createPanel();
		generateGameArea(panel);
	}

	private void initUI()
	{
		setTitle("TicTacToe");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void generateGameArea(JPanel panel)
	{
		int size = 25;
		int countItems = 20;

		for (int i = 0; i < countItems; i++) {
			for (int j = 0; j < countItems; j++) {
				JButton button = new JButton();
				button.setBounds(i * size, j * size, size, size);
				panel.add(button);
			}
		}
	}

	private JPanel createPanel()
	{
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 500, 500);
		panel.setLayout(null);

		getContentPane().add(panel);

		return panel;
	}
}