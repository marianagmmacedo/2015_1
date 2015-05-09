package project1_linkedlist;
import java.util.*;

class CS_241_list  {
private static int size;
public static void displayTopics(LinkedList l, int size, int n)
{
  if (n <= size)
  {
    CS_241 cs = (CS_241) l.get(n);
    System.out.println(cs.getTopic().getName());
    displayTopics(l, size, n+1);
  }
 
}



public static boolean isTopic(LinkedList l, String nameTopic, int size)
{
	int n = 0;
	while (n <= size)
	  {
	    CS_241 cs = (CS_241) l.get(n);
	    if(cs.getTopic().getName().equalsIgnoreCase(nameTopic)){
	    	System.out.println(cs.getTopic().getName() + ", " + cs.getTopic().getChapter()
	    						+ ", " + cs.getDate() + ", " + cs.getIssues() + ", " 
	    						+ cs.getHomework().getName() +  ", " + cs.getHomework().getDeadline());
	    	return true;
	    }
	    n++;
	  }
	  return false;
}

public static void main(String[] args) {
  LinkedList <CS_241>list = new LinkedList<CS_241>();

  //Adding data in the list
  
  Topic topic = new Topic("Introduction ", "Chapter 1 and 2");
  Homework homework = new Homework(null, null);
  String date = "1/29/2015";
  String issues = null;
  CS_241 cs = new CS_241(topic,date, homework,issues);
  list.add(cs);
  size = list.size();
  displayTopics(list, size - 1, 0);
  System.out.println();
  
  topic = new Topic("Algorithm Analysis","Chapter 3"); 
  date = "2/5/2015";
  cs = new CS_241(topic,date, homework,issues);
  list.add(cs);
  size = list.size();
  displayTopics(list, size - 1, 0);
  System.out.println();
  
  topic = new Topic("Lists", "Chapter 4"); 
  date = "2/10/2015";
  homework = new Homework("Implement Lists", "2/17/2015");
  cs = new CS_241(topic,date, homework,issues);
  list.add(cs);
  size = list.size();
  displayTopics(list, size - 1, 0);
  System.out.println();
  
  topic = new Topic("Stacks","Chapter 4"); 
  date = "2/12/2015";
  homework = new Homework(null, null);
  cs = new CS_241(topic,date, homework,issues);
  list.add(cs);
  
  
  size = list.size();
  displayTopics(list, size - 1, 0);
  System.out.println();
  
  //Check list empty or not
  if (list.isEmpty()){
  System.out.println("Linked list is empty");
  }
  else{
  System.out.println( "Linked list size: " + size);
  }
  System.out.println();
  
  //Adding first
  topic = new Topic("Cancelled","NONE"); 
  date = "2/3/2015";
  cs = new CS_241(topic,date, homework,issues);
  list.addFirst(cs);
  size = list.size();
  displayTopics(list, size - 1, 0);

  System.out.println();
  System.out.println("Now the size of list: " + list.size());
  System.out.println();
  

  //Adding Last
  topic = new Topic("Queues","Chapter 4"); 
  date = "2/17/2015";
  cs = new CS_241(topic, date, homework, issues);
  list.addLast(cs);
  size = list.size();
  displayTopics(list, size - 1, 0);

  System.out.println();
  System.out.println("Now the size of list: " + list.size());
  System.out.println();
  
  boolean x = isTopic(list, "Stacks", size-1);
  System.out.println("Stacks is topic:" + x);
  x = isTopic(list, "stacks", size-1);
  System.out.println("stacks is topic:" + x);
  x = isTopic(list, "String", size-1);
  System.out.println("String is topic:" + x);
  
  }
}