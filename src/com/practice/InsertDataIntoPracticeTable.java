package com.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.DBConnect;

public class InsertDataIntoPracticeTable {

	public static void main(String[] args) {
		String query="";
		PreparedStatement ps=null;
		int flag=0;
		try{
			Connection con=DBConnect.getConnection();
			query="INSERT INTO `form` (`name`, `email`, `dob`, `last_login`) VALUES(?,?,?,?)";
			ps=con.prepareStatement(query);
			ps.setString(1, "anuj sharma");
			ps.setString(2, "anuj,sharma@skilrock.com");
			ps.setString(3,"1993-09-27 05:00:00");
			ps.setString(4,"1993-09-27 05:00:00");
			flag=ps.executeUpdate();
					
		}catch(Exception e){
			System.out.println("In a custom Exception");
			e.printStackTrace();
		}
		if(flag!=0){
			System.out.println("Rows inserted : "+flag);
		}
	}
}
