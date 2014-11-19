package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.annotation.Resource;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
// 공통관심사항!
// AOP의 핵심인 proxyFactoryBean의 타겟으로 설정한다
//간달프가 호빗의 집에다가 표식을 넣자 드워프들이 모인다.
@Aspect
public class BizAdvice {
	@Autowired
	private SimpleDateFormat f;
	
	@Autowired
	private Scanner src;
	
	@Resource(name="date")
	private Date d;
	
	@Before("execution(* ex1.BizService*.*(..))")
	public void beforMethod(){
		System.out.print("당신의 이름은?");
		String  n = src.nextLine();
		System.out.println(n);
		System.out.println(f.format(d));
	}
}








