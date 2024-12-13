package model;

import java.util.Scanner;

public class Product
{
	
  int pid;
  String pname;
  int pqty;
  int pprice;
  public Product() 
  {
	
  }
public Product(int pid, String pname, int pqty, int pprice) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pqty = pqty;
	this.pprice = pprice;
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
public int getPqty() {
	return pqty;
}
public void setPqty(int pqty) {
	this.pqty = pqty;
}
public int getPprice() {
	return pprice;
}
public void setPprice(int pprice) {
	this.pprice = pprice;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", pqty=" + pqty + ", pprice=" + pprice + "]";
}
public void accept()
{
  Scanner sc= new Scanner(System.in);
  System.out.print("\n\nProduct Id:");
  pid=sc.nextInt();
  System.out.print("Product Name:");
  pname=sc.next();
  System.out.print("Product Qty:");
  sc.next();
  pqty=sc.nextInt();
  System.out.print("Product Price:");
  pprice=sc.nextInt();
}
public void display()
{
  System.out.println("\n\nProduct Id:"+pid);
  System.out.println("Product Name:"+pname);
  System.out.println("Product Qty:"+pqty);
  System.out.println("Product Price:"+pprice);
}
}
