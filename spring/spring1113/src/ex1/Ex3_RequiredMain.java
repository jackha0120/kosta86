package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex3_RequiredMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ex3.xml");
		Ex3_Required er = ctx.getBean("req", Ex3_Required.class);
		er.print();
	}

}
