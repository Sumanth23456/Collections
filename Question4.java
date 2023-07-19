import java.util.*;

class ShoppingCart {
ArrayList<Item> al=new ArrayList<>();
public void add(String productName,double price) {
	   al.add(new Item(productName,price));
}
public void delete(String productName) {
	   Iterator<Item> it=al.iterator();
	   while(it.hasNext()) {
		   Item i=it.next();
		   if(i.productName.equals(productName)) {
			   it.remove();
			   break;
		   }
	   }
}
public void display() {
	   al.forEach(System.out::println);
}

}
class Item{
	String productName;
	double price;
	public Item(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}
public class Main{
	 public static void main(String args[]) {
		 ShoppingCart s1=new ShoppingCart1();
		 s1.add("shampoo", 60);
		 s1.add("soap", 20);
		 s1.add("chocolate", 10);
		 s1.delete("shampoo");
		 s1.display();
	 }
}
	
}
