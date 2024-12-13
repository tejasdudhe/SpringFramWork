import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		String[] xmls = {"computer.xml","hdd.xml"};
		
		ApplicationContext ac= new ClassPathXmlApplicationContext(xmls);
		
		Computer cp = (Computer) ac.getBean("cp");
		System.out.println(cp);

	}

}
