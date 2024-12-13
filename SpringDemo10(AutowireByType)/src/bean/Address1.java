package bean;
public class Address1 
{
  private String city;
  private String state;
  public Address1() 
  {
	System.out.println("Address is created ");
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

public void display() 
  {
	System.out.println(" city=" + city + ", state=" + state + " ");
  }

@Override
public String toString() {
	return "Address1 [city=" + city + ", state=" + state + "]";
}

}
