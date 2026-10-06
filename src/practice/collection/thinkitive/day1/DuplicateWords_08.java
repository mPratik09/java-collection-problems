package practice.collection.thinkitive.day1;

import java.util.HashMap;
import java.util.Map;

//	Problem 8 — Duplicate words
public class DuplicateWords_08
{

	public static void main(String[] args)
	{
		String str = "java is   java   easy and java is powerful and java";
		duplicateWords(str);
	}

	private static void duplicateWords(String str)
	{
		Map<String, Integer> wordMap = new HashMap<>();

		String[] wordsStr = str.toLowerCase().split("\\s+");

		for (String word : wordsStr)
		{
			wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
		}

		System.out.println("Duplicate Words");
		for (Map.Entry<String, Integer> entry : wordMap.entrySet())
		{
			if (entry.getValue() > 1)
			{
				System.out.println("Word: " + entry.getKey() + "\t Frequncy: " + entry.getValue());
			}
		}

	}

}
