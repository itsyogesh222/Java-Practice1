package PACK1;

import java.util.ArrayList;


public class TrafficLight {

    public static void main(String[] args) {

       
      ArrayList<String> al = new ArrayList<String>();
       

       
       al.add("Green");
       al.add("Yellow");
        al.add("Red");
        
        System.out.println("Signal1 Signal2");
        
        for (int i=0; i<120; i++)
        {
        	if (i>0 && i<55)
        	{
        		 
                System.out.println(al.get(0)+" "+ al.get(2));
                
        	}
        	if (i>55 && i<60)
        	{	
        		 System.out.println(al.get(2)+" "+ al.get(1));
        	}
        	if (i>60 && i<115)
        	{
        		 System.out.println(al.get(2)+" "+ al.get(0));
        	}
        	if (i>115 && i<120)
        	{
        		 System.out.println(al.get(1)+" "+ al.get(2));
        	}
      

       
        
        
       
    
       
        }
          }
    }

