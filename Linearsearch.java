package Advprog;

import Sorting_searching.LinearSearch;

public class Linearsearch {
static int search(int arr[],int elm)
{
	int idx = -1;
	int n = arr.length;
	for(int i =0;i<n;i++)
	{
		if(elm == arr[i])
		{
			idx =i;
			break;
		}
	}
	return idx;
}
public static void main(String arsg[])
{
	int arr[] = {1,0,9,8,4,3,7,10,-1};
	int elm =8;
int a= 	Linearsearch.search(arr, elm);
	System.out.println(a + " ");
}
}
