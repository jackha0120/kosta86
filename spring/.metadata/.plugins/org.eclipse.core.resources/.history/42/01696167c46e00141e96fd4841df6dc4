package action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import control.ActionForward;
import ex2.PlayMeDao;
import ex2.PlayMeVO;

public class PlayDetailAction implements Action{
	private String url;
	private boolean method;
	@Autowired
	private PlayMeDao jdbcDao;
	@Override
	public ActionForward execute(HttpServletRequest req,
			HttpServletResponse resp) throws IOException {
		int num = Integer.parseInt(req.getParameter("num"));
		PlayMeVO v =  jdbcDao.getView(num);
		req.setAttribute("e", v);
		return new ActionForward(url, method);
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setMethod(boolean method) {
		this.method = method;
	}

}
