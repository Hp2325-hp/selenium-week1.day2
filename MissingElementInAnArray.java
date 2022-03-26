package week1.day2.assignments;

import java.util.Iterator;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};

		for(int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int num=arr[0];
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]!=num)
			{
				System.out.println("The missing number is "+num);
				break;
			}
			else
			{
				num++;
			}
		}
			

	}

	
}
