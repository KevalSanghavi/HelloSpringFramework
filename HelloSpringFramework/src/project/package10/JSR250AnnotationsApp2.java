package project.package10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JSR250AnnotationsApp2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans16.xml");

		TextEditor objTextEditor = (TextEditor) context.getBean("textEditor");

		objTextEditor.spellCheck();
		
	}

}
