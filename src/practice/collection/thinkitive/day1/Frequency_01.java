package practice.collection.thinkitive.day1;

import java.util.HashMap;
import java.util.Map;

//	Problem 1 — Count Frequency of Elements
public class Frequency_01
{
	public static void main(String[] args)
	{
		int[] arr = new int[] { 3, 1, 4, 6, 2, 6, 2, 7, 8, 11, 0, 2, 2, 11, 11, 0 };

		Map<Integer, Integer> map = new HashMap<>();

		for (int ele : arr)
		{
			map.put(ele, map.getOrDefault(ele, 0) + 1);
		}
		System.out.println("! Result:\t" + map);
	}
}
