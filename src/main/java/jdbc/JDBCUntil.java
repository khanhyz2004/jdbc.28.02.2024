package jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUntil {
    public static Connection getConnection() {
        Connection c = null;

        try {
//            //đk mySQL driver với DriverMannager
//            DriverManager.registerDriver(new Driver());

            //Thông số
            String url = "jdbc:mySQL://localhost:20304/reviewJDBC";
            String username = "root";
            String password = "root123";
            //
            c = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return c;
    }

    public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("1");
        System.out.println(c);
    }
}
