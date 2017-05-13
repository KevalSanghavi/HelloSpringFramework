package project.package6;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredOnSetterApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans11.xml");
		
		TextEditor objTextEditor = (TextEditor) context.getBean("textEditor");
		
		objTextEditor.spellCheck();
		
	}

}
