package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.ServletResponseMethodArgumentResolver;

@Aspect
public class AfterAdvice {
	@Autowired
	private SimpleDateFormat f;
	@Autowired
	private Date d;

	@Before("execution(* *.Today*.todate*(..))")
	public void afterReturnMethod(JoinPoint jp) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
				.currentRequestAttributes()).getRequest();

		request.setAttribute("msg", f.format(d));
		HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getResponse();
		if (response == null) {
			System.out.println("null *");
		} else {
			System.out.println("not null **");
		}
		try {
			PrintWriter out = response.getWriter();
			out.println("』』』』』』");
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
