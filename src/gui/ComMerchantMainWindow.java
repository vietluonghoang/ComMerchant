package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.openqa.selenium.WebDriver;

import drivers.RunningDriver;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ComMerchantMainWindow {

	private JFrame frmKc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComMerchantMainWindow window = new ComMerchantMainWindow();
					window.frmKc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComMerchantMainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKc = new JFrame();
		frmKc.setTitle("KC33");
		frmKc.setBounds(100, 100, 450, 300);
		frmKc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmKc.getContentPane().add(panel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WebDriver driver = new RunningDriver().chromeDriver();
			}
		});
		panel.add(btnNewButton);
	}

}
