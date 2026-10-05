package practice.collection.thinkitive.day1;

import java.util.HashSet;
import java.util.Set;

//	Problem 3 — Find the first repeating character in a String
public class FirstRepeating_03
{
	public static void main(String[] args)
	{
		String str = "savavaJavsa";
		int[] arr = { 14, 1, 4, 6, 2, 4, 6, 2, 7, 8, 11, 0, 2, 2, 11, 11, 0, 14};

		firstNonRepeatingCharacter(str);
		firstNonRepeatingElement(arr);
	}

	private static void firstNonRepeatingElement(int[] arr)
	{
		Set<Integer> set = new HashSet<>();
		for (int ele : arr)
		{
			if (!set.add(ele))
			{
				System.out.println("First repeating element: \t" + ele);
				break;
			}
		}

	}

	private static void firstNonRepeatingCharacter(String str)
	{
		char[] charArr = str.toLowerCase().toCharArray();

		Set<Character> repeatingEle = new HashSet<Character>();

		for (char ch : charArr)
		{
			if (!repeatingEle.add(ch))
			{
				System.out.println("1st repeating element: \t" + ch);
				break;
			}
		}
	}
}
