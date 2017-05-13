package project.package14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectJBasedAOPApp {

	public static void main(String[] args) {
		
		System.out.println("Inside main.");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans24.xml");
		
		System.out.println("Before creating Student object.");
		Student student = (Student) context.getBean("student");
		System.out.println("After creating Student object.");
		
		System.out.println("Before calling getName.");
		student.getName();
		System.out.println("After calling getName.");
		
		System.out.println("Before calling getAge.");
		student.getAge();
		System.out.println("After calling getAge.");
		
		System.out.println("Before calling printThrowException.");
		student.printThrowException();
		System.out.println("Before calling printThrowException.");
		
	}

}
