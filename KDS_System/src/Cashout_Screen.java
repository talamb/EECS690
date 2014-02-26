import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;


public class Cashout_Screen {

	JFrame frmCashoutTable;
	private JTextField tipAmount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cashout_Screen window = new Cashout_Screen();
					window.frmCashoutTable.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cashout_Screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCashoutTable = new JFrame();
		frmCashoutTable.setIconImage(Toolkit.getDefaultToolkit().getImage(Cashout_Screen.class.getResource("/General_images/GI_icon.png")));
		frmCashoutTable.getContentPane().setBackground(Color.WHITE);
		frmCashoutTable.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Exit cashout screen without closing ticket
				frmCashoutTable.dispose();
				
			}
		});
		btnBack.setBounds(136, 0, 117, 25);
		frmCashoutTable.getContentPane().add(btnBack);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane.setBounds(59, 84, 266, 194);
		frmCashoutTable.getContentPane().add(textPane);
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTicket.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTicket.setBounds(59, 47, 70, 25);
		frmCashoutTable.getContentPane().add(lblTicket);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBackground(Color.LIGHT_GRAY);
		textPane_1.setBounds(181, 290, 144, 41);
		frmCashoutTable.getContentPane().add(textPane_1);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTotal.setBounds(93, 301, 70, 15);
		frmCashoutTable.getContentPane().add(lblTotal);
		
		tipAmount = new JTextField();
		tipAmount.setBackground(Color.LIGHT_GRAY);
		tipAmount.setBounds(211, 366, 114, 19);
		frmCashoutTable.getContentPane().add(tipAmount);
		tipAmount.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Tip Total:");
		lblNewLabel.setBounds(123, 368, 70, 15);
		frmCashoutTable.getContentPane().add(lblNewLabel);
		
		JButton btnCash = new JButton("Cash");
		btnCash.setFont(new Font("Dialog", Font.BOLD, 20));
		btnCash.setBounds(12, 409, 117, 47);
		frmCashoutTable.getContentPane().add(btnCash);
		
		JButton btnCc = new JButton("CC");
		btnCc.setFont(new Font("Dialog", Font.BOLD, 20));
		btnCc.setBounds(140, 409, 117, 47);
		frmCashoutTable.getContentPane().add(btnCc);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.setFont(new Font("Dialog", Font.BOLD, 20));
		btnCheck.setBounds(269, 409, 117, 47);
		frmCashoutTable.getContentPane().add(btnCheck);
		
		JButton btnDiscount = new JButton("Discount");
		btnDiscount.setFont(new Font("Dialog", Font.BOLD, 20));
		btnDiscount.setBounds(46, 494, 294, 47);
		frmCashoutTable.getContentPane().add(btnDiscount);
		frmCashoutTable.setTitle("Cashout Table");
		frmCashoutTable.setBounds(100, 100, 400, 600);
		frmCashoutTable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
