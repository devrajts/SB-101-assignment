package evaluation.q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of course you want to add : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.println("Please enter course details : ");
			System.out.println("--------------------------------------");
			
			System.out.println("Enter course id : ");
			int cid = sc.nextInt();
			
			System.out.println("Enter course name : ");
			String cname = sc.next();
			
			System.out.println("Enter course fee : ");
			int fee = sc.nextInt();
			
			System.out.println("Enter course duration : ");
			String duration = sc.next();
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String url = "jdbc:mysql://localhost:3306/sb101";
			
			try {
				Connection cn = DriverManager.getConnection(url,"root","Dd@8105848723");
				
				PreparedStatement ps = cn.prepareStatement("insert into course values(?,?,?,?);");
				
				ps.setInt(1, cid);
				ps.setString(2, cname);
				ps.setInt(3, fee);
				ps.setString(4, duration);
				
				int x = ps.executeUpdate();
				
				if(x>0) {
					System.out.println("Course updated successfully...");
				}else {
					System.out.println("please check the course details.");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
