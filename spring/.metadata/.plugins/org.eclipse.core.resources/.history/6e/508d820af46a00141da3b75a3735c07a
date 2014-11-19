package ex2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleTest2 {
	private String msg;

	public LifeCycleTest2() {
		System.out.println("생성자 호출");
	}

	public void setMsg(String msg) {
		System.out.println("DI 호출 : msg");
		this.msg=msg;

	}

	public String getMsg() {
		return msg;
	}

	@PostConstruct
	public void init() {
		System.out.println("init 호출");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy호출");
	}

}
