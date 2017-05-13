package project.package2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDefInheritApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans3.xml");
		
		HelloWorld objHelloWorld = (HelloWorld) context.getBean("helloWorld");
		objHelloWorld.printMessage1();
		objHelloWorld.printMessage2();
		
		HelloUSA objHelloUSA = (HelloUSA) context.getBean("helloUSA");
		objHelloUSA.printMessage1();
		objHelloUSA.printMessage2();
		objHelloUSA.printMessage3();
		
	}
	
}
