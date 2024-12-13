import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class MainApp2 
{
 public static void main(String[] args) 
 {
   ApplicationContext ac= new ClassPathXmlApplicationContext("Spring.xml");
   
   Student s1= (Student) ac.getBean("stud1");
   s1.display();
	    
	    Student s2= (Student) ac.getBean("stud1");
	    s2.display();
	}
}
