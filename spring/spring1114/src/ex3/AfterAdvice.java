package ex3;

import org.aspectj.lang.JoinPoint;

public class AfterAdvice {
	// JoinPoint - Around�� ������ ������ AdviceŸ��, ��������!
	public void afterReturningMethod(JoinPoint jp, Object ret) {
		String name = jp.getSignature().getName();

		System.out.println("��ȯ�� : " + ret + "/name : " + name);
	}

}
