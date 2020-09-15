package Advprog;


import java.lang.*;
import java.io.*; 

import java.util.*; 
public class Comp {
	

	 public static void cop(int a[])
	 { 
		 int count;
		 int n= a.length;
		 int arr[]  = new int[n];
		 
			int x;
		 int i;
		
		 for (i = 0; i < a.length; i++) {
			count=0 ;
			    for (int k = 0; k < a.length; k++) {

	        if (a[i] > a[k] ) 
	         
	        { 
	        

	        	System.out.println(a[i]); 
	        	count++;
	        	System.out.println("count is" + count);
	        	//count= count-count;
	        	System.out.println();
	        		        	
	        }

      	 
	    	
			 
			
	    }
			  
			    //i=count;
			    arr[i]=count;
			   
			// System.out.println("\nArray after adding "  + ":\n" + Arrays.toString(arr)); 
			
		System.out.println();
			  
			   
			    System.out.println(a[i] +   " is greater than "  + count +  " values");
	    System.out.println();
	  
	
        System.out.println("count the value" + count);
System.out.println();


		int 	u =0;
		u= i;
		
		System.out.println("***********pass count*********"  + i);
		  
		
		
		 
	

	}
	
		 for ( i = 0;i<n;i++)
		    	System.out.println("the value of " +arr[i]);		
		
		 
}
	 public static void main(String args[])
	 {
		 int a[]= {100,56,99,44,78,201};
		  Comp.cop(a);
		
	 }

}
