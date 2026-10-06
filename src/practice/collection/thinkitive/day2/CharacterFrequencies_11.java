package practice.collection.thinkitive.day2;

import java.util.HashMap;
import java.util.Map;

//	Problem 11 — Count Character Frequencies
public class CharacterFrequencies_11
{
	public static void main(String[] args)
	{
		String str = "Time Complexity";
		
		countFrequency(str);
	}

	private static void countFrequency(String str)
	{
		Map<Character, Integer> frequencyMap = new HashMap<>();
		char[] charArray = str.toLowerCase().replaceAll("\\s+", "").toCharArray();
		
		for(char ch : charArray) {
			frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0)+1);
		}
		
		System.out.println("Character occurences: \t" + frequencyMap.entrySet());
	}
}
