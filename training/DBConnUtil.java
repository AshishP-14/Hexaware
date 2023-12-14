//package training;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//import util.DBPropertyUtil;
//
//
//public class DBConnUtil {
//
//	public static Connection getDBConnection(String cString) {
//		Connection con = null;
//		try {
//		//	String className = DBPropertyUtil.getClassName("resources\\Application.properties");
//			//Class.forName(className);
//			con = DriverManager.getConnection(cString,"root","Ash1415@");
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		//} catch (ClassNotFoundException e) {
//			
//			e.printStackTrace();
//		}
//		return con;
//
//	}
//
//	public static void main(String[] args) {
//		//String conStr = DBPropertyUtil.getConnectionString("resources\\Application.properties");
//		//Connection con = DBConnUtil.getDBConnection(conStr);
//		String query = " select  * from employees where employee_id between 100 and 120";
//	
//		String query1 = " select  * from employees where employee_id between ? and ?";
//		PreparedStatement ps =  null;
//		ResultSet rs2 = null;
//		try {
//			//ps = con.prepareStatement(query1);
//			ps.setInt(1, 140);
//			ps.setInt(2, 145);
//			rs2 = ps.executeQuery();
//			while (rs2.next()) {
//				System.out.println(
//						"\nemployee_id : "+ rs2.getInt(1) 
//						+ "\nfirst_name : " + rs2.getString(2) 
//						+"\nlast_name: " + rs2.getString(3) 
//						+"\nhire_date " + rs2.getDate(6) 
//						+ "\nsalary " + rs2.getDouble("salary"));
//			}
//				
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				ps.close();
//				rs2.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			
//		}
//		
//		try {
//			//Statement s = con.createStatement();
//			//ResultSet rs = s.executeQuery(query);
//
//			//while(rs.next()) {
//				//System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getDate(6)+" "+rs.getDouble("salary")); //rs.getDouble(8)
//			}
//
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//
//
//		System.out.println(con);
//	}
//
//}
