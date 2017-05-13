package project.package1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objHelloWorld = (HelloWorld) context.getBean("helloWorld");
		objHelloWorld.printMessage();
		
		AbstractApplicationContext context2 = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objHelloWorld2 = (HelloWorld) context.getBean("helloWorld");
		objHelloWorld2.printMessage();
		context2.registerShutdownHook();
		context2.close();
	}
	
}
