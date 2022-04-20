package AddressBookMain;

import java.util.Objects;

public class Contact {
	String firstName;
	String lastName;
	String city;
	String state;
	String email;
	String zip;
	String phoneno;

	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public String getPhoneno() {
		return phoneno;
	}


	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}


	@Override
	public String toString() {
		return firstName;
	}


	@Override
	public int hashCode() {
		return firstName.hashCode();
	}


	@Override
	public boolean equals(Object c) {	
		return this.firstName.equals(((Contact) c).getFirstName() );
	}

	
}
