package action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import control.ActionForward;
import ex2.PlayMeDao;
import ex2.PlayMeVO;

public class PlayAddAction implements Action{
	private String url;
	private boolean method;
	@Autowired
	private PlayMeDao jdbcDao;
	@Override
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse resp) throws IOException {
		request.setCharacterEncoding("euc-kr");
		PlayMeVO v = new PlayMeVO();
		v.setPname(request.getParameter("pname"));
		v.setPrice(Integer.parseInt(request.getParameter("price")));
		v.setUsers(request.getParameter("users"));
		jdbcDao.add(v);
		return new ActionForward(url, method);
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setMethod(boolean method) {
		this.method = method;
	}
}
