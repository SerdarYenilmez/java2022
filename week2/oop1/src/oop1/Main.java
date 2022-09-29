package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		product1.setImageUrl("blabla.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(6500);
		product2.setDiscount(4);
		product2.setUnitsInStock(8);
		product2.setImageUrl("blabla2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitPrice(4500);
		product3.setDiscount(9);
		product3.setUnitsInStock(7);
		product3.setImageUrl("blabla3.jpg");

		Product[] products = { product1, product2, product3 };
       
	
		for (Product product : products) {
			System.out.println(product.getName);
		}	
			
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("2343242");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("serdar");
		individualCustomer.setLastName("yenilmez");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Dadaşlar");
		corporateCustomer.setTaxNumber("12232423432");
		corporateCustomer.setPhone("23243242");
		corporateCustomer.setCustomerNumber("223454532");
		
		
	}
}