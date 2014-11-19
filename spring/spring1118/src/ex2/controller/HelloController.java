package ex2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
// 여기서 비지니스 로직을 수행한다.
@Controller
public class HelloController {
	// HandlerMapping
	// @RequestMapping : 값으로 요청의 url, mothod로 전송방식
	@RequestMapping(value="/hello.kosta", method=RequestMethod.GET)
	public ModelAndView hello(){
		System.out.println("Log : 비지니스 로직 수행");
		
		// ModelAndView : 컨트롤러에게 처리결과를 보여줄 view, 값
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello"); // Controller -> ViewResolver 에 의해
		// 특정위치 /hello.jsp 형태로 제작이 됨!
		
		// ModelAndView를 통해서 값을 설정함
		mav.addObject("msg", "hi ! My name is Jack !!");
		return mav;
		
	}
}
