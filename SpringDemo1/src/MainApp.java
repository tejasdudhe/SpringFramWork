
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp 
{
 public static void main(String[] args) 
 {
    Resource resource=new ClassPathResource("Spring.xml");
    
    BeanFactory  factory= new  XmlBeanFactory(resource);
    
    Student s1= (Student) factory.getBean("stud1");
    s1.display();
    
    Student s2= (Student) factory.getBean("stud1");
    s2.display();
    

 }//end main
}//end class
