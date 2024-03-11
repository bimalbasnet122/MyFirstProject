package DB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		//getconnection(url,un,pw)
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb8am","root","123456");
		
		//--------------------insert sql----------------------
//		//a.write sql
//			String sql="insert into user(username,password)values('shyam','8888')";
//		//b.create statement
//			Statement stm=con.createStatement();
//		//c.excute sql
//			stm.execute(sql);
//		//d.close db
//			con.close();
//			
//			System.out.println("success");
		
		//----------------delete sql--------------
//		String sql="delete from user where id=5";
//		
//		Statement stm=con.createStatement();
//		
//		stm.execute(sql);
//		
//		con.close();
//		
//		System.out.println("success");
		
		//---------------------------update sql------------
		
//		String sql="update user set password ='894pppp' where id =8";
//		
//		Statement stm=con.createStatement();
//	
//		stm.execute(sql);
//	
//		con.close();
//			
//		System.out.println("success");
//	}
			//---------------select sql--------------------
		String sql="select * from user" ;
		
		Statement stm=con.createStatement();
		
		ResultSet rs = stm.executeQuery(sql);
	
		while(rs.next()) {
			System.out.println("id= "+rs.getInt("id"));
			System.out.println("Username= "+rs.getString("username"));
			System.out.println("Password= "+rs.getString("password"));
			System.out.println("---------------------");
		}
	}
}
