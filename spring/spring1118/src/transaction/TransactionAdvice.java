package transaction;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
// AroundAdvice를 선택한 이유 : 단위처리때 이상이 생기면 rollback을 정상처리 일 경우
// commit하기 위해서 선택!

public class TransactionAdvice implements MethodInterceptor {
	// 트랜젝션의 핵심인 commit, rollback을 가지고 있는 매니저 객체
	private PlatformTransactionManager trManager;

	public void setTrManager(PlatformTransactionManager trManager) {
		this.trManager = trManager;
		System.out.println("트랜잭션 주입 완료!");
	}

	// 인터셉터개념으로 요청에 대한 정보를 받는데, ProxyFactoryBean에 의해서
	// MethodInvocation 쪽 메서드 호출 정보(Target Object의 메서드)를 받아서 주입 받는다.
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// Transaction의 상태 설정값을 가지는 객체를 생성 - 트랜잭션이 요구되는 상태값 이기 때문에
		DefaultTransactionDefinition td = new DefaultTransactionDefinition(
				TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = trManager.getTransaction(td);
		try {
			// commit or rollback 처리
			Object ret = invocation.proceed();
			trManager.commit(status);
			System.out.println("Commit : " + invocation.getMethod().getName());
			return ret;
		} catch (Exception e) {
			trManager.rollback(status);
			System.out.println("Rollback : ");
			System.out.println("Status : " + status);
			throw e;
		}
	}

}
