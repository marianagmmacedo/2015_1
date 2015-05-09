package project1_linkedlist;

public interface iList{
	public void clear();
	public void insert(CS_241 item);
	public void append(CS_241 item);
	public CS_241 remove();
	public void moveToStart();
	public void moveToEnd();
	public void prev();
	public void nextO();
	public int length();
	public int currPos();
	public void moveToPos(int pos);
	public CS_241 getValue();
}
