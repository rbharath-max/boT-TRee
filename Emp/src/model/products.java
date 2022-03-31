package model;

public class products {
	 int product_id;
	 String product_name;
	 int price;
	 int quantity;
	public products() {
		
	}
	public products(int product_id, String product_name, int price, int quantity) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
		this.quantity = quantity;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "products [product_id=" + product_id + ", product_name=" + product_name + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
		

}
