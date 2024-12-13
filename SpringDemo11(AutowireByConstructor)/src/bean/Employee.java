package bean;
import org.springframework.beans.factory.annotation.Autowired;
public class Employee 
{
	private String empName;
	private Address address;
	
	public Employee() {
		super();
		
	}


	public Employee(String empName) 
	{
		super();
		this.empName = empName;
	}
	
	
	public Employee (Address address, String empName) 
	{
		this.address = address;
		this.empName = empName;
		
	}
	public String getEmpName() 
	{
		return empName;
	}
	public Address getAddress() 
	{
		return address;
	}
	@Override
	public String toString() 
	{
		return "Employee [empName=" + empName + ", address=" + address + "]";
	}
}
