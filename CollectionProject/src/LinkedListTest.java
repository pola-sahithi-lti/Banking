import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		PhoneContact ph1 = new PhoneContact("Jack", "9866975622", "jack@gmail.com");
		PhoneContact ph2 = new PhoneContact("Mike", "2657643186", "mike@gmail.com");
		PhoneContact ph3 = new PhoneContact("Sam", "976697562", "sam@gmail.com");
		PhoneContact ph4 = new PhoneContact("Ram", "986247562", "ram@gmail.com");
		PhoneContact ph5 = new PhoneContact("John", "985597562", "john@gmail.com");
		System.out.println("Adding Contact...");
		
		LinkedList<PhoneContact> myContactList = new LinkedList<PhoneContact>();
		
		myContactList.add(ph1);
		myContactList.add(ph2);
		myContactList.add(ph3);
		myContactList.add(ph4);
		myContactList.add(ph5);
		
		System.out.println("Added Contacts..");
		
		for(Iterator<PhoneContact> phitr = myContactList.iterator();phitr.hasNext();) {
			PhoneContact p = phitr.next();
			System.out.println("Phone :"+p);
		}
		
	}

}

class PhoneContact{
	String contactName;
	String contactNumber;
	String email;
	public PhoneContact(String contactName, String contactNumber, String email) {
		super();
		this.contactName = contactName;
		this.contactNumber = contactNumber;
		this.email = email;
	}
	@Override
	public String toString() {
		return "PhoneContact [contactName=" + contactName + ", contactNumber=" + contactNumber + ", email=" + email
				+ "]";
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}