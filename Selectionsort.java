package Advprog;

public class Selectionsort {
 static  void sort(int arr[])
{
     for (int i = 0; i < arr.length - 1; i++)  
     {  
         int index = i;  
         for (int j = i + 1; j < arr.length; j++){  
             if (arr[j] < arr[index]){  
                 index = j;  
             }  
         }  
         int smallerNumber = arr[index];   
         arr[index] = arr[i];  
         arr[i] = smallerNumber;  
     }  
 }  
 
 public static void main(String args[])
 {
	 System.out.println("the value of the sorted array");
	 int  arr[] = {10,8,4,3,7,90};
	 
	 Selectionsort.sort(arr);
	 for(int elm : arr)
	 {
		 System.out.println(elm + " ");
	 }
	 
 }
}
