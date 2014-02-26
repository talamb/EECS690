import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Toolkit;

import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;


public class Combos_Screen {
	int item_id = -1;
	double item_price = -1;
	JFrame frmCombinations;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Combos_Screen window = new Combos_Screen();
					window.frmCombinations.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Combos_Screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCombinations = new JFrame();
		frmCombinations.getContentPane().setBackground(Color.WHITE);
		frmCombinations.setTitle("Combinations");
		frmCombinations.setIconImage(Toolkit.getDefaultToolkit().getImage(Combos_Screen.class.getResource("/General_images/GI_icon.png")));
		frmCombinations.setBounds(100, 100, 400, 600);
		frmCombinations.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCombinations.getContentPane().setLayout(null);
		
		JButton button = new JButton("Back");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				exitScreen();
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(133, 0, 114, 43);
		frmCombinations.getContentPane().add(button);
		
		JButton btnBaconsausageNEgg = new JButton("Bacon/Sausage n' Egg");
		btnBaconsausageNEgg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				item_id = 708;
				item_price = PriceQuery(item_id);
				//System.out.println(item_price);
				//Add a bacon or sausage and eggs to the ticket
			}
		});
		btnBaconsausageNEgg.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBaconsausageNEgg.setBounds(61, 117, 258, 51);
		frmCombinations.getContentPane().add(btnBaconsausageNEgg);
		
		JButton btnHamNEggs = new JButton("Ham n' Eggs");
		btnHamNEggs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				item_id = 709;
				item_price = PriceQuery(item_id);
				//Add a ham and eggs to the ticket
			}
		});
		btnHamNEggs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHamNEggs.setBounds(61, 220, 258, 51);
		frmCombinations.getContentPane().add(btnHamNEggs);
		
		JButton btnSteakNEggs = new JButton("Steak n' Eggs");
		btnSteakNEggs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				item_id = 710;
				item_price = PriceQuery(item_id);
				//Add a steak and eggs to the ticket
			}
		});
		btnSteakNEggs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSteakNEggs.setBounds(61, 330, 258, 51);
		frmCombinations.getContentPane().add(btnSteakNEggs);
	}

	protected void exitScreen() {


		frmCombinations.dispose();
		
	}
	
	public static double PriceQuery(int id)
	{
		String commandText = "SELECT * from MainMenu WHERE ID = " + id;
		ResultSet rs;
		double price = 0;
		try{
			//Execute command
			rs = SQL.ExecuteResultSet(commandText); 
		
			while (rs.next()) {				
				price = rs.getDouble("Price");
				
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return price;
		
		
	}
	
	
	

}
