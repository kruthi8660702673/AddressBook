package AddressBookMain;

import java.util.Scanner;
public class addressBookImp implements IContact{
	Scanner sc = new Scanner(System.in);

	public void createaddressBook() {
		System.out.println("*************Address Book***************");
		System.out.println("*************Add New Address Book*************");
		System.out.println("Enter Address Book Name: ");
		String name = sc.nextLine();
		System.out.println("Address Book Name is : " + name);
	}

	@Override
	public void createAddressBook() {
		// TODO Auto-generated method stub
		
	}

	
}
