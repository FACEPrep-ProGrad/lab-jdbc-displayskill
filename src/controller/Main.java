
package controller;

import java.util.List;

import dao.SkillDAO;
import model.Skill;

public class Main {
	public static void main(String[] args) throws Exception {

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

	}
}
