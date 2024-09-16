package newspring.helloworldexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("first.xml");
        HP obj = (HP) context.getBean("hp"); 
        obj.disp(); 
    }
}
