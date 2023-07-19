
import java.util.*;
class InventoryManagement{
	HashMap<String,Product> hm=new HashMap<>();
	public void add(String pname,int quantity) {
		hm.put(pname,new Product(pname,quantity));
	}
	public void delete(String pnmae) {
		hm.remove(pnmae);
	}
	public void edit(String pname,int newQuantity) {
		Product p=hm.get(pname);
		if(pname!=null) {
			p.quantity=newQuantity;
		}
	}
	public void available(String pname) {
		Product p=hm.get(pname);
		if(p.quantity==0) {
			System.out.println("product not Available");
		}
		else
		System.out.println("product Available");
	}
	public void display() {
		System.out.println(hm);
	}
}
class Product{
	String pname;
	int quantity;
	public Product(String pname, int quantity) {
		super();
		this.pname = pname;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [pname=" + pname + ", quantity=" + quantity + "]";
	}
	
	}
	
	

 class Question3{
	 public static void main(String[] args) {
		 InventoryManagement im=new InventoryManagement();
		 im.add("shampoo", 0);
		 im.add("chocolates", 100);
		 im.add("soaps", 100);
		 im.display();
		 im.available("shampoo");
}
}