package project1_linkedlist;
import java.util.*;



class List_SuperHeroes  {
private static int size;
public static void displayHeroes(LinkedList l, int n)
{
  if (n >= 0)
  {
    SuperHero s = (SuperHero) l.get(n);
    System.out.println(s.getName() + ", " + s.getEra());
    displayHeroes(l, n-1);
  }
}


public static void main(String[] args) {
  LinkedList <SuperHero>list = new LinkedList<SuperHero>();

  Iterator iterator;
  //Adding data in the list
  SuperHero s = new SuperHero("Thomas Bayes","1702-1761");
  list.add(s);
  s = new SuperHero("Euler","1707-1783");
  list.add(s);
  s = new SuperHero("Euclid","300BC");
  list.add(s);
  s = new SuperHero("Alan Turing","1912-1954");
  list.add(s);

  size = list.size();
  displayHeroes(list, size - 1);


  System.out.println();
  //Check list empty or not
  if (list.isEmpty()){
  System.out.println("Linked list is empty");
  }
  else{
  System.out.println( "Linked list size: " + size);
  }
  //Adding first
  s = new SuperHero("Gauss","1777-1855");
  list.addFirst(s);

  displayHeroes(list, list.size() - 1);

  System.out.println();
  System.out.println("Now the size of list: " + list.size());


  //Adding Last
  s = new SuperHero("Simpson","1992-2012");
  list.addLast(s);
  displayHeroes(list, list.size() - 1);

  System.out.println();
  System.out.println("Now the size of list: " + list.size());

  }
}