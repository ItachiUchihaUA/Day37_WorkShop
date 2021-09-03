package workshop_AddressBook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DataBase {

	protected static Connection newC;

	protected static void connectionToDatabase(String URL) {
		try {
			newC = DriverManager.getConnection(URL, "ujjwal", "Ujjwal123");
			if (newC != null) {
				System.out.println("Connected to Database");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected static void insertSQL(String table, Contact c) {

		try {
			PreparedStatement p = newC.prepareStatement("insert into " + table + " values(?,?,?,?,?,?,?,?)");
			p.setString(1, c.getFirstName());
			p.setString(2, c.getLastName());
			p.setString(3, c.getAddress());
			p.setString(4, c.getCity());
			p.setString(5, c.getState());
			p.setString(6, c.getZip());
			p.setString(7, c.getPhone());
			p.setString(8, c.getPhone());
			p.execute();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
