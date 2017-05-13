package project.package4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorBasedDIApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans6.xml");
		
		TextEditor objTextEditor = (TextEditor) context.getBean("textEditor");
		
		objTextEditor.spellCheck();
		
	}

}
