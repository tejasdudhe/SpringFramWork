import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test1 
{
 public static void main(String[] args) 
 {
ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
	Computer comp= (Computer)ac.getBean("cp");
	comp.printData();
 }
}//end class
