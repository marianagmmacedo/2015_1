package project1_linkedlist;

import java.util.Date;

public class CS_241{
	private Topic topic;
	private String date;
	private String issues;
	private Homework homework;
	
	
	CS_241(Topic topic, String date, Homework homework, String issues){
		this.topic = topic;
		this.date = date;
		this.homework = homework;
		this.issues = issues;
	}


	public Topic getTopic() {
		return topic;
	}


	public void setTopic(Topic topic) {
		this.topic = topic;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getIssues() {
		return issues;
	}


	public void setIssues(String issues) {
		this.issues = issues;
	}


	public Homework getHomework() {
		return homework;
	}


	public void setHomework(Homework homework) {
		this.homework = homework;
	}
	
	

	
}

