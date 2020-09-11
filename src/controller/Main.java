package controller;

import java.util.ArrayList;
import java.util.List;

import dao.PlayerDAO;
import dao.SkillDAO;
import model.Player;

public class Main {
	public static void main(String[] args) throws Exception {

		// object for the skillDAO
		SkillDAO skillDAO = new SkillDAO();

		// object for the PlayerDAO
		PlayerDAO playerDAO = new PlayerDAO();

		System.out.println("List of player and their skills");
		System.out.println("ID\t Name\t \t Country\t Skill");
		List<Player> players = new ArrayList<Player>();

		players = playerDAO.getAllPlayers();
		for (int i = 0; i < players.size(); i++) {
			System.out.println((i + 1) + ".\t" + players.get(i).getName() + "\t" + players.get(i).getCountry() + "\t"
					+ skillDAO.getSkillById(players.get(i).getSkill().getSkillid()).getName());
		}
	}
}