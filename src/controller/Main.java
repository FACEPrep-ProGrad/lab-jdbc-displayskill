package controller;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

import dao.PlayerDAO;
import dao.SkillDAO;
import model.Player;
=======
import java.util.List;

import dao.SkillDAO;
import model.Skill;
>>>>>>> b2c53e51b83bc10b4f1933346c574ef0827c7150

public class Main {
	public static void main(String[] args) throws Exception {

<<<<<<< HEAD
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
=======
		// object to fetch the all skills
		SkillDAO skillDAO = new SkillDAO();

		// arrayList to add the skills
		List<Skill> skills = skillDAO.listAllSkills();

		// printing the all skills
		System.out.println("List of all skills:");
		System.out.println();
		for (int i = 0; i < skills.size(); i++) {
			System.out.println((i + 1) + ". " + skills.get(i).getSkillName());
		}

>>>>>>> b2c53e51b83bc10b4f1933346c574ef0827c7150
	}
}