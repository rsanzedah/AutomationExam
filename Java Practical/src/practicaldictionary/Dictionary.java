package practicaldictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

import javax.swing.text.AbstractDocument.BranchElement;

public class Dictionary {
	public static String localdirectory = System.getProperty("user.dir");
	
	String path = localdirectory+"\\src\\practicaldictionary\\words.txt";
	
	public static void main(String[] args) throws IOException {
		
		String filelocation = localdirectory+"\\src\\practicaldictionary\\words.txt";
		
		File f = new File(filelocation);
		try {
			doesFileExist(filelocation);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String line = null;
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		
		while((line=br.readLine())!=null) { //looping to read all lines
			String[] SplitLine = line.split("-");
			for(String item:SplitLine){
			System.out.println(item);
			}
		}
		//System.out.println(line);
		
		

	}
	
	public static void doesFileExist(String path1) throws FileNotFoundException{
		File f = new File(path1);
		
		if(f.exists() && !f.isDirectory()) {
			System.out.println("File is in Directory");
		}else {
			throw new FileNotFoundException("File is NOT in Directory");	
		}
	
	}

}
