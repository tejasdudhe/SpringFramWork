package controller;
import dao.*;
import model.*;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp 
{
 public static void main(String[] args) 
 {
   ApplicationContext ac= new ClassPathXmlApplicationContext("Spring.xml");
   ProductDaoInterface pdao=(ProductDaoImpl)ac.getBean("pdao");
   int ch=0;
   Scanner sc= new Scanner(System.in);
   do
   {
	System.out.println("1) Add Product");
	System.out.println("2) Display Product by Id");
	System.out.println("3) Show All Product");
	System.out.println("4) Update Product");
	System.out.println("5) Delete Product");
	System.out.print("Enter your choice:");
	ch=sc.nextInt();
	switch(ch)
	{
	 case 1:
             Product p = new Product();
             p.accept();
             int i =pdao.save(p);
             if(i>0)
            	 System.out.println("Product Record Inserted Successfully..\n\n");
             else
            	 System.out.println("Record Denied..\n\n");
             break;
	 case 2:
             System.out.println("Enter product Id:");
             int pid=sc.nextInt();
             p=pdao.showProduct(pid);
             p.display();
             break;
	 case 3:
             List<Product> plist=pdao.showAll();
             Iterator<Product>it=plist.iterator();
             while(it.hasNext())
             {
            	 Product p1=it.next();
            	 p1.display();
             }
             break;
	 case 4:
            System.out.println("Enter product Id:");
            pid=sc.nextInt();
            p= new Product();
            p.setPid(pid);
            System.out.print("Product Name:");
            String pname=sc.next();
            System.out.print("Product Qty:");
            int pqty=sc.nextInt();
            System.out.print("Product Price:");
            int pprice=sc.nextInt();
            p.setPname(pname);
            p.setPqty(pqty);
            p.setPprice(pprice);
            i=pdao.update(p);
            if(i>0)
           	 System.out.println("Product Record updated Successfully..\n\n");
            else
           	 System.out.println("Update Operation Denied..\n\n");
            break;
	 case 5:
         System.out.println("Enter product Id:");
         pid=sc.nextInt();
         p= new Product();
         p.setPid(pid);
         i=pdao.delete(p);
         if(i>0)
        	 System.out.println("Product Record deleted Successfully..\n\n");
         else
        	 System.out.println("Delete Operation Denied..\n\n");
         break;
	default:
		     break;
	}//end switch
   }while(ch!=5);//end while
 }//end main
}//end class
