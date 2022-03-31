package com.example.Webapp;

public class Product {
	private int pid;
	private String productName;
	
	public Product() {
		super();
	}

	public Product(int pid, String productName) {
		super();
		this.pid = pid;
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	

}
