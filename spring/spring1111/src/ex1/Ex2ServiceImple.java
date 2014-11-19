package ex1;

public class Ex2ServiceImple implements Service {
	private int num;
	private String name, str;

	
	public Ex2ServiceImple(int num, String str) {
		super();
		this.num = num;
		this.str = str;
	}

	public Ex2ServiceImple(String str) {
		this.str = str;
		System.out.println("String 형 생성자가 호출!");
	}

	public Ex2ServiceImple(int num) {
		this.num = num;
		System.out.println("int형 생성자가 호출!");
	}

	@Override
	public String print() {
		int res = num * 10;
		System.out.println("Num : " + (num + 10));
		return String.valueOf(res);
	}

	@Override
	public String call() {
		StringBuffer s = new StringBuffer();
		s.append(str).append("★");
		System.out.println("Str : " + str + "★");
		return s.toString();
	}

	@Override
	public String moniter() {
		StringBuffer s = new StringBuffer();
		s.append("Num : " + (num + 10)).append("<br />");
		s.append("Str : " + str + "♥");
		return s.toString();
	}

}
