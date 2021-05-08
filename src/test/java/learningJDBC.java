import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class learningJDBC {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String host= "localhost";
		String port= "3306";

			Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/jwdb", "root" , "singhkamal");
			
			Statement s = con.createStatement();
			
			ResultSet rs = s.executeQuery("select * from employees where name='Nishu'");
			
			while(rs.next())
			{
			
			System.out.println(rs.getString("Name"));
			System.out.println(rs.getString("location"));
			}	
	}

}
