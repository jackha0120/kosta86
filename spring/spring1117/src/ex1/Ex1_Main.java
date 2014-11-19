package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex1_Main {
public static void main(String[] args) {
	ApplicationContext ctx = 
			new GenericXmlApplicationContext("ex1/ex1.xml");
	Dao dao = ctx.getBean("dao", Dao.class);
	dao.fifth();
}
}
