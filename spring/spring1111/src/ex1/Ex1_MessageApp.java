package ex1;

public class Ex1_MessageApp {
	private String msg;

	// setter - propertie
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String printMsg() {
		StringBuffer sb = new StringBuffer();
		sb.append("����� �Է��� �޼�����").append(msg).append(" �Դϴ�.");
		return sb.toString();
	}

}