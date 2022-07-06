package j2ee_Container.constructorIntialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Student.xml");
		Student s = (Student) context.getBean("myStudent");
		System.out.println(s.getName());
		System.out.println(s.getReg_no());
	}

}
