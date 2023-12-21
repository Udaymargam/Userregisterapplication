package com.sathya.servlet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class UserDao {
	private static final ResultSet result = null;
	public int saveUser(String username,String password,String email,String mobileno)
	{
		 int result=0;
		//create the Connection 
		Connection connection = DatabaseUtils.createConnection();
		
		try {
		//store the data into data base 
		PreparedStatement preparedStatement = connection.prepareStatement("insert into user_register values(?,?,?,?)");
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
		preparedStatement.setString(3, email);
		preparedStatement.setString(4, mobileno);
		result=preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return result;
	}
	public UserInfo findByEmail(String email)
	{
		UserInfo userinfo=null;
		Connection connection = DatabaseUtils.createConnection();
		try {
			connection = DatabaseUtils.createConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from user_register  where email=?");
			preparedStatement.setString(1, email);
			ResultSet resultset=preparedStatement.executeQuery();
			  
			 // store the data from the result set and store into userinfo model
			          if(resultset.next()) {
			          userinfo=new UserInfo();
			          userinfo.setUsername(resultset.getString(1));
			          userinfo.setPassword(resultset.getString(2));
			          userinfo.setEmail(resultset.getString(3));
			          userinfo.setMobileno(resultset.getString(4));
			          }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return userinfo;	
	}
	public int deleteByMobile(String mobileno)
	{   int result=0;
		Connection connection=DatabaseUtils.createConnection();
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement("delete  from user_register where mobileno=?");
			preparedStatement.setString(1, mobileno);
		    result=	preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return result;
	}
	public List<UserInfo> getAllUsers()
	{
		List<UserInfo> listOfusers=new ArrayList<UserInfo>();
		Connection connection=DatabaseUtils.createConnection();
		try {
		Statement statement=connection.createStatement();
		 ResultSet resultSet= statement.executeQuery("select * from user_register");
		 while(resultSet.next())
		 {
			 UserInfo userInfo=new UserInfo();
			 userInfo.setUsername(resultSet.getString(1));
			 userInfo.setPassword(resultSet.getString(2));
			 userInfo.setEmail(resultSet.getString(3));
			 userInfo.setMobileno(resultSet.getString(4));
			 listOfusers.add(userInfo);
		 }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	    return listOfusers;
	}
	
}
