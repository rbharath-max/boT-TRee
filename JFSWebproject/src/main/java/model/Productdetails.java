package model;

public class Productdetails {
	private int pid;
	private String pname;
	  private  int price;
	  private  int offer;
	public Productdetails(int pid, String pname, int price, int offer) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.offer = offer;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getOffer() {
		return offer;
	}
	public void setOffer(int offer) {
		this.offer = offer;
	}
	@Override
	public String toString() {
		return "Productdetails [pid=" + pid + ", pname=" + pname + ", price=" + price + ", offer=" + offer + "]";
	}
	  
	  

}
