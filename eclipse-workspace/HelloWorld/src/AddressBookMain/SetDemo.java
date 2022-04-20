package AddressBookMain;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
			Set<Contact> set=new HashSet<>();
			
			Contact contact1=new Contact();	
			contact1.setFirstName("Kruthika");
			contact1.setFirstName("G");

			Contact contact2=new Contact();	
			contact2.setLastName("kruthi");
			contact2.setLastName("g");
			
			set.add(contact2);
			set.add(contact1);
			
			System.out.println(set);
			
			System.out.println(contact1.equals(contact2));
			
			System.out.println(contact1.hashCode());
			System.out.println(contact2.hashCode());
	}
}
