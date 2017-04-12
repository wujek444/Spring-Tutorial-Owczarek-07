package pl.wojcik.jakub.springtutorial;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		User someUser = context.getBean("someUser", User.class);
		System.out.println(someUser);
	}

}
