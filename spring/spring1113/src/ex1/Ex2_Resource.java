package ex1;

import javax.annotation.Resource;
// ex2.xml�� ���� ���� �����ϰ� �������� �׽�Ʈ �غ�����
public class Ex2_Resource {
	@Resource (name="test2")
	private String msg;
	public String printMsg(){
		return "��"+msg+"��";
		
	}
}
