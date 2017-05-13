package project.package3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectInnerBeansApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans4.xml");
		
		TextEditor objTextEditor = (TextEditor) context.getBean("textEditor");
		
		objTextEditor.spellCheck();
		
	}
	
}
