package workshop_AddressBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressBook {
	
	protected static List<Contact> addressBook = new ArrayList<>();
	protected static Map<Contact, String> cityBook = new HashMap<>();
	protected static Map<Contact, String> stateBook = new HashMap<>();


	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System!");
		
		Ability.addContact();
		Ability.editContact();
		Ability.deleteContact();
		
		Search.inCityOrState();
		
		ToMap.cityMap();
		ToMap.stateMap();
		
		Count.forCity();
		Count.forState();
		
		addressBook = Sort.byName();
		addressBook = Sort.byCityStateOrZip();
		
		IO.writeToFile(addressBook, "src\\main\\resources\\Addressbook.txt");
		IO.readFromFile("src\\main\\resources\\Addressbook.txt");
		
		
	}
}
