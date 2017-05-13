package project.package12;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventHandlerApp {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans21.xml");

		// Let us raise a start event.
		context.start();

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();

		// Let us raise a stop event.
		context.stop();
		
	}

}
