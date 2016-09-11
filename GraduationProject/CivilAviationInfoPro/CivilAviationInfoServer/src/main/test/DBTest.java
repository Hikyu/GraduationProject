import cauc.kyu.civilaviationinfoserver.utils.DBConnect;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Administrator on 2016/5/6.
 */
public class DBTest {
    @Test
    public void testDBConnect() throws SQLException {
        Connection connection= DBConnect.getInstance().getConnection();
        Statement statement=connection.createStatement();
        String sql="select * from test";
        ResultSet resultSet=statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.print(resultSet.getInt(1));
        }
    }
}
