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

		// 메서드의 이름으로 찾아주는 Pointcut
		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
		// pri로 시작하는 메서드는 모두 Advice의 대상이 된다.
		pointcut.setMappedName("pri*");

		// Advice
		MessageAdvice advice = new MessageAdvice();
//		pfBean.addAdvice(advice);
		pfBean.addAdvisor(new DefaultPointcutAdvisor(pointcut, advice));

		// Advice 적용
		Message prMessage = (Message) pfBean.getObject();
		prMessage.print();
		String msg = prMessage.message();
		System.out.println(msg);
		System.out.println("======================");
	}

}
