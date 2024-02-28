package jdbc;

import dao.ClassDAO;
import lombok.Builder;
import lombok.Data;
import model.ClassModel;

@Data
@Builder
public class TestClass {
    public static void main(String[] args) {
        //demo Insert
        // Tạo một đối tượng ClassModel
        ClassModel insertJava = ClassModel.builder().maClass(6).nameClass("JDBC").build();
        // Insert dữ liệu vào DB
        ClassDAO.getInstance().insert(insertJava);





















        //demoUpdate
        ClassModel updateJava = ClassModel.builder().maClass(4).nameClass("Spring Boot").build();
        ClassDAO.getInstance().update(updateJava);


        //demo Delete
        ClassModel deleteJava = ClassModel.builder().maClass(1).build();
        ClassDAO.getInstance().delete(deleteJava);
    }
}
