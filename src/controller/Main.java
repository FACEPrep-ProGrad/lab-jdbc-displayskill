package controller;

import java.util.List;

import dao.SkillDAO;
import model.Skill;

/*
1.Create a controller-class called as Main inside the controller package.
2.Create appropriate objects for the Skill and SkillDAO.
3.Refer sample output for output format.
*/

public class Main {

	public static void main(String[] args) throws Exception {
		int j=0;
		SkillDAO skillDAO=new SkillDAO();
		List<Skill> printlist=skillDAO.skills();
		System.out.println("List of all skills:");
		System.out.println();
		for(int i=0;i<printlist.size();i++) {
			System.out.println(++j+") "+printlist.get(i).getSkillName());
			System.out.println();
		}

	}

}
