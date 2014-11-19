package ex3;

import org.aspectj.lang.ProceedingJoinPoint;
//ProceedingJoinPoint �� Around Advice�� �ʼ����� ���� ���̴�.
//Ÿ�� ��ü�� �޼��� ȣ���� �˰� �վ�� ��, �� ó���� ���� �� �ִ�.
public class TimeAdvice {
	public void checkTime(ProceedingJoinPoint pjp) throws Throwable{
		
		// �޼��� ���� �� ����
		long start = System.currentTimeMillis();
		
		//�����Ͻ� �޼��� ����
		pjp.proceed();
		
		// �޼��� ���� �� ����
		long end = System.currentTimeMillis();
		
		System.out.println((end - start) + "�и���");
	}

}