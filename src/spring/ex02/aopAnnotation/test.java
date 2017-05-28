package spring.ex02.aopAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/ex02/aopAnnotation/bean-aop-declare.xml");
		
		Dog d = (Dog)ctx.getBean("dog");
		
		d.eat();
		
	}
}
