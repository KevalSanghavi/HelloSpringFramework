package project.package1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		
		Messanger objSingletonMessanger = (Messanger) context.getBean("singletonBean");
		objSingletonMessanger.setMessage("This is a message.");
		objSingletonMessanger.printMessage();
		Messanger objSingletonMessanger2 = (Messanger) context.getBean("singletonBean");
		objSingletonMessanger2.printMessage();
		
		Messanger objPrototypeMessanger = (Messanger) context.getBean("prototypeBean");
		objPrototypeMessanger.setMessage("This is a message.");
		objPrototypeMessanger.printMessage();
		Messanger objPrototypeMessanger2 = (Messanger) context.getBean("prototypeBean");
		objPrototypeMessanger2.printMessage();
		
	}

}
