package ex2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class LifeCycleMain {
	public static void main(String[] args) {
		Resource resource = new FileSystemResource("src/ex2/lifecycle.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		ServiceImple life = factory.getBean("lifetest", ServiceImple.class);
		factory.destroyBean("lifetest", life);
		/*
		 * Spring Container�� �۾� ����
		 * 1. XML�� ����
		 * 2. bean�� Object�� ����
		 * 3. Property Injection
		 * 4. init-method
		 * 5. destory
		 */
		
	}
}
