package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BizMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ex2.xml");
		BizService bean = ctx.getBean("target", BizService.class);
		
		bean.bizMethod1();
		System.out.println("0------------------------0");
		bean.testbizMethod2();
	}
}
