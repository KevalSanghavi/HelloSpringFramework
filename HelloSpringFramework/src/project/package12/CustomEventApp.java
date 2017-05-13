package project.package12;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomEventApp {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans22.xml");
		
		CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
		
		cvp.publish();
		cvp.publish();
		
	}

}
