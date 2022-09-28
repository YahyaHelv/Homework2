package classesWithAttributes;

import javax.management.Descriptor;

public class Main {
	public static void main(String[] args) {
		Product product = new Product(id: 1,name:"Laptop",Descripton:"Asus Laptop", price:3000, stockAmoınt:2, renk:Siyah);
	
		
		
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		
	System.out.println(product.getKod());
		
	}

}
