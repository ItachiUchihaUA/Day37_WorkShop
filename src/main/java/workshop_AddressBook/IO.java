package workshop_AddressBook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class IO {
	
	protected static void writeToFile(List<Contact> l, String s) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(s))) {
			for (int i = 0; i < l.size(); i++) {
				bw.write(l.get(i).toString()+"\n");
	
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	protected static void readFromFile(String s) {
		try(BufferedReader br = new BufferedReader( new FileReader(s))){
			String str;
			while(!((str=br.readLine()) == null)) {
				System.out.println(str);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
