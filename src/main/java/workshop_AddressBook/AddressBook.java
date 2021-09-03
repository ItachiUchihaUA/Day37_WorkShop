package workshop_AddressBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AddressBook {
	
	protected static List<Contact> addressBook = new ArrayList<>();
	protected static Map<Contact, String> cityBook = new HashMap<>();
	protected static Map<Contact, String> stateBook = new HashMap<>();


	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System!");
		Contact contact = new Contact();
		
		Ability.addContact();
		Ability.editContact();
		Ability.deleteContact();
		
		Search.inCityOrState();
		
		ToMap.cityMap();
		ToMap.stateMap();
		
		Count.forCity();
		Count.forState();
		
		addressBook = Sort.byName();
		
	}
}
