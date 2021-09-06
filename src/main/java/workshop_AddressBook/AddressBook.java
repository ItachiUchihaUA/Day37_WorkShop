package workshop_AddressBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {

	protected static List<Contact> addressBook = new ArrayList<>();
	protected static Map<Contact, String> cityBook = new HashMap<>();
	protected static Map<Contact, String> stateBook = new HashMap<>();

	static String fileURL = "src\\main\\resources\\Addressbook.txt";
	static String csvFileURL = "src\\main\\resources\\csvFile.csv";
	static String jsonFileURL = "src\\main\\resources\\jsonAddressBook.json";

	static String databaseURL = "jdbc:mysql://localhost:3306/addressbooksystem";
	static String tableN = "addressbook";

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System!\n");
		Scanner sc = new Scanner(System.in);
		DataBase.connectionToDatabase(databaseURL,tableN);
		int flag = 1;
		int select;
		while (flag != 0) {
			System.out.println("\n1. Add Contact");
			System.out.println("2. Edit Contact");
			System.out.println("3. Delete Contact");
			System.out.println("4. Search in City or state");
			System.out.println("5. Count by city");
			System.out.println("6. Count by State");
			System.out.println("7. Write to file(.TXT)");
			System.out.println("8. Read from file(.TXT)");
			System.out.println("9. Write to CSVFile");
			System.out.println("10. Read from CSVFile");
			System.out.println("11. Write to Json");
			System.out.println("12. Read from Json");
			System.out.println("13. Show table from Database");
			System.out.println("14. Count by city from database");
			System.out.println("15. Create a list of City and State");
			System.out.println("16. Sort by Name");
			System.out.println("17. Sort by City, State or Zip code");
			System.out.println("18. Exit");

			System.out.println("Select one:");
			 select= sc.nextInt();
			switch (select) {
			case 1:
				Ability.addContact();
				break;
			case 2:
				Ability.editContact();
				break;
			case 3:
				Ability.deleteContact();
				break;
			case 4:
				Search.inCityOrState();
				break;
			case 5:
				Count.forCity();
				break;
			case 6:
				Count.forState();
				break;
			case 7:
				IO.writeToFile(addressBook, fileURL);
				break;
			case 8:
				IO.readFromFile(fileURL);
				break;
			case 9:
				IO.writeInCSV(addressBook, csvFileURL);
				break;
			case 10:
				IO.readFromCSV(csvFileURL);
				break;
			case 11:
				IO.writeToJson(addressBook, jsonFileURL);
				break;
			case 12:
				IO.readFromJSon(jsonFileURL);
				break;
			case 13:
				DataBase.showtable(tableN);
				break;
			case 14:
				DataBase.countByCity(tableN);
				break;
			case 15:
				ToMap.cityMap();
				ToMap.stateMap();
				break;
			case 16:
				addressBook = Sort.byName();
				break;
			case 17:
				addressBook = Sort.byCityStateOrZip();
				break;
			case 18:
				flag = 0;
				break;
				
			default:
				System.out.println("\nInvalid Input!\n");
				System.out.println("Select again\n");
			}

		}
	}
}
