package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

/*
Create a dao-class called as SkillDAO.java inside dao package with below methods
to handle all database related operations
- *public List< Skill > listAll Skills ()*
- The above method is used to fetch all the skills from skill table and returns the list of skills.
- Display the skills in ascending order based on name. 
*/

public class SkillDAO{
	
	List<Skill> skillList=new ArrayList<Skill>();
	Connection con;
	
	public List<Skill> skills() throws Exception {
		con=ConnectionManager.getConnection();
		Statement statement=con.createStatement();
		ResultSet rs=statement.executeQuery("SELECT * FROM skill");
		while(rs.next()) {
			skillList.add(new Skill(rs.getLong("id"),rs.getString("name")));
		}
		return skillList;
	}
}