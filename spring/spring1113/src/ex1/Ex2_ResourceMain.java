package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex2_ResourceMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ex2.xml");
		Ex2_Resource rs = ctx.getBean("resource", Ex2_Resource.class);
		System.out.println(rs.printMsg());
	}

}
