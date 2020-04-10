package model;

/*
1.Create a class called as Skill.java inside the model package with below attributes,
 - Long skilld - String skillName
2.Include getter and setter methods for all the attributes.
3.Include constructor with below arguments public Skill(skilld, skillName)
*/

public class Skill{
	Long skilld;
	String skillName;
	
	public Long getSkilld() {
		return skilld;
	}
	public void setSkilld(Long skilld) {
		this.skilld = skilld;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	public Skill(Long skilld, String skillName) {
		this.skilld = skilld;
		this.skillName = skillName;
	}
	
}