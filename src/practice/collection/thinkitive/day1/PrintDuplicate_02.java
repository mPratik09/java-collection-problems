package practice.collection.thinkitive.day1;

import java.util.HashSet;
import java.util.Set;

//	Problem 2 — Duplicate Elements
public class PrintDuplicate_02
{
	public static void main(String[] args)
	{
		int[] arr = new int[] { 3, 1, 4, 6, 2, 6, 2, 7, 8, 11, 0, 2, 2, 11, 11, 0 };

		printDuplicate(arr);
	}

	private static void printDuplicate(int[] arr)
	{

		Set<Integer> seenElements = new HashSet<Integer>();
		Set<Integer> duplicateElements = new HashSet<Integer>();
		
        for (int ele : arr) {

            if (!seenElements.add(ele)) {
                duplicateElements.add(ele);
            }
        }

        System.out.println("Duplicate elements:\n" + duplicateElements);
	}
}
