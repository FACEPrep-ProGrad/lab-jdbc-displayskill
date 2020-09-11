package model;

public class Skill {

	private Long skillid;
	private String SkillName;

	public Long getSkillid() {
		return skillid;
	}

	public void setSkillid(Long skillid) {
		this.skillid = skillid;
	}

	public String getName() {
		return SkillName;
	}

	public void setName(String SkillName) {
		this.SkillName = SkillName;
	}

	public Skill(Long skillid, String SkillName) {
		super();
		this.skillid = skillid;
		this.SkillName = SkillName;
	}
}