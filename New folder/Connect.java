import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
   
public class Connect {  
    public static void connect() {  
        Connection conn = null;  
        try {  
            String url = "jdbc:sqlite:C:/sqlite/db/test2.db";  
            conn = DriverManager.getConnection(url);  
            System.out.println("Connection to SQLite has been established.");       
        } 
        catch (SQLException e) {  
            System.out.println(e.getMessage());  
        } 
        finally {  
            try {  
                if (conn != null) {  
                    conn.close();  
                }  
            } 
            catch (SQLException e) {  
                System.out.println(e.getMessage());  
            }  
        }  
    }  
   
    public static void main(String[] args) {  
        connect();  
    }  
}  