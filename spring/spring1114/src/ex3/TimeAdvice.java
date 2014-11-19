package ex3;

import org.aspectj.lang.ProceedingJoinPoint;
//ProceedingJoinPoint 는 Around Advice에 필수적인 인자 값이다.
//타겟 객체의 메서드 호출을 알고 잇어야 전, 후 처리로 감쌀 수 있다.
public class TimeAdvice {
	public void checkTime(ProceedingJoinPoint pjp) throws Throwable{
		
		// 메서드 실행 전 수행
		long start = System.currentTimeMillis();
		
		//비지니스 메서드 실행
		pjp.proceed();
		
		// 메서드 실행 후 수행
		long end = System.currentTimeMillis();
		
		System.out.println((end - start) + "밀리초");
	}

}
