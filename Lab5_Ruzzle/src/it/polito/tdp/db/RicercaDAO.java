package it.polito.tdp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RicercaDAO {

	private String jdbcURL = "jdbc:mysql://localhost/dizionario?user=root";
	
	public boolean checkParola(String parola){
		
		try {
			Connection conn = DriverManager.getConnection(jdbcURL);
			
			String template = "";
			
			PreparedStatement st = conn.prepareStatement(template);
			
			st.setString(x,x);

			ResultSet res=st.executeQuery();
			
			if(res.next()){
				return true;
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	
}
