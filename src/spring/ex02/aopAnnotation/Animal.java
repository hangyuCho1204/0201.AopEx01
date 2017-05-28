package spring.ex02.aopAnnotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Animal {

	@Pointcut("execution(* *.eat(..))")
	public void eating(){}
	
	@Before("eating()")
	public void rush(){
		System.out.println("점심시간에 판도라로 달려가요!");
	}
	@After("eating()")
	public void sleep(){
		System.out.println("일본어 시간에 잠을 자요");
	}
}
