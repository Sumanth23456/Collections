
import java.util.*;
class AddressBook{
	HashMap<String,Contact> hm=new HashMap<>();
	public void add(String name, String phoneNumber, String email) {
		hm.put(name, new Contact(name,phoneNumber,email));
	}
	public void delete(String name) {
		hm.remove(name);
	}
	public void search(String name) {
		System.out.println(hm.get(name));
	}
	public void display() {
		System.out.println(hm);
	}
	public void edit(String name, String newPhoneNumber, String newEmail) {
		Contact c=hm.get(name);
		if(name!=null) {
			c.email=newEmail;
			c.phoneNumber=newPhoneNumber;
		}
}
class Contact{
	String name;
	String phoneNumber;
	String email;
	public Contact(String name, String phoneNumber, String email) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	
	}
	
	
}
 class Question1 {
	 public static void main(String[] args) {
		 AddressBook ab=new AddressBook();
		 ab.add("Sumanth", "98765432", "sumanth@email");
		 ab.add("ram", "987654753", "ram@email");
		 ab.add("krishna", "987656732", "krishna@email");
		 ab.delete("Sumanth");
		 ab.display();
		 
}
}