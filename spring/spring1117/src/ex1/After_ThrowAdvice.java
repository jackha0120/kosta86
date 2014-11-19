package ex1;
// 예외값을 받아서 처리할 어드바이스 
public class After_ThrowAdvice {
	public void commThrow(Exception ew){
		System.out.println("예외 처리 메세지 :"+ew.getMessage());
		System.exit(0);
	}
}
