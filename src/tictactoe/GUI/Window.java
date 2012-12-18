package tictactoe.GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {

	public Window() {
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
		int w = 25;
		int countItems = 20;

		for (int i = 0; i < countItems; i++) {
			for (int j = 0; j < countItems; j++) {
				JButton button = new JButton();
				button.setBounds(i * w, j * w, w, w);
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