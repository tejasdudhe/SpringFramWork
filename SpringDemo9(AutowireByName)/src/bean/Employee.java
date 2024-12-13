package bean;
public class Employee 
{
  private String ename;
  private Address paddr;// ref
  private Address taddr;// ref
  private Address oaddr;// ref
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String ename, Address paddr, Address taddr, Address oaddr) {
	super();
	this.ename = ename;
	this.paddr = paddr;
	this.taddr = taddr;
	this.oaddr = oaddr;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Address getPaddr() {
	return paddr;
}
public void setPaddr(Address paddr) {
	this.paddr = paddr;
}
public Address getTaddr() {
	return taddr;
}
public void setTaddr(Address taddr) {
	this.taddr = taddr;
}
public Address getOaddr() {
	return oaddr;
}
public void setOaddr(Address oaddr) {
	this.oaddr = oaddr;
}
@Override
public String toString() {
	return "Employee [ename=" + ename + ", paddr=" + paddr + ", taddr=" + taddr + ", oaddr=" + oaddr + "]";
}
  
  
}//End class
