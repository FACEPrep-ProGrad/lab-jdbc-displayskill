package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> b2c53e51b83bc10b4f1933346c574ef0827c7150

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO {

<<<<<<< HEAD
	public Skill getSkillById(Long id) throws Exception {
		String sql = "select * from skill where id =" + id;
		Skill skill = null;
=======
	public List<Skill> listAllSkills() throws Exception {

		// ArrayList to add the skills to in it
		List<Skill> skills = new ArrayList<Skill>();
>>>>>>> b2c53e51b83bc10b4f1933346c574ef0827c7150

		// connection to the database
		Connection connection = ConnectionManager.getConnection();

<<<<<<< HEAD
		// statement to execute to sql query
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			if (resultSet.getInt("id") == id) {
				skill = new Skill(resultSet.getLong("id"), resultSet.getString("name"));

			}
		}

		return skill;
=======
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
>>>>>>> b2c53e51b83bc10b4f1933346c574ef0827c7150
	}
}