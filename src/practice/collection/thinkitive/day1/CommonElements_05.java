package practice.collection.thinkitive.day1;

import java.util.HashSet;
import java.util.Set;

//	Problem 5 — Common elements between two arrays
public class CommonElements_05
{
	public static void main(String[] args)
	{

		int[] arr1 = new int[] { 2, 3, 54, 7, 5, 34, 65, 9, 22 };
		int[] arr2 = new int[] { 2, 3, 154, 7, 5, 134, 165, 9, 2, 2, 2, 2, 2, 22 };

		commonElements_01(arr1, arr2);
		commonElements_02(arr1, arr2);
	}

	private static void commonElements_01(int[] arr1, int[] arr2)
	{
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> commonElements = new HashSet<Integer>();

		for (int ele : arr1)
		{
			set1.add(ele);
		}

		for (int ele : arr2)
		{
			if (set1.contains(ele))
			{
				commonElements.add(ele);
			}
		}
		System.out.println("Common Elements:\t" + commonElements);
	}

	private static void commonElements_02(int[] arr1, int[] arr2)
	{
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> commonElements = new HashSet<Integer>();

		for (int ele : arr1)
		{
			set1.add(ele);
		}

		System.out.print("Common Elements:\n\t");
		for (int ele : arr2)
		{
			if (set1.contains(ele) && commonElements.add(ele))
			{
				System.out.print(ele + " ");
			}
		}
	}
}
