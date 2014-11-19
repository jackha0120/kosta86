package ex2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.eclipse.jdt.internal.compiler.ast.MemberValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class PlayMeDao implements Service{

	// spring이 제공하는 Template를 사용
	@Autowired
	private JdbcTemplate JdbcTemplate;
	@Override
	public void add(PlayMeVO vo) {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into playme ");
		sql.append(" values(playme_seq.nextVal,?,?,?,sysdate)");
		//parameter 
		Object[] param = {vo.getPname(),vo.getPrice(),vo.getUsers()};
		JdbcTemplate.update(sql.toString(), param);
		System.out.println("Insert Ok");
	}

	@Override
	public List<PlayMeVO> getList() {
		StringBuffer sql = new StringBuffer();
		sql.append(" select num, pname,price,users ");
		sql.append(" ,to_char(rdate,'yyyy-mm-dd') rdate from playme ");
		sql.append(" order by 1 desc ");
		//JdbcTemplate 를 사용해서 mapRow()사용해서 cursor값을 하나씩 받아서  vo넣고
		//List에 기억을 시켜놓자.
		List<PlayMeVO> list = JdbcTemplate.query(sql.toString(),
				new RowMapper<PlayMeVO>(){
			//while(rs.next())
			@Override
			public PlayMeVO mapRow(ResultSet rs, int arg1)
					throws SQLException {
					PlayMeVO vo = new PlayMeVO();
					vo.setNum(rs.getInt("num"));
					vo.setPname(rs.getString("pname"));
					vo.setUsers(rs.getString("users"));
					vo.setPrice(rs.getInt("price"));
					vo.setRdate(rs.getString("rdate"));
				return vo;
			}});
		return list;
	}

	@Override
	public PlayMeVO getView(int num) {
		StringBuffer sql = new StringBuffer();
		sql.append(" select num, pname,price,users ");
		sql.append(" ,to_char(rdate,'yyyy-mm-dd') rdate from playme ");
		sql.append(" where num=? ");
		sql.append(" order by 1 desc ");
		Object[] param = {num};
		PlayMeVO pmvo = JdbcTemplate.queryForObject(
				sql.toString(), param,new RowMapper<PlayMeVO>(){
			@Override
			public PlayMeVO mapRow(ResultSet rs, int arg1)
					throws SQLException {
				PlayMeVO vo = new PlayMeVO();
				vo.setNum(rs.getInt("num"));
				vo.setPname(rs.getString("pname"));
				vo.setUsers(rs.getString("users"));
				vo.setPrice(rs.getInt("price"));
				vo.setRdate(rs.getString("rdate"));
				return vo;
			}	
		});
		return pmvo;
	}

}
