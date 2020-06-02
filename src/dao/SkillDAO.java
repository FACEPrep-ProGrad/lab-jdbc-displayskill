package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	
	public List<Skill> listAllSkills () throws ClassNotFoundException, SQLException {

		String sql="select * from PPLD3L3 ORDER BY skillname ASC";
		
		PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql);
		
		ResultSet rs=ps.executeQuery();

		
		while(rs.next()) {
			// Retrieve by column name and displaying
			String skillname=rs.getString(3);
			System.out.println(skillname);
		}
		ConnectionManager.getConnection().close();
		return null;
		
	}
}
