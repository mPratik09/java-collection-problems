package practice.collection.thinkitive.day1;

import java.util.HashSet;
import java.util.Set;

//	Problem 6 — Elements present only in the first array
public class ElementsInFirstArrayOnly_06
{
	public static void main(String[] args)
	{
		int[] arr1 = new int[] { 2, 3, 54, 7, 5, 34, 65, 9, 22 };
		int[] arr2 = new int[] { 2, 3, 154, 7, 5, 134, 165, 9, 2, 2, 2, 2, 2, 22 };

		elementsFromFirstArray_01(arr1, arr2);
		System.out.println();
		elementsFromFirstArray_02(arr1, arr2);
	}

	private static void elementsFromFirstArray_01(int[] arr1, int[] arr2)
	{
		Set<Integer> set = new HashSet<>();

		for (int ele : arr2)
		{
			set.add(ele);
		}

		System.out.println("Elements present only in the first array:");
		for (int ele : arr1)
		{
			if (!set.contains(ele))
			{
				System.out.print(" " + ele);
			}
		}
	}

	private static void elementsFromFirstArray_02(int[] arr1, int[] arr2)
	{
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		for(int ele : arr1) {
			set1.add(ele);
		}
		
		for(int ele : arr2) {
			set2.add(ele);
		}
		
		set1.removeAll(set2);
		
		System.out.println("Elements form array 1 only: \t" + set1);
	}
}
