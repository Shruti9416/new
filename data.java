import java.sql.*;
import java.io.*;

public class slip1 {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		DataInputStream dis = new DataInputStream(System.in);
		
		try
		{
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection("jdbc:postgresql://linux1/fymca026","fymca026","");
		
		if(con==null)
			System.out.println("Connection failed");
		else
		{
			System.out.println("Connection Successful");


			System.out.println("Enter New Student Roll No :");
			int rn=Integer.parseInt(dis.readLine());

			System.out.println("Enter New Student Name :");
			String sn=dis.readLine();

			System.out.println("Enter New Student Class :");
			String sc=dis.readLine();
			
			System.out.println("Enter New Student percentage :");
			float pr=Float.parseFloat(dis.readLine());

			
			stmt=con.createStatement();
			stmt.executeUpdate("insert into student values("+rn+",'"+sn+"','"+sc+"',"+pr+")");
			
			rs=stmt.executeQuery("select * from student");
			while(rs.next())
			{
			System.out.print("\nRno:"+rs.getInt(1));
			System.out.print("\t\tStud. Name:"+rs.getString(2));
			System.out.print("\tStud. Class:"+rs.getString(3));
			System.out.print("\nStud percentage:"+rs.getFloat(4));
			}
			System.out.print("\n");
			con.close();
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}