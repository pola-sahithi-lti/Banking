import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTest {

	public static void main(String[] args) {
		
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			System.out.println("Connection established "+conn);
			
			PreparedStatement preparedStatement= 
					conn.prepareStatement("update emp set job=?,sal=sal+? where empno=?");
			
			System.out.println("Prepared Statement created : "+preparedStatement);
			
			Scanner scan1 = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			Scanner scan3 = new Scanner(System.in);
				
			
			System.out.println("Enter NEW job    : ");
			String empJob = scan2.nextLine();
			
			System.out.println("Enter SALARY Upraisal amount : ");
			int salaryUpraisalAmount= scan3.nextInt();
			
			System.out.println("For Which employee number : ");
			int empno = scan1.nextInt();
			
	 
			preparedStatement.setString(1, empJob);
			preparedStatement.setInt(2, salaryUpraisalAmount);
			preparedStatement.setInt(3, empno );
						
			int rows = preparedStatement.executeUpdate();
			System.out.println(rows+" Rows updated ");
		
			preparedStatement.close();
			conn.close();
			System.out.println("DB resources are closed....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
