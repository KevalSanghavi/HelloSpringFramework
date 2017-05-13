package project.package9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans14.xml");

		Profile objProfile = (Profile) context.getBean("profile");
		
		objProfile.printAge();
		objProfile.printName();
		
	}

}
