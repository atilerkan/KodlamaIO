package homework3;

public class Instructor extends User{

	private int instructorId;
	private String branch;
	private int experienceYear;
	
	
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int id) {
		this.instructorId = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getExperienceYear() {
		return experienceYear;
	}
	public void setExperienceYear(int experienceYear) {
		this.experienceYear = experienceYear;
	}
	
}
