package workshop_AddressBook;

import java.util.Scanner;

public class Ability {
	
	protected static void addContact() {
		int flag = 0;
		while (flag == 0) {
			Contact c = new Contact();
			Scanner sc = new Scanner(System.in);
			System.out.println("\n---New Contact---");
			System.out.println("Enter First Name: ");
			c.setFirstName(sc.next());
			System.out.println("Enter Last Name: ");
			c.setLastName(sc.next());
			System.out.println("Enter Address: ");
			c.setAddress(sc.next());
			System.out.println("Enter City: ");
			c.setCity(sc.next());
			System.out.println("Enter State: ");
			c.setState(sc.next());
			System.out.println("Enter Zip code: ");
			c.setZip(sc.next());
			System.out.println("Enter Phone: ");
			c.setPhone(sc.next());
			System.out.println("Enter email: ");
			c.setEmail(sc.next());
			AddressBook.addressBook.add(c);
			System.out.println("Want to Add more?\n");
			flag=2;
			while(flag !=1 || flag != 0 ) {
				System.out.println("\n only Enter 0 for Yes or 1 for No: ");
				flag=sc.nextInt();
			}
		}
	}
	
	protected static void editContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name to Edit : ");
		String name = sc.next();
		int flag2 = 0;
		for (int i = 0; i < AddressBook.addressBook.size(); i++) {
			if (AddressBook.addressBook.get(i).getFirstName() == name) {
				flag2 = 1;
				System.out.println("---Edit Contact---");
				System.out.println("Enter First Name: ");
				AddressBook.addressBook.get(i).setFirstName(sc.next());
				System.out.println("Enter Last Name: ");
				AddressBook.addressBook.get(i).setLastName(sc.next());
				System.out.println("Enter Address: ");
				AddressBook.addressBook.get(i).setAddress(sc.next());
				System.out.println("Enter City: ");
				AddressBook.addressBook.get(i).setCity(sc.next());
				System.out.println("Enter State: ");
				AddressBook.addressBook.get(i).setState(sc.next());
				System.out.println("Enter Zip code: ");
				AddressBook.addressBook.get(i).setZip(sc.next());
				System.out.println("Enter Phone: ");
				AddressBook.addressBook.get(i).setPhone(sc.next());

			}
		}
		if (flag2 == 0) {
			System.out.println("No Such Contact Found!");
		}
	}
}
