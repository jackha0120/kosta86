package ex1;

// 공통관심사항과 핵심로직의 분리 &^^&
public class BizServiceImple implements BizService{


	@Override
	public void bizMethod1() {
		System.out.println("비니지스 로직 수행1");
	}

	@Override
	public void testbizMethod2() {
		System.out.println("비니지스 로직 수행2");
	}

	@Override
	public void securityMethod() {
	
	}

}
