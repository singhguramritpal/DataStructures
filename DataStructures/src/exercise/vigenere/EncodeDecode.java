package exercise.vigenere;

import java.util.HashMap;
import java.util.Map;

public class EncodeDecode {

	private Map<Character, String> creatMapping(String key){

		Map<Character, String> map = new HashMap<Character, String>();

		for(char c:key.toCharArray()){
			int index = Properties.CIPHER_CHAR_SET.indexOf(c);
			if(index>0){
				String resultString = Properties.CIPHER_CHAR_SET.substring(index)+Properties.CIPHER_CHAR_SET.substring(0,index+1);
				map.put(c, resultString);
			}
		}
		return map;
	}

	public String encrypt(String key, String target){
		int len = target.length();
		while(key.length()<len){
			key += key;
		}
		key = key.substring(0,len);

		String encryptedString = "";
		int i=0;
		Map<Character, String> map = creatMapping(key);
		for(char c:target.toCharArray()){
			int index = Properties.CIPHER_CHAR_SET.indexOf(c);
			if(index >= 0){
				String text = map.get(key.charAt(i));
				encryptedString += text.charAt(index);
				i++;
			} else{
				encryptedString += c;
			}
		}

		return encryptedString;
	}

	public String decrypt(String key, String target){

		int len = target.length();
		while(key.length()<len){
			key += key;
		}

		key = key.substring(0,len);

		String decryptedString = "";
		int i=0;
		Map<Character, String> map = creatMapping(key);
		for(char c:target.toCharArray()){
			int index = Properties.CIPHER_CHAR_SET.indexOf(c);
			if(index >= 0){
				String text = map.get(key.charAt(i));
				index = text.indexOf(c);
				decryptedString += Properties.CIPHER_CHAR_SET.charAt(index);
				i++;
			} else {
				decryptedString+=c;
			}
		}

		return decryptedString;
	}

}
