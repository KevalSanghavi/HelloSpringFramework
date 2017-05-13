package project.package10;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JSR250AnnotationsApp {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans15.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		
		obj.getMessage();
		
		context.registerShutdownHook();
		
	}

}
