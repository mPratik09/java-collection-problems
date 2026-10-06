package practice.collection.thinkitive.day1;

import java.util.HashMap;
import java.util.Map;

//	Problem 7 — Count words in a sentence
public class CountWords_07
{

	public static void main(String[] args)
	{
		String str = "java is easy and java is powerful";
		
		countWords(str);
	}

	private static void countWords(String str)
	{
		String[] wordsArr = str.toLowerCase().split(" ");
		
		Map<String, Integer> wordMap = new HashMap<>();
		
		for(String word : wordsArr) {
			wordMap.put(word, wordMap.getOrDefault(word, 0)+1);
		}
		
		System.out.println("Occurences of words: \t" + wordMap.entrySet());
		
	}

}
