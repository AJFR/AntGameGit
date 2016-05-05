/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
 //DO NOT USE OLD INTERFACE
 
 
package antgame;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.JEditorPane;
import javax.swing.JMenuBar;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AntGame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AntGame window = new AntGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AntGame() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws IOException {
                WorldReader wr = new WorldReader();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 204, 153));
		frame.setBounds(100, 100, 2000, 1500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAntGame = new JLabel("Ant Game");
		lblAntGame.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblAntGame.setForeground(new Color(255, 255, 255));
		lblAntGame.setBounds(26, 40, 212, 55);
		frame.getContentPane().add(lblAntGame);
		
		JTextArea internalFrame = new JTextArea(wr.worldString);
                internalFrame.setEditable(false);
		internalFrame.setBounds(36, 92, 1900, 1400);
		frame.getContentPane().add(internalFrame);
		internalFrame.setVisible(true);
	}
}
