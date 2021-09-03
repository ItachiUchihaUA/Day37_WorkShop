package workshop_AddressBook;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {
	
	protected static Connection newC;
	
	protected static void connectionToDatabase(String URL) {
		try {
		newC = DriverManager.getConnection(URL, "ujjwal", "Ujjwal123");
		if(newC!=null) {
			System.out.println("Connected to Database");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
