package Advprog;



public class Secondlargest {
public static void comp(int arr[])
{
	int n = arr.length;
	for(int i =0;i<n;i++)
	{
		for(int j =i+1;j<n;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp = arr[i];
				arr[i] =arr[j];
				arr[j] = temp;
				
			}
		}
	}
	System.out.println("the second largest element : "  +    arr[n-2]);
}
public static void main(String args[])
{
int	arr[] = {10,40,90,30,80};
Secondlargest.comp(arr);
}
}
