package project1_linkedlist;

public class Topic {
	private String name;
	private String chapter;
	
	Topic(String name, String chapter){
		this.name = name;
		this.chapter = chapter;
	}
	
	public String getChapter() {
		return chapter;
	}
	public String getName() {
		return name;
	}
	public void setChapter(String chapter) {
		this.chapter = chapter;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
