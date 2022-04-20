package AddressBookMain;
import java.util.Scanner;
public interface IAddressBook {
		void addContact(Scanner sc);
		void showContact();
		void editContact(Scanner sc);
		void deletContact(Scanner sc);
		void createaddressBook();
}
