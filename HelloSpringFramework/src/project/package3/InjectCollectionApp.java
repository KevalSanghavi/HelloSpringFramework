package project.package3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectCollectionApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans5.xml");
		
		TheCollection objTheCollection = (TheCollection) context.getBean("theCollection");
		
		objTheCollection.getAddressList();
		objTheCollection.getAddressSet();
		objTheCollection.getAddressMap();
		objTheCollection.getAddressProp();
	}
	
}
