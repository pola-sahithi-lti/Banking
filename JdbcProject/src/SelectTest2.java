import java.sql.*;
import java.time.LocalDate;
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

public class SelectTest2 {

	public static void main(String[] args) {
		
		
		try {
			
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("driver registered");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			System.out.println("Connected to database "+conn);
			
			PreparedStatement preparedStatement = conn.prepareStatement("insert into emp values(?,?,?,?,?,?,?,?)");
			System.out.println("Prepared Statement: "+preparedStatement);
			
			Scanner s1 = new Scanner(System.in);
		
			System.out.println("Enter empNo: ");
			int empNumber = s1.nextInt();
			s1.nextLine();
			System.out.println("Enter empname:");
			String empName = s1.next();
			s1.nextLine();
			System.out.println("Enter job:");
			String job = s1.next();
			s1.nextLine();
			System.out.println("Enter manager:");
			int manager = s1.nextInt();
			s1.nextLine();
			System.out.println("enter hiring year:");
			int year = s1.nextInt();
			s1.nextLine();
			System.out.println("Enter hiring month:");
			int month = s1.nextInt();
			s1.nextLine();
			System.out.println("Enter hiring day:");
			int day = s1.nextInt();
			s1.nextLine();
			java.sql.Date date =new  java.sql.Date(year, month, day);
			java.sql.Date hiringDate = new java.sql.Date(date.getTime());
			System.out.println("Enter salary:");
			int salary = s1.nextInt();
			s1.nextLine();
			System.out.println("Enter comm:");
			int comm = s1.nextInt();
			s1.nextLine();
			System.out.println("Enter deptno:");
			int deptno = s1.nextInt();
			s1.nextLine();
			
			
		
			preparedStatement.setInt(1, empNumber);
			preparedStatement.setString(2, empName);
			preparedStatement.setString(3, job);
			preparedStatement.setInt(4, manager);
			preparedStatement.setDate(5, hiringDate);
			preparedStatement.setInt(6, salary);
			preparedStatement.setInt(7, comm);
			preparedStatement.setInt(8, deptno);
			
			int rows = preparedStatement.executeUpdate();
			System.out.println("Rows created");
			
			
			
			
			
			preparedStatement.close();
			conn.close();
			System.out.println("DB resources are closed....");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		
		
	}

}
