
public class Main {

	public static void main(String[] args) {
		Product product = new Product(3, "Laptop", "Asus Laptop", 4500, 7, "Siyah");
		
//		Product product = new Product();
//		product.setName("Laptop");
//		product.setId(3);
//		product.setDescription("Asus Laptop");
//		product.setPrice(4500);
//		product.setStockAmount(7);
	
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
	
	}

}
