package ex2;

import conn.ConnUtils;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kosta Document : MockTest Created on : 2014. 10. 31. ¿ÀÈÄ 3:22:12
 */
public class MockTest {

    public static void main(String[] args) {;
        try {
            Connection con = ConnUtils.getConn();
            System.out.println("Test:" + con);
        } catch (SQLException ex) {
        }

    }

}
