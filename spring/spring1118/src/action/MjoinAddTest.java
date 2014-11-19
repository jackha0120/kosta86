package action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import vo.MJoinVO;
import control.ActionForward;
import dao.DaoService;

public class MjoinAddTest implements Action {
	private String url;
	private boolean method;
	@Autowired
	private DaoService dao;

	@Override
	public ActionForward execute(HttpServletRequest req,
			HttpServletResponse resp) throws IOException {
		MJoinVO vo = new MJoinVO();
		vo.setId(req.getParameter("id"));
		vo.setPwd(req.getParameter("pwd"));
		vo.setName(req.getParameter("name"));
		vo.setInfo(req.getParameter("info"));
		try {
			dao.transactionTest(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new ActionForward(url, method);
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setMethod(boolean method) {
		this.method = method;
	}

}
