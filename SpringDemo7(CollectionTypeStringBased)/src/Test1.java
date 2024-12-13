import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test1 
{
 public static void main(String[] args) 
 {
 ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
	 Employee e=(Employee) ac.getBean("emp");
	 e.printData();
 }// end main
}// end class
