package dao;

import jdbc.JDBCUntil;
import model.ClassModel;
import model.StudentModel;

import java.security.cert.Extension;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ClassDAO implements DaoInterface<ClassModel> {
    public static ClassDAO getInstance() {
        return new ClassDAO();

    }

    @Override
    public int insert(ClassModel classModel) {
        int ketQua = 0;
        try {
            //Step1: tạo Kết nối CSDL
            Connection connection = JDBCUntil.getConnection();

            //Step2: tạo ra đối tượng statement
            Statement statement = connection.createStatement();

            //Step3: thực thi câu lệnh SQL
            String sql = "INSERT INTO class (maClass, nameClass) VALUES (" + classModel.getMaClass() + ",'" + classModel.getNameClass() + "')";
            ketQua = statement.executeUpdate(sql);

            //Step4: test kiểm tra lệnh
            System.out.println("Lệnh được thực thi: " + sql);
            System.out.println("có " + ketQua + " dòng bị thay đổi");

            //Step5: ngắt kết nối
            JDBCUntil.closeConnection(connection);
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return ketQua;
    }

    @Override
    public int update(ClassModel classModel) {
        int ketQua = 0;
        try {
            // Bước 1: tạo kết nối đến CSDL
            Connection connection = JDBCUntil.getConnection();

            // Bước 2: tạo ra đối tượng statement
            Statement statement = connection.createStatement();

            // Bước 3: thực thi câu lệnh SQL
            String sql = "UPDATE class\n" +
                    "SET nameClass = '" + classModel.getNameClass() + "'\n" +
                    "WHERE maClass = " + classModel.getMaClass() + "";
            System.out.println(sql);
            ketQua = statement.executeUpdate(sql);

            // Bước 4: test lệnh sql
            System.out.println("Bạn đã thực thi: " + sql);
            System.out.println("Có " + ketQua + " dòng bị thay đổi!");

            // Bước 5: đóng kết nối đến CSDL
            JDBCUntil.closeConnection(connection);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return ketQua;
    }


    @Override
    public int delete(ClassModel classModel) {
        int ketQua = 0;
        try {
            //Step1: kết nối CSDL
            Connection connection = JDBCUntil.getConnection();

            //Step2: tạo ra đối tượng Statement
            Statement statement = connection.createStatement();

            //Step3: thực thi lệnh SQL
            String sql = "DELETE FROM Class \n" +
                    "WHERE maClass = " + classModel.getMaClass() + "";
            System.out.println(sql);
            ketQua = statement.executeUpdate(sql);

            //Step4: test câu lệnh SQL
            System.out.println("Bạn đã thực thi: " + sql);
            System.out.println("Có " + ketQua + " dòng bị thay đổi!");

            //Step5: ngắt kết nối đến CSDL
            JDBCUntil.closeConnection(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ketQua;
    }

    @Override
    public ArrayList<ClassModel> selectAll() {
        return null;
    }

    @Override
    public ClassModel selectById(ClassModel classModel) {
        return null;
    }

    @Override
    public ArrayList<ClassModel> selectByCondition(String condition) {
        return null;
    }
}
