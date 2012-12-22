package tictactoe.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import tictactoe.TicTacToe;
import tictactoe.Model.GameArea;

public class Window extends JFrame {
	private GameArea area;
	
	private int buttonSize;
	
	private JPanel panel;

	public Window(GameArea gameArea) {
		area = gameArea;
		buttonSize = TicTacToe.buttonSize;
		
		initUI();
		createPanel();
		generateGameArea();
	}

	private void initUI()
	{
		int width = area.getSize() * buttonSize;
		int height = width;
		
		setTitle(tictactoe.TicTacToe.title);
		setSize(width, height);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void generateGameArea()
	{
		for (int x = 0; x < area.getSize(); x++) {
			for (int y = 0; y < area.getSize(); y++) {
				JButton button = new JButton();
				button.setBounds(x * buttonSize, y * buttonSize, buttonSize, buttonSize);
				button.putClientProperty("x", x);
				button.putClientProperty("y", y);
				button.addActionListener(new ActionListener() {
					private int x;
					
					private int y;
					
					private JButton button;
					
					public void actionPerformed(ActionEvent evt) {
						button = (JButton) evt.getSource();
						x = (Integer) button.getClientProperty("x");
						y = (Integer) button.getClientProperty("y");
						
						if (area.setArea(x, y)) {
							button.setText(area.getCharOfArea(x, x));
							area.changePlayer();
						}
					}
				});
				panel.add(button);
			}
		}
	}

	private void createPanel()
	{
		int width = area.getSize() * buttonSize;
		int height = width;
		
		panel = new JPanel();
		panel.setBounds(0, 0, width, height);
		panel.setLayout(null);

		getContentPane().add(panel);
	}
}