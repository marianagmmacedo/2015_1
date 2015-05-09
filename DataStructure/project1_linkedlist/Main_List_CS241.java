package project1_linkedlist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;


public class Main_List_CS241 {
	
	public static void main(String[] args) {
		LinkedList <CS_241>list = new LinkedList<CS_241>();
		String text = " ";
		int n =0; boolean a = true;
		LL linkedlist = null;
		
//		try {
//			text = new Scanner( new File("/Users/mgmmacedo/Documents/workspace/DataStructure_labs/src/project1_linkedlist/text.txt"), "UTF-8" ).useDelimiter("\\A").next();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		BufferedReader reader = null;
        StringBuilder randomstring =  new StringBuilder();
        try  {
             reader = new BufferedReader(new FileReader("/Users/mgmmacedo/Documents/workspace/DataStructure_labs/src/project1_linkedlist/text.txt"));


            String line = reader.readLine();
            while(line !=  null) {
               
            	randomstring.append(line + '\n');
            	
                String data[] = line.split(",");  
                
                Topic topic = new Topic(data[0],data[1]);
                String date = data[2];
                Homework homework = new Homework(data[3],data[4]);
                String issues = data[5];
                
                CS_241 class241 = new CS_241(topic, date, homework, issues);
                //System.out.println(class241.getTopic().getName());
                if(a){
                	List listCS = new List(class241,null);
            		linkedlist = new LL(listCS);
            		//System.out.println(linkedlist.getTail().element().getTopic().getName());
            		
            		a=false;
                }else{
                	linkedlist.append(class241);
                	
                	//System.out.println(class241.getTopic().getName());
                }
                	
        		
//                list.add(class241);
                
                line = reader.readLine();
                
                 
            }
        } catch(FileNotFoundException e){System.out.println("Error: "+e.getMessage());
        } catch(IOException e){System.out.println("Error: "+e.getMessage());
        }
        finally{
            try{
                reader.close();
            }catch(Exception E){}
        }
       // System.out.println(randomstring.toString());
        
//        int size = list.size()-1;
//        while (n <= size)
//        {
//          CS_241 cs = (CS_241) list.get(n);
//          System.out.println(cs.getTopic().getName() + ", " + cs.getTopic().getChapter());
//          System.out.println(cs.getDate() +  ", " + cs.getHomework().getName());
//          n++;
//          
//        }
//        System.out.println("Number of weeks:" + size);
        
        linkedlist.printList();
        System.out.println();
        Topic top = new Topic("Study Day","Chapter 4");
        boolean x = linkedlist.isTopic(top);
        System.out.println(x);
        	
	}

}
