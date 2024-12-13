package bean;

public class Address2 {
	 private String city;
	  private String state;
	public Address2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address2(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address2 [city=" + city + ", state=" + state + "]";
	}
	 
}
