package ex1;

import org.springframework.beans.factory.annotation.Required;

// @Required �ʼ� Property�� �˻����ִ� ������̼�
public class Ex3_Required {
	private String name, msg;

	public void print() {
		System.out.println("Name : " + name);
		System.out.println("Msg : " + msg);
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}