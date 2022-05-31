import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValue {
	
	public static void main(String[] args) {
		
		String url = "jdbc:sqlite:C://sqlite/db/test2.db";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
			Statement st = conn.createStatement();
			System.out.println("-----------Inserting records into the table-----------");          
			String sql = "INSERT INTO Movies VALUES (1,'Kirik party', 'Rakshith Shetty', 'Rashmika mandanna', 2016, 'Rishab shetty')";
			st.executeUpdate(sql);
			sql = "INSERT INTO Movies VALUES (2, 'Googly', 'Yash', 'Kriti Kharbanda',2013,'Pawan Wadeyar')";
			st.executeUpdate(sql);
			System.out.println("----------Inserted records into the table--------");   	  
      } 
		catch (SQLException e) {
			e.printStackTrace();
      } 
   }
}