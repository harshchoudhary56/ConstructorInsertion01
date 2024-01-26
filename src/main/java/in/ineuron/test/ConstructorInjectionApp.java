package in.ineuron.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.WishMessageGenerator;

public class ConstructorInjectionApp {
	public static void main(String[] args) {
		
		System.out.println("**********ClassPathXmlApplicationContext container starting*************");
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("/in/ineuron/cfg/applicationContext.xml");
		System.out.println("**********ClassPathXmlApplicationContext container started**************");

		
		WishMessageGenerator wishMessageGenerator = classPathXmlApplicationContext.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wishMessageGenerator);
		
		String message = wishMessageGenerator.generateMessage("Harsh");
		System.out.println(message);
		
		System.out.println("*********ClassPathXmlApplicationContext is closing***********");
		
	}
}
