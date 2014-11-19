package ex2;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.Resource;

public class LifeCycleMain2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext(
				"ex2/lifecycle2.xml");
		LifeCycleTest2 life = ctx.getBean("life2", LifeCycleTest2.class);
		String msg = life.getMsg();
		System.out.println(msg);
	}
}
