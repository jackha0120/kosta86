//package ex1;
//
//import java.io.File;
//import java.io.IOException;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class UpSaveController {
//
//	@RequestMapping(value = "/upsave.kosta", method = RequestMethod.POST)
//	public ModelAndView save(@RequestParam("mfile") MultipartFile mfile,
//			HttpServletRequest request) {
		// �̹����� ���� �� ���� ��θ� ����
		// ������ ����
//		HttpSession session = request.getSession();
//		// �ý��ۿ� �´� documentroot��θ� �����´�.
//		String r_path = session.getServletContext().getRealPath("/");
//		System.out.println(r_path);
//		// �̹����� ���ε� �� ���
//		String img_path = "\\img\\";
//		System.out.println(img_path);
//		// �����ؼ� �̹����� ���� �� ��� ���� ����
//		StringBuffer path = new StringBuffer();
//		path.append(r_path).append(img_path);
//		String oriFn = mfile.getOriginalFilename();
//		path.append(oriFn);
//		System.out.println(path);
//		// �̹����� ���� �� ��θ� ���� �� -----------------
//		// ���� ���ε�
//		File f = new File(path.toString());
//		try {
//			mfile.transferTo(f);
//		} catch (IllegalStateException | IOException e) {
//			e.printStackTrace();
//		}
//		TBoardVO vo = new TBoardVO();
//		vo.setImg(path.toString());
//		ModelAndView mav = new ModelAndView("success");
//		mav.addObject("img", oriFn);
//		return mav;
//	}
//}