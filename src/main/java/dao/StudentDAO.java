package dao;

import model.StudentModel;

import java.util.ArrayList;

public class StudentDAO implements DaoInterface<StudentModel>{
    public static StudentDAO getInstance(){
        return new StudentDAO();
    }
    @Override
    public int insert(StudentModel studentModel) {
        return 0;
    }

    @Override
    public int update(StudentModel studentModel) {
        return 0;
    }

    @Override
    public int delete(StudentModel studentModel) {
        return 0;
    }

    @Override
    public ArrayList<StudentModel> selectAll() {
        return null;
    }

    @Override
    public StudentModel selectById(StudentModel studentModel) {
        return null;
    }

    @Override
    public ArrayList<StudentModel> selectByCondition(String condition) {
        return null;
    }
}