package project.package16;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SQLStoredProcedureApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans26.xml");
		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

		System.out.println("------Records Creation--------");
		studentJDBCTemplate.create("Jon Doe", 10);
		studentJDBCTemplate.create("Jack Smith", 20);
		studentJDBCTemplate.create("Jane Doe", 30);

		System.out.println("------Listing Multiple Records--------");
		List<Student> students = studentJDBCTemplate.listStudents();

		for (Student record : students) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.println(", Age : " + record.getAge());
		}
		System.out.println("----Listing Record with ID = 2 -----");
		Student student = studentJDBCTemplate.getStudent(2);
		System.out.print("ID : " + student.getId());
		System.out.print(", Name : " + student.getName());
		System.out.println(", Age : " + student.getAge());
	}

}
