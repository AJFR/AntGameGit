/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antgame;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JMenuBar;

public class UserInterface {

	public JFrame frame;
	private JLabel lblUsername;
	private JTextField textField;
	private JLabel lblAntGame;
	private JLabel lblProducedBySe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInterface window = new UserInterface();
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
	public UserInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 153, 102));
		frame.setBackground(SystemColor.activeCaption);
		frame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frame.setBounds(100, 100, 505, 521);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblUsername = new JLabel("UserName");
		lblUsername.setForeground(new Color(0, 0, 0));
		lblUsername.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblUsername.setBackground(new Color(204, 102, 204));
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(36, 223, 152, 67);
		frame.getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(222, 223, 230, 67);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//open new window
				AntGame nw = new AntGame();
				nw.NewScreen();
                                frame.setVisible(false);
				
			}
		});
		btnNewButton.setBounds(161, 331, 152, 67);
		frame.getContentPane().add(btnNewButton);
		
		lblAntGame = new JLabel("Ant Game");
		lblAntGame.setBackground(new Color(153, 51, 51));
		lblAntGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblAntGame.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblAntGame.setBounds(121, 34, 222, 85);
		frame.getContentPane().add(lblAntGame);
		
		lblProducedBySe = new JLabel("produced by SE GROUP 11");
		lblProducedBySe.setBounds(339, 448, 140, 34);
		frame.getContentPane().add(lblProducedBySe);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(161, 377, 97, 21);
		frame.getContentPane().add(menuBar);
	}
}
