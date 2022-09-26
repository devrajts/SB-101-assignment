package evaluation.q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of students you want to add : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.println("Enter student details:");
			
			System.out.println("------------------------------");
			System.out.println("Enter student roll : ");
			int roll = sc.nextInt();
			
			System.out.println("Enter student name : ");
			String name = sc.next();
			
			System.out.println("Enter student address : ");
			String address = sc.next();
			
			System.out.println("Enter student mobile number : ");
			String mobile = sc.next();
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String url = "jdbc:mysql://localhost:3306/sb101";
			
			try {
				Connection cn = DriverManager.getConnection(url,"root","Dd@8105848723");
				
				PreparedStatement ps = cn.prepareStatement("insert into student values (?,?,?,?);");
				
				ps.setInt(1, roll);
				ps.setString(2, name);
				ps.setString(3, address);
				ps.setString(4, mobile);
				
				 int x  = ps.executeUpdate();
				
				if(x>0) {
					System.out.println("Student inserted successfully...");
				}else {
					System.out.println("Student details not inserted. please check the details again.");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("==========================================");
		}
		
		
		
	}

}
