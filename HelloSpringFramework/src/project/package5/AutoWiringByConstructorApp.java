package project.package5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringByConstructorApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans9.xml");
		
		TextEditor objTextEditor = (TextEditor) context.getBean("textEditor");
		
		objTextEditor.spellCheck();
		
	}

}
