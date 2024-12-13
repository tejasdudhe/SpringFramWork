package bean;
public class Employee 
{
  private String ename;
  private Address addr1;// ref -office
  private Address addr2;// ref -Temporary
  private Address addr3;// ref -Permanent
  public Employee() 
  {
	super();
  }
  public Employee(String ename, Address addr1, Address addr2, Address addr3) 
  {
	super();
	this.ename = ename;
	this.addr1 = addr1;
	this.addr2 = addr2;
	this.addr3 = addr3;
  }
  public String getEname() 
  {
	return ename;
  }
  public void setEname(String ename) 
  {
	this.ename = ename;
  }
  public Address getAddr1() 
  {
	return addr1;
  }
  public void setAddr1(Address addr1) 
  {
	this.addr1 = addr1;
  }
  public Address getAddr2() 
  {
	return addr2;
  }
  public void setAddr2(Address addr2) 
  {
	this.addr2 = addr2;
  }
  public Address getAddr3() 
  {
	return addr3;
  }
  public void setAddr3(Address addr3) 
  {
	this.addr3 = addr3;
  }
  @Override
  public String toString() 
  {
	return "ename=" + ename + "\naddr1=" + addr1 + "\naddr2=" + addr2 + "\naddr3=" + addr3;
  }
}//End class
