package packg0;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		Bean0 bean0 = (Bean0) applicationContext.getBean("packg0.Bean0");
		System.out.println(bean0.getProperty0());
	}
}
