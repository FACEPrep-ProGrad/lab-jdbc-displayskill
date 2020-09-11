package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO {

	public List<Skill> listAllSkills() throws Exception {

		// ArrayList to add the skills to in it
		List<Skill> skills = new ArrayList<Skill>();

		// connection to the database
		Connection connection = ConnectionManager.getConnection();

		// statement for fetch the all skills from database
		Statement statement = connection.createStatement();
		// store the fetched result
		ResultSet resultSet = statement.executeQuery("SELECT * FROM skill");

		// adding the skills into the list
		while (resultSet.next()) {
			Skill skill = new Skill(resultSet.getLong("id"), resultSet.getString("name"));
			skills.add(skill);
		}
		return skills;
	}
}
