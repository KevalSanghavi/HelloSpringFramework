package project.package1;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
// import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	/* // Logging with log4j
	
	static Logger log = Logger.getLogger(MainApp.class.getName());

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		log.info("Going to create HelloWord Obj");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		
		obj.getMessage();

		log.info("Exiting the program");
	} */
	
	// Logging with Jakarta Commons Logging (JCL) API

	static Log log = LogFactory.getLog(MainApp.class.getName());

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		log.info("Going to create HelloWord Obj");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		
		obj.getMessage();

		log.info("Exiting the program");
	}

}
