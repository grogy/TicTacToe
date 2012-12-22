package tictactoe.GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import tictactoe.TicTacToe;
import tictactoe.Model.GameArea;

public class Window extends JFrame {
	private GameArea area;
	
	private int buttonSize;
	
	private JPanel panel;

	public Window(GameArea area) {
		this.area = area;
		buttonSize = TicTacToe.buttonSize;
		
		initUI();
		createPanel();
		generateGameArea();
	}

	private void initUI()
	{
		setTitle("TicTacToe");
		setSize(area.getSize() * buttonSize, area.getSize() * buttonSize);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void generateGameArea()
	{
		for (int i = 0; i < area.getSize(); i++) {
			for (int j = 0; j < area.getSize(); j++) {
				JButton button = new JButton();
				button.setBounds(i * buttonSize, j * buttonSize, buttonSize, buttonSize);
				panel.add(button);
			}
		}
	}

	private void createPanel()
	{
		panel = new JPanel();
		panel.setBounds(0, 0, area.getSize() * buttonSize, area.getSize() * buttonSize);
		panel.setLayout(null);

		getContentPane().add(panel);
	}
}