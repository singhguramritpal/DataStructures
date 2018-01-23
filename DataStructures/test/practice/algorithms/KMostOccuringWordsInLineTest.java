package practice.algorithms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class KMostOccuringWordsInLineTest {
	
	KMostOccuringWordsInLine words = new KMostOccuringWordsInLine();

	@Test
	public void testWordFrequency() {
		File file = new File("/Users/ugp/Desktop/file.txt");
		StringBuffer line = new StringBuffer(); 
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String l="";
			while((l = br.readLine())!=null){
				line.append(l);
				line.append(l+" ");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		List<String> frequentWords = words.wordFrequency(line.toString(), 10);
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		for(String word: frequentWords){
			System.out.println(word);
		}
			
	}

}
