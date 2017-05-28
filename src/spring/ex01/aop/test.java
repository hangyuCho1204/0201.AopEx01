package spring.ex01.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/ex01/aop/bean-aop-declare.xml");
		
		Cat c = (Cat)ctx.getBean("cat");
		
		c.eat();
		
		Dog d = (Dog)ctx.getBean("dog");
		
		d.eat();
	}
}
