import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {

	static BufferedReader doesFileExist(String path) throws FileNotFoundException {
		return new BufferedReader(new FileReader(new File(path)));
	}

	public static void main(String[] args) {
		try {
			BufferedReader reader = doesFileExist("C:\\Users\\sanze\\Desktop\\dictionary.txt");
			String inputLine = null;

			Map<String, ArrayList<String>> dictionary = new HashMap<String, ArrayList<String>>();

			while ((inputLine = reader.readLine()) != null) {
				if (inputLine.equals(""))
					continue;

				String[] words = inputLine.split("-");
				if (words.length != 2)
					continue;

				dictionary.put(words[0], new ArrayList<String>(Arrays.asList(words[1].split(","))));
			}
			
			reader.close();

			for (String key : dictionary.keySet()) {
				System.out.println(key);
				System.out.println();
				for (String value : dictionary.get(key)) {
					System.out.println(value);
					System.out.println();
				}
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
