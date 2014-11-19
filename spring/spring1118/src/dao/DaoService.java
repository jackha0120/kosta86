package dao;

import java.sql.SQLException;

import vo.MJoinVO;

public interface DaoService {
	public void transactionTest(MJoinVO vo) throws SQLException;
	
}
