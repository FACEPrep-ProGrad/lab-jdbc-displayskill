package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import model.Skill;
import utility.ConnectionManager;

public class PlayerDAO {
	public List<Player> getAllPlayers() throws Exception {
		List<Player> players = new ArrayList<Player>();
		// connect to the database
		Connection connection = ConnectionManager.getConnection();

		// statement for the execute query and feetch the data from the database
		Statement statement = connection.createStatement();
		String sqlString = "select * from player order by name";

		// store the data into the resultset
		ResultSet resultSet = statement.executeQuery(sqlString);

		// create list of players
		while (resultSet.next()) {
			Skill skill = new Skill(resultSet.getLong("id"), resultSet.getString("name"));
			long playerId = resultSet.getLong(1);
			String playerName = resultSet.getString(2);
			String playerCountry = resultSet.getString(3);
			Player player = new Player(playerId, playerName, playerCountry, skill);
			players.add(player);
		}

		return players;
	}
}