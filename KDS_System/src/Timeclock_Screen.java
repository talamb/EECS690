import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;


public class Timeclock_Screen {

	JFrame frmTimeclock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Timeclock_Screen window = new Timeclock_Screen();
					window.frmTimeclock.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Timeclock_Screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTimeclock = new JFrame();
		frmTimeclock.getContentPane().setBackground(Color.WHITE);
		frmTimeclock.setIconImage(Toolkit.getDefaultToolkit().getImage(Timeclock_Screen.class.getResource("/General_images/GI_icon.png")));
		frmTimeclock.setTitle("Clock In /Out Screen");
		frmTimeclock.setBounds(100, 100, 800, 600);
		frmTimeclock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTimeclock.getContentPane().setLayout(null);
		
		JLabel lblComingSoon = new JLabel("Coming Soon...");
		lblComingSoon.setFont(new Font("Dialog", Font.BOLD, 20));
		lblComingSoon.setBounds(314, 85, 243, 60);
		frmTimeclock.getContentPane().add(lblComingSoon);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//return to the manager screen
				frmTimeclock.dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton.setBounds(327, 0, 117, 44);
		frmTimeclock.getContentPane().add(btnNewButton);
	}

}
