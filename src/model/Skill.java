package model;

public class Skill {
<<<<<<< HEAD

	private Long skillid;
	private String SkillName;
=======
	private Long skillid;
	private String skillName;
>>>>>>> b2c53e51b83bc10b4f1933346c574ef0827c7150

	public Long getSkillid() {
		return skillid;
	}

	public void setSkillid(Long skillid) {
		this.skillid = skillid;
	}

<<<<<<< HEAD
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
=======
	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Skill(Long skillid, String skillName) {
		super();
		this.skillid = skillid;
		this.skillName = skillName;
	}

>>>>>>> b2c53e51b83bc10b4f1933346c574ef0827c7150
}