package workshop_AddressBook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
	protected static List<Contact> addressBook = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System!");
		Contact contact = new Contact();
		Ability.addContact();
		Ability.editContact();
		Ability.deleteContact();
	}
}
