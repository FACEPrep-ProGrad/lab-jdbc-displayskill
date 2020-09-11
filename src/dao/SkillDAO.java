package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO {

	public Skill getSkillById(Long id) throws Exception {
		String sql = "select * from skill where id =" + id;
		Skill skill = null;

		// connection to the database
		Connection connection = ConnectionManager.getConnection();

		// statement to execute to sql query
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			if (resultSet.getInt("id") == id) {
				skill = new Skill(resultSet.getLong("id"), resultSet.getString("name"));

			}
		}

		return skill;
	}
}