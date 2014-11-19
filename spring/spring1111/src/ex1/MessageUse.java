package ex1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MessageUse {
	public static void main(String[] args) {
		// xml을 읽어 와야 하는데...
		Resource resource = new ClassPathResource("ex1/ex1_msg.xml");
		System.out.println("Resource:" + resource);
		// 컨테이너에 ex1_msg.xml에 정의된 빈의 목록을 저장
		BeanFactory factory = new XmlBeanFactory(resource);
		System.out.println("Factory:" + factory);

		// 컨테이너에 생성된 빈을 참조
		Ex1_MessageApp bean = factory.getBean("msg", Ex1_MessageApp.class);
		System.out.println("Result:" + bean.printMsg());
	}
}
