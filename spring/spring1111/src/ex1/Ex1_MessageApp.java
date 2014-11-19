package ex1;

public class Ex1_MessageApp {
	private String msg;

	// setter - propertie
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String printMsg() {
		StringBuffer sb = new StringBuffer();
		sb.append("당신이 입력한 메세지는").append(msg).append(" 입니다.");
		return sb.toString();
	}

}
