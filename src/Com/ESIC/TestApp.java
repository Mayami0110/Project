package Com.ESIC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.*;  
 public class TestApp{  
	 
	 
	 
 public static void main(String args[]){  
	 
/*	String str = "MayankMishra";
	 
	//char[] chararrya = new char[str.length()];
	String revchararrya = "";
	
	int length = str.length();


	System.out.println(length);
	
	//chararrya = str.toCharArray();
	
	for(int i=str.length()-1;i>=0;i--)
	{
		revchararrya = revchararrya + str.charAt(i);
		//revchararrya+= chararrya[i];
	}
	
	System.out.println(revchararrya);*/
			
		
	 
	 String[] ary = {"att","ree","att","wajs"};
	 
     System.out.println(ary[0] + "Printing ary");

	 
	  List<String> list1=Arrays.asList(ary); 
	  
      System.out.println(list1 + "Printing list1");

	 	 
   ArrayList<String> list=new ArrayList<String>();  
           list.add("Ravi");  
           list.add("Vijay");  
           list.add("Mayank"); 
           
           System.out.println(list + "Printing list");

        //   Collections.reverse(list);
           
        //   list.sort(Collections.reverse());
           
           System.out.println(list + "Printing reverse list again");

             
           Set<String> set=new HashSet<String>(list);
           
         //  Set<String> set=new HashSet<String>(list);

           set.addAll(list); 
           System.out.println(set + "Printing Set");
           System.out.println(list + "Printing list again");

           
           //Collections.reverse(set);
           System.out.println(set + "Printing reverse Set");

           
           Set<String> set1=new HashSet<String>(list1);
           System.out.println(set1);
           
           Collections.reverseOrder();
           
          System.out.println(set1 + "Printing Set1");
          // Collections.addAll(set1, Arrays.toString(ary));
           
           }  
 }  
 
 