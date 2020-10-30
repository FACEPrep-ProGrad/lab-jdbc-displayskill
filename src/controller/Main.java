package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dao.SkillDAO;
import model.Skill;

public class Main{
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException {
		List<Skill> skill = new ArrayList<Skill>();
		SkillDAO skillDAO = new SkillDAO();
		
		skill = skillDAO.listAllSkills();
		
		Iterator<Skill> it = skill.iterator();
		
		System.out.println("List of all skills");
		int i = 1;
		while(it.hasNext()) {
			System.out.println("	" + i++ + "." + it.next().getSkillName());
		}
	}
}
