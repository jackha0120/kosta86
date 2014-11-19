package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodayController {
//	@Autowired
//	private SimpleDateFormat f;
//	@Autowired
//	private Date d;
	@RequestMapping(value="/today.kosta", method=RequestMethod.GET)
	public ModelAndView todate(){
		
//		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
//		
//		Date d = new Date();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("today");
		
//		mav.addObject("msg",f.format(d));
		
		return mav;
		
	}

}
