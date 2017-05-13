package project.package8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredOnConstructorApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans13.xml");

		TextEditor objTextEditor = (TextEditor) context.getBean("textEditor");

		objTextEditor.spellCheck();
		
	}

}
