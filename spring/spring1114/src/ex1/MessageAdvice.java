package ex1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// AOPAlliance���� �������� interceptor�� ���
// Around Advice
public class MessageAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("�ڡڡڡڡڡڡ�"); // ���� ���� ���� ����
		Object rev = invocation.proceed(); // target Object Method

		if (rev != null)
			System.out.println(rev);
		System.out.println("�ޡޡޡޡޡޡ�"); // ���� ���� ���� ����
		return rev;
	}

}
