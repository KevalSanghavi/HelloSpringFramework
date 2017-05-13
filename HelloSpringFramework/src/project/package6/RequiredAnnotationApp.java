package project.package6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredAnnotationApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans10.xml");

		Student objStudent = (Student) context.getBean("student");
		
		System.out.println("Name: " + objStudent.getName());
		System.out.println("Age: " + objStudent.getAge());
		
	}

}
