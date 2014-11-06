package conn;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class ConnUtil {
	private static DataSource ds;
	static {
		try {
			InitialContext ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/myora");

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public static Connection getDs() throws SQLException {
		return ds.getConnection();
	}

}
