public class Student 
{
   int sid;
   String sname;
   static int count=0;
   public Student() 
   {
	super();
	sid=++count;
   }
   public Student(String sname) 
   {
	super();
	this.sid = ++count;
	this.sname = sname;
   }
   public int getSid() 
   {
	return sid;
   }
   public void setSid(int sid) 
   {
	this.sid = sid;
   }
   public String getSname() 
   {
	return sname;
   }
   public void setSname(String sname) 
   {
	this.sname = sname;
   }
   @Override
   public String toString() 
   {
	return "Student [sid=" + sid + ", sname=" + sname + "]";
   }
   public void display()
   {
	 System.out.println("Student Id:"+sid);
	 System.out.println("Student Name:"+sname);
   }
}// end class
