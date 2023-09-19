package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mysql.cj.protocol.Resultset;

public class EmployeeDao 
{
	Connection con;
	Statement st;
	ResultSet rs;
	
	public EmployeeDao()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver found...");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ducat1","root","12345");
			System.out.println("connection created");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Employee getrecord(String id)
	{
		Employee emp=null;
		try 
		{
			st=con.createStatement();
			rs=st.executeQuery("select * from employee where id='"+id+"'");
			
			if(rs.next())
			{
				emp=new Employee();
				emp.setId(rs.getString(1));
				emp.setPassword(rs.getString(2));
				emp.setName(rs.getString(3));
				emp.setAge(rs.getInt(4));
				emp.setPhone(rs.getLong(5));
				emp.setCity(rs.getString(6));
				emp.setSalary(rs.getFloat(7));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}
	   public ArrayList<Employee> getRecord()
	   {
		   ArrayList<Employee> elist=new ArrayList<>();
		   try 
			{
				st=con.createStatement();
				rs=st.executeQuery("select * from employee");
				
				while(rs.next())
				{
					Employee emp=new Employee();
					emp.setId(rs.getString(1));
					emp.setPassword(rs.getString(2));
					emp.setName(rs.getString(3));
					emp.setAge(rs.getInt(4));
					emp.setPhone(rs.getLong(5));
					emp.setCity(rs.getString(6));
					emp.setSalary(rs.getFloat(7));
					elist.add(emp);
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return elist;
	   }
	   public int insertrecord(Employee emp)
	   {
		   int status=0;
		   try 
		   {
			st=con.createStatement();
			
			status=st.executeUpdate("insert into employee values('"+emp.getId()+"','"+emp.getPassword()+"','"+emp.getName()+"',"+emp.getAge()+","+emp.getPhone()+",'"+emp.getCity()+"',"+emp.getSalary()+")");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	   }

	public Employee checkrecord(JTextField uid)
	{
		Employee emp=null;
		try 
		{
			st=con.createStatement();
			
			rs=st.executeQuery("select * from employee where id='"+uid+"'");
			
			emp=new Employee();
			emp.setId(rs.getString(1));
			emp.setPassword(rs.getString(2));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
		
	}
	

	
	
}
