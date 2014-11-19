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
	// @ModelAttribute - tvo�� ModelAndView�� addObject��
	public ModelAndView save(@ModelAttribute("tvo") TBoardVO tvo,
			HttpServletRequest request) {
		// Dao�� ������ �� �� �� �ְ�, ����!!
		HttpSession session = request.getSession();
		// �ý��ۿ� �´� documentroot��θ� �����´�.
		String r_path = session.getServletContext().getRealPath("/");
		System.out.println(r_path);
		// �̹����� ���ε� �� ���
		String img_path = "\\img\\";
		System.out.println(img_path);
		// �����ؼ� �̹����� ���� �� ��� ���� ����
		StringBuffer path = new StringBuffer();
		path.append(r_path).append(img_path);
		String oriFn = tvo.getMfile().getOriginalFilename();
		path.append(oriFn);
		tvo.setImg(oriFn);
		System.out.println(path);
		// �̹����� ���� �� ��θ� ���� �� -----------------
		// ���� ���ε�
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