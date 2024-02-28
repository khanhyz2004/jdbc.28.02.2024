package jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) {
        try {
            //tạo kết nối
            Connection connection = JDBCUntil.getConnection();

            //tạo statement
            Statement statement = connection.createStatement();

            //thực thi câu SQL
            String sql = "insert into students values (2,\"thanh\",18,\"12a2\")";

            //Sử lý kết quả
            int check = statement.executeUpdate(sql);
            System.out.println("số dòng thay đổi: " + check);
            if (check > 0) {
                System.out.println("thêm dữ liệu thành công");
            } else {
                System.out.println("thêm thất bại");
            }

            //ngắt kết nối
            JDBCUntil.closeConnection(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
