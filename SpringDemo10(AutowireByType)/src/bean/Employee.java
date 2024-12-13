package bean;
public class Employee 
{
  private String ename;
  private Address1 paddr;
  private Address2 taddr;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String ename, Address1 paddr, Address2 taddr) {
	super();
	this.ename = ename;
	this.paddr = paddr;
	this.taddr = taddr;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Address1 getPaddr() {
	return paddr;
}
public void setPaddr(Address1 paddr) {
	this.paddr = paddr;
}
public Address2 getTaddr() {
	return taddr;
}
public void setTaddr(Address2 taddr) {
	this.taddr = taddr;
}
@Override
public String toString() {
	return "Employee [ename=" + ename + ", paddr=" + paddr + ", taddr=" + taddr + "]";
}
  
   
}
