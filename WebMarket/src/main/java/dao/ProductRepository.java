package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dto.Product;

public class ProductRepository {
	
	private List<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();
	
	public static ProductRepository getInstance() {
		return instance;
	}
	
	private ProductRepository() {
		Product phone = new Product("P1234","iphone 6s", 800000);
		phone.setDescription("4.7-inch, 1234X750 Retina HD display, 8-megapixel");
		phone.setCategory("Smart Phone");
		phone.setManufacture("Apple");
		phone.setUnitsInStock(10001653);
		phone.setCondition("New");
		phone.setFilename("P1234.png");
		
		Product notebook = new Product("P1235", "LG PC 그램", 1500000);
		notebook.setDescription("13.3-inch, IPS LED display, 5rd Generation Intel Core processors");
		notebook.setCategory("Notebook");
		notebook.setManufacture("LG");
		notebook.setUnitsInStock(10012340);
		notebook.setCondition("Refurbished");
		notebook.setFilename("P1235.png");
		
		Product tablet = new Product("P1236", "Galaxy Tab S", 900000);
		tablet.setDescription("212.8*12.6*6.6mm , Super AMOLED display Octa-Core processor");
		tablet.setCategory("Tablet");
		tablet.setManufacture("Samsung");
		tablet.setUnitsInStock(16342000);
		tablet.setCondition("Old");
		tablet.setFilename("P1236.png");
		
		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
	}
	
	public List<Product> getAllProducts(){
		return listOfProducts;
	}
	
	public Product getProductById(String productId) {
		Product productById = null;
		
		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product != null && product.getProductId() !=null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
	
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
	
}
