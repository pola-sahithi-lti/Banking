import java.sql.*;
import java.util.Scanner;
/*
  XE =
  (DESCRIPTION =
    (ADDRESS = (PROTOCOL = TCP)(HOST = sahithipola)(PORT = 1521))
    (CONNECT_DATA =
      (SERVER = DEDICATED)
      (SERVICE_NAME = XE)
    )
  )*/

public class SelectTest {

	public static void main(String[] args) {
		
		
		try {
			
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("driver registered");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			System.out.println("Connected to database "+conn);
			
			Statement statement = conn.createStatement();
			System.out.println("Statement created: "+statement);
			
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter job: ");
			String v_job = s.nextLine();
			
			ResultSet rs = statement.executeQuery("select * from emp where job ="+"'"+ v_job+"'");
			while(rs.next()) {
				System.out.println("Emp number: "+ rs.getInt(1));
				System.out.println("Emp name: "+rs.getString(2));
				System.out.println("Job: "+rs.getString(3));
				System.out.println("Emp Manager: "+rs.getInt(4));
				System.out.println("Emp Hiredate: "+rs.getDate(5));
				System.out.println("Emp salary: "+rs.getInt(6));
				System.out.println("Emp Comm: "+rs.getInt(7));
				System.out.println("Emp Department: "+rs.getInt(8));
				System.out.println("------------");
			}
			
			System.out.println("================");
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter Staring date: ");
			String fromDate = s1.nextLine();
			
			Scanner s2 = new Scanner(System.in);
			System.out.println("Enter Ending date: ");
			String endDate = s2.nextLine();
			
			ResultSet dateRs = statement.executeQuery("select * from emp where hiredate between "+"'"+fromDate+"' and '"+endDate+"'");
			
//			ResultSet dateRs = statement.executeQuery("select * from emp where hiredate between '01-Jan-81' and '31-Dec-81'");
			while(dateRs.next()) {
				System.out.println("Emp number: "+ dateRs.getInt(1));
				System.out.println("Emp name: "+dateRs.getString(2));
				System.out.println("Job: "+dateRs.getString(3));
				System.out.println("Emp Manager: "+dateRs.getInt(4));
				System.out.println("Emp Hiredate: "+dateRs.getDate(5));
				System.out.println("Emp salary: "+dateRs.getInt(6));
				System.out.println("Emp Comm: "+dateRs.getInt(7));
				System.out.println("Emp Department: "+dateRs.getInt(8));
				System.out.println("------------");
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		
		
	}

}
