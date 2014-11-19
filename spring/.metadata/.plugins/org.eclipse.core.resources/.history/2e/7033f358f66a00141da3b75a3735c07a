package ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AutoWiredService {
	// 어노테이션 : 실행 가능한 주석, 스프링 3.0에서부터 지원,
	// 빈의 설정을 간소화 할 수 있다.
	// 자동으로 빈을 묶어 주는 어노테이션이다.
	// 이름(byName)으로 먼저 찾고 없을 때는 타입(byType)으로 찾아준다.
	// 타입일 때는 모든 빈을 검색하기 때문에 속도가 느려질 수 있다.
	// 단) 이름이든 타입이든 유일해야 되고 타입일 경우 Qualifier어노테이션으로 지정해야한다
	@Autowired
	@Qualifier("hold")
	private String name;

	public String printName() {
		StringBuffer s = new StringBuffer();
		return s.append("당신의 이름은 ").append(name).append("입니다.").toString();

	}

}
