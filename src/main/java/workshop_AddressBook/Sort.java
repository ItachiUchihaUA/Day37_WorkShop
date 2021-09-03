package workshop_AddressBook;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
	
	protected static List<Contact> byName() {
		return 	AddressBook.addressBook.stream().sorted(Comparator.comparing(Contact::getFirstName)).collect(Collectors.toList());
	}
}
