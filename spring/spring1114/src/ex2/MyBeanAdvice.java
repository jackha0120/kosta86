package ex2;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

// Spring 프레임 웍에서 제공하는 aop
public class MyBeanAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] id, Object target)
			throws Throwable {
		System.out.println("Log :-----------------");
		System.out.println("메서드의 이름 : " + method.getName());
		System.out.println("Target Obj : " + target.getClass().getName());
		String idv = (String) id[0];
		System.out.println("ID : " + idv);
		System.out.println("Log :-----------------");

	}

}
