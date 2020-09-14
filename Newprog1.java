package Sorting_searching;



public class Newprog1 {
	static void sort(int arr[])
	{
		int n = arr.length;
		for(int i =0;i<n-1;i++)
		{
			for(int j =0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					 int temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1]= temp;
					 
				}
				
			
				System.out.println("sub  array values");
				
				
				 for (int z=0; z<n; z++) 
		             System.out.print(arr[z]+" "); 
				System.out.println();
				
			
			}
			
			int d = n;
		d = n-1-i;
System.out.println();
			
			System.out.println(" " + arr[d] +" is greater   than rest   " + d  +  " values " );
			System.out.println(" array values are");
			for(d=0;d<n-1-i;d++)
				
			System.out.println( arr[d]+" ");
			System.out.println();
			
		}
		}
		public static void main(String arg[])
		{
			int arr[] = {1,4,2,0};
			Newprog1.sort(arr);
			System.out.println("sorted array");
			for(int elm : arr)
			{
			
				System.out.println( elm + " ");
			}
		;
		}
		}