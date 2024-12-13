package com.model;
public class Employee 
{
 String ename;
 Address addr;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String ename, Address addr) {
	super();
	this.ename = ename;
	this.addr = addr;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	this.addr = addr;
}
@Override
public String toString() {
	return "Employee [ename=" + ename + ", addr=" + addr + "]";
}
 
}
