package project.package7;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredOnPropertyApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans12.xml");
		
		TextEditor objTextEditor = (TextEditor) context.getBean("textEditor");
		
		objTextEditor.spellCheck();
		
	}

}
