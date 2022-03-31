package ShoppingCart;



public class Product {
	String productname;
	int productprice;
	int productavailability;
	public Product(String productname, int productprice, int productavailability) {
		super();
		this.productname = productname;
		this.productprice = productprice;
		this.productavailability = productavailability;
	}
	@Override
	public String toString() {
		return "Product [productname=" + productname + ", productprice=" + productprice + ", productavailability="
				+ productavailability + "]";
	}
	
	

}
