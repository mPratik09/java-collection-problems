package practice.collection.thinkitive.day1;

import java.util.HashMap;
import java.util.Map;

//	Problem 4 — Find the first non-repeating character in a String
public class FirstNonRepeatingElement_04
{
	public static void main(String[] args)
	{
		int[] arr = { 3, 1, 4, 6, 2, 6, 2, 7, 8, 11, 0, 2, 2, 11, 11, 0, 3 };
		firstNonRepeatingElement(arr);
	}

	private static void firstNonRepeatingElement(int[] arr)
	{

		Map<Integer, Integer> arrayMap = new HashMap<>();

		for (int ele : arr)
		{
			arrayMap.put(ele, arrayMap.getOrDefault(ele, 0) + 1);
		}

		for (int ele : arr)
		{
			if (arrayMap.get(ele) == 1)
			{
				System.out.println(" 1st non repeating element :\t" + ele);
				break;
			}
		}
	}
}
