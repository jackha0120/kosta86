package ex1;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TBoardController {
	@Autowired
	private TBoardDao dao;

	@RequestMapping(value = "/save.kosta", method = RequestMethod.POST)
	// @ModelAttribute - tvo가 ModelAndView의 addObject됨
	public ModelAndView save(@ModelAttribute("tvo") TBoardVO tvo,
			HttpServletRequest request) {
		// Dao에 연결을 할 수 도 있고, 가공!!
		HttpSession session = request.getSession();
		// 시스템에 맞는 documentroot경로를 가져온다.
		String r_path = session.getServletContext().getRealPath("/");
		System.out.println(r_path);
		// 이미지를 업로드 할 경로
		String img_path = "\\img\\";
		System.out.println(img_path);
		// 조합해서 이미지가 저장 될 경로 값을 구현
		StringBuffer path = new StringBuffer();
		path.append(r_path).append(img_path);
		String oriFn = tvo.getMfile().getOriginalFilename();
		path.append(oriFn);
		tvo.setImg(oriFn);
		System.out.println(path);
		// 이미지가 저장 될 경로를 지정 끝 -----------------
		// 파일 업로드
		File f = new File(path.toString());
		
		try {
			tvo.getMfile().transferTo(f);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		dao.add(tvo);
		return new ModelAndView("success");
	}
}
