package practice.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class KMostOccuringWordsInLine {
	
	public List<String> wordFrequency(String line, int k){
		
		List<String> frequentWords = new ArrayList<String>();
		Map<String, Integer> wordFrequency = new HashMap<String, Integer>();
		
		for(String word:line.split(" ")){
			word = word.trim();
			if(word.length()>0){
				wordFrequency.put(word.toLowerCase(), wordFrequency.getOrDefault(word.toLowerCase(), 0)+1);
			}
		}
		
		List<Integer> frequencies = new ArrayList<Integer>();
		frequencies.addAll(wordFrequency.values());
		Collections.sort(frequencies);
		
		List<Integer> mostFrequent = frequencies.subList(frequencies.size()-k, frequencies.size());
		
		for(Entry<String, Integer> word:wordFrequency.entrySet()){
			System.out.println(word.getKey() +" : "+word.getValue());
			if(mostFrequent.contains(word.getValue())){
				frequentWords.add(word.getKey());
				mostFrequent.remove(word.getValue());
			}
		}
		
		return frequentWords;
		
	}

}
