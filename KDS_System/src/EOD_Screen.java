import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;


public class EOD_Screen {

	JFrame frmEodReport;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EOD_Screen window = new EOD_Screen();
					window.frmEodReport.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EOD_Screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEodReport = new JFrame();
		frmEodReport.getContentPane().setBackground(Color.WHITE);
		frmEodReport.setIconImage(Toolkit.getDefaultToolkit().getImage(EOD_Screen.class.getResource("/General_images/GI_icon.png")));
		frmEodReport.setTitle("EOD Report");
		frmEodReport.setBounds(100, 100, 800, 600);
		frmEodReport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEodReport.getContentPane().setLayout(null);
		
		JLabel lblComingSoon = new JLabel("Coming Soon...");
		lblComingSoon.setFont(new Font("Dialog", Font.BOLD, 20));
		lblComingSoon.setBounds(314, 85, 243, 60);
		frmEodReport.getContentPane().add(lblComingSoon);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//return to the manager screen
				frmEodReport.dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton.setBounds(327, 0, 117, 44);
		frmEodReport.getContentPane().add(btnNewButton);
	}

}
