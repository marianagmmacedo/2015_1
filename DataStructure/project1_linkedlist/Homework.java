package project1_linkedlist;

public class Homework {
	private String name;
	private String deadline;
	
	Homework(String name, String deadline){
		this.name = name;
		this.deadline = deadline;
	}
	
	public String getDeadline() {
		return deadline;
	}
	public String getName() {
		return name;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public void setName(String name) {
		this.name = name;
	}
}
