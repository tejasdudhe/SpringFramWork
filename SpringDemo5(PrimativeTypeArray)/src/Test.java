import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("primativeArray.xml");
		
		Student st = (Student) ac.getBean("st");
		
		System.out.println(st);
		
		

	}

}
