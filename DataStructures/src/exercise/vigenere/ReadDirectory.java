package exercise.vigenere;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadDirectory {
	
	EncodeDecode cipher = new EncodeDecode();
	
	public void createEncryptionDirectory(String key, String target){
		File[] files = new File(target).listFiles();

		String tempPath = target+".encrypted";
		readDecryptedFiles(files, tempPath, key);

	}

	public void createDecryptionDirectory(String key, String target){
		File[] files = new File(target).listFiles();

		String tempPath = target.replace(".encrypted","")+".decrypted";
		readEncryptedFiles(files, tempPath, key);

	}

	private void readDecryptedFiles(File[] files, String filePath, String key){
		for(File file:files){
			if(file.isDirectory()){
				readDecryptedFiles(file.listFiles(), filePath+"/"+file.getName(), key);
			} else{
				if(file.getName().contains(".txt") || file.getName().contains(".doc")){
					String target = readDecryptedFile(file);
					String encryptedString = cipher.encrypt(key, target);
					writeEncryptedFile(encryptedString, filePath+"/"+file.getName());
				}
			}
		}
	}

	private void readEncryptedFiles(File[] files, String filePath, String key){
		for(File file:files){
			if(file.isDirectory()){
				readEncryptedFiles(file.listFiles(), filePath+"/"+file.getName(), key);
			} else{
				if(file.getName().contains(".txt") || file.getName().contains(".doc")){
					String target = readEncryptedFile(file);
					String decryptedString = cipher.decrypt(key, target);
					writeDecryptedFile(decryptedString, filePath+"/"+file.getName());
				}
			}
		}
	}

	private String readDecryptedFile(File file){

		FileReader fr = null;
		BufferedReader br = null;
		String line;
		StringBuilder result = new StringBuilder();

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			line = br.readLine();
			while(line != null){
				result.append(line);
				line = br.readLine();
				if(line!=null){
					result.append("\\n");
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception "+e);
		} catch (IOException e) {
			System.out.println("Error reading the file "+e);
		} finally{
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				System.out.println("Error closing the reader "+ e);
			}
		}
		return result.toString();
	}
	
	private String readEncryptedFile(File file){

		FileReader fr = null;
		BufferedReader br = null;
		String line;
		StringBuilder result = new StringBuilder();

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			line = br.readLine();
			while(line != null){
				result.append(line);
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception "+e);
		} catch (IOException e) {
			System.out.println("Error reading the file "+e);
		} finally{
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				System.out.println("Error closing the reader "+ e);
			}
		}

		return result.toString();
	}

	private void writeDecryptedFile(String data, String path){

		File file = new File(path);
		file.getParentFile().mkdirs();
		BufferedWriter writer=null;
		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(data);
		} catch (IOException e) {
			System.out.println("error writing to  a file "+ e);
		} finally{
			try {
				if(writer!=null){
					writer.close();
				}
			} catch (IOException e) {
				System.out.println("Error closing the file "+e);
			}
		}

	}
	
	private void writeEncryptedFile(String data, String path){

		File file = new File(path);
		file.getParentFile().mkdirs();
		BufferedWriter writer=null;
		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(data);
		} catch (IOException e) {
			System.out.println("error writing to  a file "+ e);
		} finally{
			try {
				if(writer!=null){
					writer.close();
				}
			} catch (IOException e) {
				System.out.println("Error closing the file "+e);
			}
		}

	}

}
