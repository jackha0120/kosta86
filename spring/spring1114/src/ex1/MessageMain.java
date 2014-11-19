package ex1;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class MessageMain {
	public static void main(String[] args) {
		// AOP ProxyFactortyBean
		ProxyFactoryBean pfBean = new ProxyFactoryBean();
		// Target
		MessageImple target = new MessageImple();
		pfBean.setTarget(target);

		// �޼����� �̸����� ã���ִ� Pointcut
		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
		// pri�� �����ϴ� �޼���� ��� Advice�� ����� �ȴ�.
		pointcut.setMappedName("pri*");

		// Advice
		MessageAdvice advice = new MessageAdvice();
//		pfBean.addAdvice(advice);
		pfBean.addAdvisor(new DefaultPointcutAdvisor(pointcut, advice));

		// Advice ����
		Message prMessage = (Message) pfBean.getObject();
		prMessage.print();
		String msg = prMessage.message();
		System.out.println(msg);
		System.out.println("======================");
	}

}