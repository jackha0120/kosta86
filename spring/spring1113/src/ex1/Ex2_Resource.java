package ex1;

import javax.annotation.Resource;
// ex2.xml을 만들어서 빈을 정의하고 메인으로 테스트 해보세요
public class Ex2_Resource {
	@Resource (name="test2")
	private String msg;
	public String printMsg(){
		return "☆"+msg+"☆";
		
	}
}
