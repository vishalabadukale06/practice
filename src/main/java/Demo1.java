import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Demo1 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/databasename";
		String uname = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(url,uname,password);
		
		Statement stm = con.createStatement();
		
		ResultSet rs =stm.executeQuery("select * from vishal");
		
		String c = rs.getString("id");
		System.out.println(c);

	}

}
