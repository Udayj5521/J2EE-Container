package j2ee_Container.setterIntialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Person.xml");
		
		Person p = (Person) context.getBean("myPerson");
		System.out.println(p.getId());
		System.out.println(p.getName());
		
	}

}
