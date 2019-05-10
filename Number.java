
/**
 * @author SmallWorld
 *
 */
public class Number {

	private String id;
	private String price;
	private String brand;
	private String status = "0";
	private String customer;
	private long time;
	
	
	
	public Number() {
		super();
	}
	
	
	public Number(String id, String price, String brand, String status) {
		super();
		this.id = id;
		this.price = price;
		this.brand = brand;
		this.status = status;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Number [id=" + id + ", price=" + price + ", brand=" + brand + ", status=" + status + ", customer="
				+ customer + ", time=" + time + "]";
	}
	
	
	
}
