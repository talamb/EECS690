import java.io.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;

public class Connection {
	public static String username;
	public static String password;
	public static String url;
	public static Statement stmt;
	public static String pw;
	public static String name;
	public static String url2;
	public static java.sql.Connection con;
	public static String DeptTable = "Test_Department";
	public static String EmpTable = "Test_Employee";
	public static String EmpDeptTable = "Test_EmpDept";
	
	
	
	/**	 
	 * The CreateFile() Method checks to see whether a ConnectionInfo.txt files exists,
	 * and if it doesn't then it creates one with the default connection settings.
	 * After checking if the file needs to be created, it calls the ReadFile() method.
	 */
	/*
	private static void CreateFile()
	{
		File connection;
		  connection = new File("ConnectionInfo.txt");
		  if(!connection.exists()){
		  try {
			  FileWriter fstream = new FileWriter("ConnectionInfo.txt");
			try {				  
				  BufferedWriter out = new BufferedWriter(fstream);
				  out.write("Username: "+ username + "\n");				
				  out.write("Password: "+ password + "\n");
				  out.write("ConnectionURL: " + url);
				  out.close();
			} catch (FileNotFoundException e) {				
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}		  
		  
		  }
	}
	*/
		/**	 
		 * The ReadFile() method reads the information from the ConnectionInfo.txt file
		 * and stores the username, password and connection url into the appropriate variables.	 
		 */	  
	private static void ReadFile(){
	  try{	 		  
		  FileInputStream fstream = new FileInputStream("ConnectionInfo.txt");	  
		  DataInputStream in = new DataInputStream(fstream);
		  BufferedReader br = new BufferedReader(new InputStreamReader(in));  
		  
		  username = br.readLine(); //First line is username
		  password = br.readLine(); //Second line is password
		  url = br.readLine(); 	    //Third line is connection url		  
		  in.close(); 				//Close the buffer (Writes to the file)
		  
		  String[] split = username.split(": ");
			name = split[1];
			split = password.split(": ");
			pw = split[1];
			split = url.split(" ");
			url2 = split[1];
	    }catch (Exception e)
		{
			System.err.println("Error: " + e.getMessage());
		} 	  

	  }
	
		/**	 
		 * The Connect() method is used to create the connection with the SQL server.
		 * 
		 */		
	public static boolean Connect(){
		//CreateFile();
		ReadFile();	
		
		try {
				Class.forName("com.mysql.jdbc.Driver");
			} 
		catch (ClassNotFoundException e) 
			{
				System.out.println(e.getMessage());
				return false;
			}
			
		try {
				con = DriverManager.getConnection(url2,name,pw); //creates a connection with the server
						
				
			} 
			catch (SQLException e) 
			{
				System.out.println(e.getMessage());
				return false;
			}
		
		return true;
		
	}
	
}

