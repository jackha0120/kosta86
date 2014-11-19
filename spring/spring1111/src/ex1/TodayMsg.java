package ex1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TodayMsg {

	public static void main(String[] args) {
		ApplicationContext todate = new ClassPathXmlApplicationContext("ex1/exam_date.xml");
		ExamToday bean = todate.getBean("msg", ExamToday.class);
		System.out.println(bean.printToDate());

	}
}
